package com.dmgburg.alfa.psi

import com.dmgburg.alfa.AlfaFileType
import com.dmgburg.alfa.reference.AlfaNamedElementWithIdentifier
import com.dmgburg.alfa.stubs.AttributeKeyIndex
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.search.*
import com.intellij.psi.search.GlobalSearchScope.*
import com.intellij.psi.stubs.StringStubIndexExtension
import com.intellij.util.indexing.FileBasedIndex

fun alfaFiles(project: Project): List<AlfaFile> {
    return FileBasedIndex.getInstance()
            .getContainingFiles<FileType, Void>(FileTypeIndex.NAME, AlfaFileType.INSTANCE, allScope(project))
            .map { PsiManager.getInstance(project).findFile(it) as AlfaFile }
}

inline fun <reified T : AlfaNamedElementWithIdentifier> findElement(project: Project, name: String) : T? {
        return PsiSearchHelper.SERVICE.getInstance(project)
            .findFilesWithPlainTextWords(name.split('.').last())
            .flatMap { dfs(it, T::class.java) }
            .find {
                val identifier = it.getIdentifier()
                return@find identifier != null && identifier.matches(name.split('.'))
            }
}

inline fun <reified T : AlfaNamedElementWithIdentifier> findAllElements(project: Project) : List<T> {
    return alfaFiles(project).flatMap { dfs(it, T::class.java) }
}


inline fun <reified T : AlfaNamedElementWithIdentifier> findElementFromIndex(project: Project, name: String): T? {
    val results : MutableCollection<T> = getStubIndex<T>().get(name.split('.').last(), project, GlobalSearchScope.allScope(project))
    return results.first()
}

inline fun <reified T : AlfaNamedElementWithIdentifier> findAllElementsFromIndex(project: Project): List<T> {
    val results = getStubIndex<T>().getAllKeys(project).flatMap {
        name ->  getStubIndex<T>().get(name.split('.').last(), project, GlobalSearchScope.allScope(project))
    }
    return results
}

inline fun <reified T : PsiElement> getStubIndex(): StringStubIndexExtension<T> {
    return when (T::class.java) {
        AlfaAttributeDeclaration::class.java -> AttributeKeyIndex as StringStubIndexExtension<T>
        else -> throw IllegalArgumentException("Unexpetced type: ${T::class.java}")
    }
}

fun <T> dfs(psiElement: PsiElement, clazz: Class<T>): Collection<T> {
    return dfs(hashSetOf(), psiElement, clazz)
}


fun findAllOperators(project: Project): Collection<AlfaOperatorDeclaration> {
    return alfaFiles(project).flatMap { dfs(it, AlfaOperatorDeclaration::class.java) }
}


fun findOperator(project: Project, name: String): AlfaOperatorDeclaration? {
    return findAllOperators(project).find {
        val symbol = it.operator.text
        return@find symbol == name
    }
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