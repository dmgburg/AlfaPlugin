@file:Suppress("EXTENSION_SHADOWED_BY_MEMBER")

package com.dmgburg.alfa.utils

import com.dmgburg.alfa.domain.Identifier
import com.dmgburg.alfa.psi.*
import com.dmgburg.alfa.reference.AlfaAttributeReference
import com.dmgburg.alfa.reference.AlfaOperatorReference
import com.dmgburg.alfa.reference.AlfaPolicyOrSetReference
import com.dmgburg.alfa.reference.AlfaRuleReference
import com.dmgburg.alfa.utils.Util.noNameElementPlaceholder
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import org.jaxen.saxpath.Operator

fun AlfaPolicySetEntry.getIdentifier(): Identifier? {
    val name = this.policySetName ?: return null
    val result = arrayListOf<String>()
    result.addAll(this.getNamespace())
    result.addAll(name.text.split('.'))
    return Identifier(result)
}

fun AlfaPolicyEntry.getIdentifier(): Identifier? {
    val name = this.policyName ?: return null
    val result = arrayListOf<String>()
    result.addAll(this.getNamespace())
    result.addAll(name.text.split('.'))
    return Identifier(result)
}

fun AlfaRuleEntry.getIdentifier(): Identifier? {
    val name = this.ruleName ?: return null
    val result = arrayListOf<String>()
    result.addAll(this.getNamespace())
    result.addAll(name.text.split('.'))
    return Identifier(result)
}

fun AlfaAttributeDeclaration.getIdentifier(): Identifier? {
    val name = this.attributeName
    val result = arrayListOf<String>()
    result.addAll(this.getNamespace())
    result.addAll(name.text.split('.'))
    return Identifier(result)
}

fun PsiElement.getNamespace(): List<String> {
    var item: PsiElement = this;
    val result = mutableListOf<String>()
    while (item.parent !is AlfaFile) {
        item = item.parent
        if (item is AlfaNamespaceEntry) {
            result.add(item.namespaceName.text)
        }
    }
    result.reverse()
    return result.flatMap { it.split('.') }
}

fun PsiElement.closestBody(): PsiElement {
    var current = this
    while (!current.isIn(Util.wrapperClasses)) {
        current = current.parent;
    }
    return current
}

private fun PsiElement.isIn(wrapperClasses: List<Class<out PsiElement>>): Boolean {
    return wrapperClasses.any { it.isInstance(this) }
}

// Reference util

//TODO: refactor me
fun getReferences(psiElement: PsiElement): Array<PsiReference> {
    return when (psiElement) {
        is AlfaPolicyOrPolicySetRef -> arrayOf(AlfaPolicyOrSetReference(psiElement, TextRange(0, psiElement.getTextLength())))
        is AlfaRuleRef-> arrayOf(AlfaRuleReference(psiElement, TextRange(0, psiElement.getTextLength())))
        is AlfaAttributeRef -> arrayOf(AlfaAttributeReference(psiElement, TextRange(0, psiElement.getTextLength())))
        is AlfaOperator -> arrayOf(AlfaOperatorReference(psiElement,TextRange(0, psiElement.getTextLength())))
        else -> emptyArray()
    }
}

fun getReference(psiElement: PsiElement): PsiReference? {
    val references = getReferences(psiElement)
    if (references.isNotEmpty()) {
        return references[0]
    } else {
        return null
    }
}

//Policy
fun AlfaPolicyEntry.getName(): String {
    return this.policyName?.text ?: noNameElementPlaceholder
}

fun AlfaPolicyEntry.setName(newName: String): PsiElement {
    val nameNode = this.getNode().findChildByType(AlfaTypes.POLICY_NAME)
    if (nameNode != null) {
        throw RuntimeException("keynode is null")
//        val property = AlfaElementFactory.createProperty(element.getProject(), newName)
//        val newKeyNode = property.getFirstChild().getNode()
//        element.getNode().replaceChild(nameNode, newKeyNode)
    }
    return this
}

fun AlfaPolicyEntry.getNameIdentifier(): PsiElement? {
    val keyNode = this.getNode().findChildByType(AlfaTypes.POLICY_NAME)
    if (keyNode != null) {
        return keyNode.getPsi()
    } else {
        return null
    }
}

//Policy set
fun AlfaPolicySetEntry.getName(): String {
    return this.policySetName?.text ?: noNameElementPlaceholder
}

fun setName(element: AlfaPolicySetEntry, newName: String): PsiElement {
    val nameNode = element.getNode().findChildByType(AlfaTypes.POLICY_SET_NAME)
    if (nameNode != null) {
        throw RuntimeException("keynode is null")
//        val property = AlfaElementFactory.createProperty(element.getProject(), newName)
//        val newKeyNode = property.getFirstChild().getNode()
//        element.getNode().replaceChild(nameNode, newKeyNode)
    }
    return element
}

fun AlfaPolicySetEntry.getNameIdentifier(): PsiElement? {
    val keyNode = this.getNode().findChildByType(AlfaTypes.POLICY_SET_NAME)
    if (keyNode != null) {
        return keyNode.getPsi()
    } else {
        return null
    }
}

// Rules

fun AlfaRuleEntry.getName(): String {
    return this.ruleName?.text ?: noNameElementPlaceholder
}

fun setName(element: AlfaRuleEntry, newName: String): PsiElement {
    val nameNode = element.getNode().findChildByType(AlfaTypes.POLICY_SET_NAME)
    if (nameNode != null) {
        throw RuntimeException("keynode is null")
//        val property = AlfaElementFactory.createProperty(element.getProject(), newName)
//        val newKeyNode = property.getFirstChild().getNode()
//        element.getNode().replaceChild(nameNode, newKeyNode)
    }
    return element
}

fun getNameIdentifier(element: AlfaRuleEntry): PsiElement? {
    val keyNode = element.getNode().findChildByType(AlfaTypes.POLICY_SET_NAME)
    if (keyNode != null) {
        return keyNode.getPsi()
    } else {
        return null
    }
}

//Operator

fun AlfaOperatorDeclaration.getName(): String {
    return this.text ?: noNameElementPlaceholder
}

fun setName(element: AlfaOperatorDeclaration, newName: String): PsiElement {
    val nameNode = element.getNode().findChildByType(AlfaTypes.POLICY_SET_NAME)
    if (nameNode != null) {
        throw RuntimeException("keynode is null")
//        val property = AlfaElementFactory.createProperty(element.getProject(), newName)
//        val newKeyNode = property.getFirstChild().getNode()
//        element.getNode().replaceChild(nameNode, newKeyNode)
    }
    return element
}

fun getNameIdentifier(element: AlfaOperatorDeclaration): PsiElement? {
    val keyNode = element.getNode().firstChildNode
    if (keyNode != null) {
        return keyNode.getPsi()
    } else {
        return null
    }
}

object Util {
    val noNameElementPlaceholder = "NoNameElementPlaceholder"
    val wrapperClasses = listOf(AlfaNamespaceBody::class.java, AlfaPolicyBody::class.java, AlfaPolicySetBody::class.java, AlfaRuleBody::class.java, AlfaFile::class.java)
}

