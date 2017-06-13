package com.dmgburg.alfa.utils

import com.dmgburg.alfa.domain.Identifier
import com.dmgburg.alfa.psi.AlfaFile
import com.dmgburg.alfa.psi.AlfaNamespaceEntry
import com.dmgburg.alfa.psi.AlfaPolicyEntry
import com.dmgburg.alfa.psi.AlfaPolicySetEntry
import com.intellij.psi.PsiElement

fun AlfaPolicySetEntry.getIdentifier() : Identifier {
    val itemNamespace = this.getNamespace()
    return Identifier(itemNamespace,this.policySetName!!.text)
}

fun AlfaPolicyEntry.getIdentifier() : Identifier{
    val itemNamespace = this.getNamespace().flatMap { it.split('.') }
    return Identifier(itemNamespace, this.policyName!!.text)
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

