package com.dmgburg.alfa.completion

import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.psi.tree.IElementType

fun CompletionResultSet.addElement(type : IElementType) {
    this.addElement(LookupElementBuilder.create(type.toString()))
}

@JvmName("addString")
fun CompletionResultSet.addElement(type : String?) {
    if (type != null) {
        this.addElement(LookupElementBuilder.create(type))
    }
}

fun CompletionResultSet.addAllElements(tokens: List<IElementType>) {
    this.addAllElements(tokens.map { LookupElementBuilder.create(it.toString()) })
}

@JvmName("addAllStrings")
fun CompletionResultSet.addAllElements(tokens: List<String>) {
    this.addAllElements(tokens.map { LookupElementBuilder.create(it.toString()) })
}