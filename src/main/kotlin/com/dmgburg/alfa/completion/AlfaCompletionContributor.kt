package com.dmgburg.alfa.completion

import com.dmgburg.alfa.AlfaLanguage
import com.dmgburg.alfa.psi.AlfaTypes
import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext

class AlfaCompletionContributor : CompletionContributor() {
    init {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(AlfaTypes.POLICY).withLanguage(AlfaLanguage.INSTANCE),
                object : CompletionProvider<CompletionParameters>() {
                    public override fun addCompletions(parameters: CompletionParameters,
                                                       context: ProcessingContext,
                                                       resultSet: CompletionResultSet) {
                        resultSet.addElement(LookupElementBuilder.create("Hello"))
                    }
                }
        )
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(AlfaLanguage.INSTANCE),
                object : CompletionProvider<CompletionParameters>() {
                    public override fun addCompletions(parameters: CompletionParameters,
                                                       context: ProcessingContext,
                                                       resultSet: CompletionResultSet) {
                        resultSet.addElement(LookupElementBuilder.create("HelloPolicy"))
                    }
                }
        )
    }
}