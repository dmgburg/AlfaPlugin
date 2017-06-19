package com.dmgburg.alfa.completion

import com.dmgburg.alfa.psi.AlfaNamespaceBody
import com.dmgburg.alfa.psi.AlfaTypes.*
import com.dmgburg.alfa.utils.closestBody
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.psi.tree.IElementType
import com.intellij.util.ProcessingContext

object KeywordCompletion : CompletionProvider<CompletionParameters>() {
    public override fun addCompletions(parameters: CompletionParameters,
                                       context: ProcessingContext,
                                       resultSet: CompletionResultSet) {
        val body = parameters.position.closestBody()
        val tokens: List<IElementType> =
                when (body) {
                    is AlfaNamespaceBody -> listOf(NAMESPACE, POLICY, POLICYSET)
//                    is AlfaPolicySetBody -> listOf(POLICY, POLICYSET, TARGET, APPLY, ON)
//                    is AlfaPolicyBody -> listOf(TARGET, APPLY, RULE, ON)
                    else -> emptyList()
                }
        resultSet.addAllElements(tokens)
    }
}

object EffectCompletion : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext?, result: CompletionResultSet) {
        result.addAllElements(listOf(PERMIT, DENY))
    }
}


object RuleBodyCompletion : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext?, result: CompletionResultSet) {
        result.addAllElements(listOf(PERMIT, DENY))
    }
}