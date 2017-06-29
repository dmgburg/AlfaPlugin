package com.dmgburg.alfa.psi

import com.dmgburg.alfa.AlfaFileType
import com.dmgburg.alfa.reference.AlfaNamedElementWithIdentifier
import com.dmgburg.alfa.utils.getIdentifier
import com.dmgburg.alfa.utils.getNamespace
import com.intellij.openapi.diagnostic.logger
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.search.*
import com.intellij.psi.search.GlobalSearchScope.*
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