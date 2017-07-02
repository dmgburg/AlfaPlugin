package com.dmgburg.alfa.psi

import com.dmgburg.alfa.AlfaFileType
import com.dmgburg.alfa.reference.AlfaElementWithIdentifier
import com.dmgburg.alfa.stubs.*
import com.intellij.extapi.psi.StubBasedPsiElementBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.StubBasedPsiElement
import com.intellij.psi.search.*
import com.intellij.psi.search.GlobalSearchScope.*
import com.intellij.psi.stubs.StringStubIndexExtension
import com.intellij.util.indexing.FileBasedIndex

fun alfaFiles(project: Project): List<AlfaFile> {
    return FileBasedIndex.getInstance()
            .getContainingFiles<FileType, Void>(FileTypeIndex.NAME, AlfaFileType.INSTANCE, allScope(project))
            .map { PsiManager.getInstance(project).findFile(it) as AlfaFile }
}

inline fun <reified T : StubBasedPsiElement<*>> findElement(project: Project, name: String): T? {
    val results : MutableCollection<T> = getStubIndex<T>().get(name.split('.').last(), project, GlobalSearchScope.allScope(project))
    return if (results.isEmpty()) null else results.first()
}

inline fun <reified T : StubBasedPsiElement<*>> findAllElements(project: Project): List<T> {
    val results = getStubIndex<T>().getAllKeys(project).flatMap {
        name ->  getStubIndex<T>().get(name.split('.').last(), project, GlobalSearchScope.allScope(project))
    }
    return results
}

inline fun <reified T : PsiElement> getStubIndex(): StringStubIndexExtension<T> {
    return when (T::class.java) {
        AlfaAttributeDeclaration::class.java -> AttributeKeyIndex as StringStubIndexExtension<T>
        AlfaPolicySetEntry::class.java -> PolicySetKeyIndex as StringStubIndexExtension<T>
        AlfaPolicyEntry::class.java -> PolicyKeyIndex as StringStubIndexExtension<T>
        AlfaRuleEntry::class.java -> RuleKeyIndex as StringStubIndexExtension<T>
        AlfaOperatorDeclaration::class.java -> OperatorKeyIndex as StringStubIndexExtension<T>
        else -> throw IllegalArgumentException("Unexpetced type: ${T::class.java}")
    }
}

fun <T> dfs(psiElement: PsiElement, clazz: Class<T>): Collection<T> {
    return dfs(hashSetOf(), psiElement, clazz)
}

private fun <T> dfs(set: MutableSet<T>, psiElement: PsiElement, clazz: Class<T>): Collection<T> {
    psiElement.children.forEach {
        if (clazz.isInstance(it)) {
            set.add(it as T);
        }
        dfs(set, it, clazz)
    }
    return set
}