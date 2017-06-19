package com.dmgburg.alfa.completion

import com.dmgburg.alfa.AlfaLanguage
import com.dmgburg.alfa.psi.AlfaNamespaceBody
import com.dmgburg.alfa.psi.AlfaTypes.*
import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.PlatformPatterns.*

class AlfaCompletionContributor : CompletionContributor() {
    init {
        extend(CompletionType.BASIC,
                psiElement(IDENTIFIER).withLanguage(AlfaLanguage.INSTANCE),
                KeywordCompletion
        )
        extend(CompletionType.BASIC,
                psiElement(IDENTIFIER).afterSibling(psiElement(ON)).withLanguage(AlfaLanguage.INSTANCE),
                EffectCompletion
        )
        extend(CompletionType.BASIC,
                psiElement(IDENTIFIER).withParent(psiElement(RULE_BODY)).withLanguage(AlfaLanguage.INSTANCE),
                RuleBodyCompletion
        )
    }

    override fun fillCompletionVariants(parameters: CompletionParameters, result: CompletionResultSet) {
        super.fillCompletionVariants(parameters, result)
    }
}