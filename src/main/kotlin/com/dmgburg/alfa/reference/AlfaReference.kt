package com.dmgburg.alfa.reference

import com.dmgburg.alfa.AlfaIcons
import com.dmgburg.alfa.psi.*
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import java.util.*


interface AlfaNamedElement : PsiNameIdentifierOwner

abstract class AlfaNamedPolicy(astNode: ASTNode) : ASTWrapperPsiElement(astNode), AlfaNamedElement
abstract class AlfaNamedPolicySet(astNode: ASTNode) : ASTWrapperPsiElement(astNode), AlfaNamedElement
abstract class AlfaNamedRule(astNode: ASTNode) : ASTWrapperPsiElement(astNode), AlfaNamedElement

class AlfaPolicyOrSetReference(psiElement: PsiElement, textRange: TextRange) : PsiReferenceBase<PsiElement>(psiElement, textRange), PsiPolyVariantReference {
    private val key: String = element.text.substring(textRange.getStartOffset(), textRange.getEndOffset())

    override fun resolve(): PsiElement? {
        val resolveResults = multiResolve(false)
        return if (resolveResults.size == 1) resolveResults[0].element else null
    }

    override fun getVariants(): Array<Any> {
        val project = myElement.project
        val policies = findAllPolicy(project)
        val policySets = findAllPolicySet(project)
        val variants = ArrayList<LookupElement>()
        for (policy in policies) {
            if (policy.name.isNotEmpty()) {
                variants.add(LookupElementBuilder.create(policy).withIcon(AlfaIcons.FILE).withTypeText(policy.getContainingFile().getName()))
            }
        }
        for (policySet in policySets) {
            if (policySet.name.isNotEmpty()) {
                variants.add(LookupElementBuilder.create(policySet).withIcon(AlfaIcons.FILE).withTypeText(policySet.getContainingFile().getName()))
            }
        }
        return variants.toTypedArray()

    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val results = ArrayList<ResolveResult>()
        val policy = findPolicy(element.project, key)
        if (policy != null) {
            results.add(PsiElementResolveResult(policy))
        }
        return results.toTypedArray()

    }
}

class AlfaRuleReference(psiElement: PsiElement, textRange: TextRange) : PsiReferenceBase<PsiElement>(psiElement, textRange), PsiPolyVariantReference {
    private val key: String = element.text.substring(textRange.getStartOffset(), textRange.getEndOffset())

    override fun resolve(): PsiElement? {
        val resolveResults = multiResolve(false)
        return if (resolveResults.size == 1) resolveResults[0].element else null
    }

    override fun getVariants(): Array<Any> {
        val project = myElement.project
        val rules = findAllRules(project)
        val variants = ArrayList<LookupElement>()
        for (rule in rules) {
            if (rule.name.isNotEmpty()) {
                variants.add(LookupElementBuilder.create(rule).withIcon(AlfaIcons.FILE).withTypeText(rule.getContainingFile().getName()))
            }
        }
        return variants.toTypedArray()

    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val results = ArrayList<ResolveResult>()
        val policy = findRule(element.project, key)
        if (policy != null) {
            results.add(PsiElementResolveResult(policy))
        }
        return results.toTypedArray()

    }
}

class AlfaAttributeReference(psiElement: PsiElement, textRange: TextRange) : PsiReferenceBase<PsiElement>(psiElement, textRange), PsiPolyVariantReference {
    private val key: String = element.text.substring(textRange.getStartOffset(), textRange.getEndOffset())

    override fun resolve(): PsiElement? {
        val resolveResults = multiResolve(false)
        return if (resolveResults.size == 1) resolveResults[0].element else null
    }

    override fun getVariants(): Array<Any> {
        val project = myElement.project
        val attributes = findAllAttributes(project)
        val variants = ArrayList<LookupElement>()
        for (attribute in attributes) {
            if (attribute.attributeName.text.isNotEmpty()) {
                variants.add(LookupElementBuilder.create(attribute).withIcon(AlfaIcons.FILE).withTypeText(attribute.getContainingFile().getName()))
            }
        }
        return variants.toTypedArray()

    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val results = ArrayList<ResolveResult>()
        val attribute = findAttribute(element.project, key)
        if (attribute != null) {
            results.add(PsiElementResolveResult(attribute))
        }
        return results.toTypedArray()

    }
}