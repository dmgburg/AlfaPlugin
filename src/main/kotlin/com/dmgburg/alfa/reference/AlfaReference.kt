package com.dmgburg.alfa.reference

import com.dmgburg.alfa.AlfaIcons
import com.dmgburg.alfa.psi.*
import com.dmgburg.alfa.utils.getNamespace
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import java.util.*

class AlfaPolicyOrSetReference(psiElement: PsiElement, textRange: TextRange) : PsiReferenceBase<PsiElement>(psiElement, textRange), PsiPolyVariantReference {
    private val key: String = element.text.substring(textRange.startOffset, textRange.endOffset)

    override fun resolve(): PsiElement? {
        val resolveResults = multiResolve(false)
        return if (resolveResults.size == 1) resolveResults[0].element else null
    }

    override fun getVariants(): Array<Any> {
        val project = myElement.project
        val policies = findAllElements<AlfaPolicyEntry>(project)
        val policySets = findAllElements<AlfaPolicySetEntry>(project)
        val variants = ArrayList<LookupElement>()
        policies.forEach { policy ->
            if (policy.name.isNotEmpty()) {
                variants.add(LookupElementBuilder.create(policy).withIcon(AlfaIcons.FILE).withTypeText(policy.containingFile.name))
            }
        }
        policySets.forEach { policySet ->
            if (policySet.name.isNotEmpty()) {
                variants.add(LookupElementBuilder.create(policySet).withIcon(AlfaIcons.FILE).withTypeText(policySet.containingFile.name))
            }
        }
        return variants.toTypedArray()

    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val results = ArrayList<ResolveResult>()
        val policy = findElement<AlfaPolicyEntry>(element.project, key)
        val policySet = findElement<AlfaPolicySetEntry>(element.project, key)
        if (policy != null) {
            results.add(PsiElementResolveResult(policy))
        }
        if (policySet != null) {
            results.add(PsiElementResolveResult(policySet))
        }
        return results.toTypedArray()

    }
}

class AlfaRuleReference(psiElement: PsiElement, textRange: TextRange) : PsiReferenceBase<PsiElement>(psiElement, textRange), PsiPolyVariantReference {
    private val key: String = element.text.substring(textRange.startOffset, textRange.endOffset)

    override fun resolve(): PsiElement? {
        val resolveResults = multiResolve(false)
        return if (resolveResults.size == 1) resolveResults[0].element else null
    }

    override fun getVariants(): Array<Any> {
        val project = myElement.project
        val rules = findAllElements<AlfaRuleEntry>(project)
        val variants = ArrayList<LookupElement>()
        rules.forEach { rule ->
            if (rule.name.isNotEmpty()) {
                variants.add(LookupElementBuilder.create(rule).withIcon(AlfaIcons.FILE).withTypeText(rule.containingFile.name))
            }
        }
        return variants.toTypedArray()

    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val results = ArrayList<ResolveResult>()
        val policy = findElement<AlfaRuleEntry>(element.project, key)
        if (policy != null) {
            results.add(PsiElementResolveResult(policy))
        }
        return results.toTypedArray()

    }
}

class AlfaAttributeReference(psiElement: PsiElement, textRange: TextRange) : PsiReferenceBase<PsiElement>(psiElement, textRange), PsiPolyVariantReference {
    private val key: String = element.text.substring(textRange.startOffset, textRange.endOffset)

    override fun resolve(): PsiElement? {
        val resolveResults = multiResolve(false)
        return if (resolveResults.size == 1) resolveResults[0].element else null
    }

    override fun getVariants(): Array<Any> {
        val project = myElement.project
        val attributes = findAllElements<AlfaAttributeDeclaration>(project)
        val variants = ArrayList<LookupElement>()
        for (attribute in attributes) {
            if (attribute.attributeName.text.isNotEmpty()) {
                val namespace = attribute.getNamespace()
                for (i in (0..namespace.size - 1)) {
                    var variant = namespace[i]
                    for (j in (i + 1..namespace.size - 1)) {
                        variant += "."
                        variant += namespace[j]
                    }
                    variant += "."
                    variant += attribute.name
                    variants.add(LookupElementBuilder.create(variant).withIcon(AlfaIcons.FILE).withTypeText(attribute.containingFile.name))
                }
                variants.add(LookupElementBuilder.create(attribute).withIcon(AlfaIcons.FILE).withTypeText(attribute.containingFile.name))
            }
        }
        return variants.toTypedArray()

    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val results = ArrayList<ResolveResult>()
        val attribute = findElement<AlfaAttributeDeclaration>(element.project, key)
        if (attribute != null) {
            results.add(PsiElementResolveResult(attribute))
        }
        return results.toTypedArray()

    }
}

class AlfaOperatorReference(psiElement: PsiElement, textRange: TextRange) : PsiReferenceBase<PsiElement>(psiElement, textRange), PsiPolyVariantReference {
    private val key: String = element.text.substring(textRange.startOffset, textRange.endOffset)

    override fun resolve(): PsiElement? {
        val resolveResults = multiResolve(false)
        return if (resolveResults.size == 1) resolveResults[0].element else null
    }

    override fun getVariants(): Array<Any> {
        val project = myElement.project
        val operators = findAllElements<AlfaOperatorDeclaration>(project)
        val variants = ArrayList<LookupElement>()
        operators.forEach { operator ->
            if (operator.text.isNotEmpty()) {
                variants.add(LookupElementBuilder.create(operator).withIcon(AlfaIcons.FILE).withTypeText(operator.containingFile.name))
            }
        }
        return variants.toTypedArray()

    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val results = ArrayList<ResolveResult>()
        val operator = findElement<AlfaOperatorDeclaration>(element.project, key)
        if (operator != null) {
            results.add(PsiElementResolveResult(operator))
        }
        return results.toTypedArray()

    }
}
