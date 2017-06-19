package com.dmgburg.alfa.utils

import com.dmgburg.alfa.domain.Identifier
import com.dmgburg.alfa.psi.*
import com.intellij.psi.PsiElement

fun AlfaPolicySetEntry.getIdentifier() : Identifier? {
    val name = this.policySetName ?: return null
    val result = arrayListOf<String>()
    result.addAll(this.getNamespace())
    result.addAll(name.text.split('.'))
    return Identifier(result)
}

fun AlfaPolicyEntry.getIdentifier() : Identifier?{
    val name = this.policyName ?: return null
    val result = arrayListOf<String>()
    result.addAll(this.getNamespace())
    result.addAll(name.text.split('.'))
    return Identifier(result)
}

fun PsiElement.getNamespace(): List<String> {
    var item : PsiElement = this;
    val result = mutableListOf<String>()
    while (item.parent !is AlfaFile){
        item = item.parent
        if (item is AlfaNamespaceEntry){
            result.add(item.namespaceName.text)
        }
    }
    result.reverse()
    return result.flatMap { it.split('.') }
}

fun PsiElement.closestBody() : PsiElement{
    var current = this
    while (!current.isIn(Util.wrapperClasses)){
        current = current.parent;
    }
    return current
}

private fun PsiElement.isIn(wrapperClasses: List<Class<out PsiElement>>): Boolean {
    return wrapperClasses.any {it.isInstance(this)}
}

object Util{
    val wrapperClasses = listOf(AlfaNamespaceBody::class.java, AlfaPolicyBody::class.java, AlfaPolicySetBody::class.java, AlfaRuleBody::class.java, AlfaFile::class.java)
}

