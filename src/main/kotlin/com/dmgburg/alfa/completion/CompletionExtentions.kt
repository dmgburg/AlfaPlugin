package com.dmgburg.alfa.completion

import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.psi.tree.IElementType

fun CompletionResultSet.addElement(type : IElementType) {
    this.addElement(LookupElementBuilder.create(type.toString()))
}

fun CompletionResultSet.addAllElements(tokens: List<IElementType>) {
    this.addAllElements(tokens.map { LookupElementBuilder.create(it.toString()) })
}
