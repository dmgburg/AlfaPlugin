package com.dmgburg.alfa.psi

import com.dmgburg.alfa.AlfaFileType
import com.dmgburg.alfa.utils.getIdentifier
import com.dmgburg.alfa.utils.getNamespace
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

fun findPolicySet(project: Project, name: String): AlfaPolicySetEntry? {
    return findAllPolicySet(project).find { val identifier = it.getIdentifier()
        return@find identifier != null && identifier.matches(name.split('.'))
    }
}

fun findAllPolicySet(project: Project): Collection<AlfaPolicySetEntry> {
    return alfaFiles(project).flatMap { dfs(it, AlfaPolicySetEntry::class.java) }
}

fun findAllPolicySet(project: Project, availableNamespaces: List<String>): Collection<AlfaPolicySetEntry> {
    return findAllPolicySet(project).filter {
        policySet ->  availableNamespaces.any { namespace -> policySet.getNamespace() == namespace.split('.')}
    }
}

fun findPolicy(project: Project, name: String) : AlfaPolicyEntry? {
    return findAllPolicy(project).find {
        val identifier = it.getIdentifier()
        return@find identifier != null && identifier.matches(name.split('.'))
    }
}

fun findAllPolicy(project: Project) : Collection<AlfaPolicyEntry> {
    return alfaFiles(project).flatMap { dfs(it, AlfaPolicyEntry::class.java) }
}

fun findRule(project: Project, name: String) : AlfaRuleEntry?{
    return findAllRules(project).find {
        val identifier = it.getIdentifier()
        return@find identifier != null && identifier.matches(name.split('.'))
    }
}

fun findAllRules(project: Project) : Collection<AlfaRuleEntry> {
    return alfaFiles(project).flatMap { dfs(it, AlfaRuleEntry::class.java) }
}

private fun <T> dfs(psiElement: PsiElement, clazz: Class<T>) : Collection<T>{
    return dfs(hashSetOf(),psiElement,clazz)
}

fun findAllAttributes(project: Project): Collection<AlfaAttributeDeclaration> {
    return alfaFiles(project).flatMap { dfs(it, AlfaAttributeDeclaration::class.java) }
}


fun findAttribute(project: Project, name: String) : AlfaAttributeDeclaration? {
    return findAllAttributes(project).find {
        val identifier = it.getIdentifier()
        return@find identifier != null && identifier.matches(name.split('.'))
    }
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