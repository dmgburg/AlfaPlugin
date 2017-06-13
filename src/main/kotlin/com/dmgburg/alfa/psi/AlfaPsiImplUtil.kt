package com.dmgburg.alfa.psi

import com.dmgburg.alfa.AlfaFileType
import com.dmgburg.alfa.utils.getIdentifier
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

// TODO: add proper relative namespace handling
fun findPolicySet(project: Project, name: String): AlfaPolicySetEntry? {
    return findAllPolicySet(project).find { name.split('.').last() == it.getIdentifier().name }
}

fun findAllPolicySet(project: Project): Collection<AlfaPolicySetEntry> {
    return alfaFiles(project).flatMap { dfs(it, AlfaPolicySetEntry::class.java) }

}

fun findPolicy(project: Project, name: String) : AlfaPolicyEntry? {
    return findAllPolicy(project).find { name.split('.').last() == it.getIdentifier().name }
}

fun findAllPolicy(project: Project) : Collection<AlfaPolicyEntry> {
    return alfaFiles(project).flatMap { dfs(it, AlfaPolicyEntry::class.java) }
}

private fun <T> dfs(psiElement: PsiElement, clazz: Class<T>) : Collection<T>{
    return dfs(hashSetOf(),psiElement,clazz)
}

private fun <T> dfs(set: MutableSet<T>, psiElement: PsiElement, clazz: Class<T>): Collection<T>{
    psiElement.children.forEach {
        if (clazz.isInstance(it)){
            set.add(it as T);
        }
        dfs(set, it, clazz)
    }
    return set
}