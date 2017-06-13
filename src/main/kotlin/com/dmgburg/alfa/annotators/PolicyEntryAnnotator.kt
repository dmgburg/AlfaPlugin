package com.dmgburg.alfa.annotators

import com.dmgburg.alfa.psi.AlfaPolicyOrPolicySetRef
import com.dmgburg.alfa.psi.findPolicy
import com.dmgburg.alfa.psi.findPolicySet
import com.dmgburg.alfa.utils.getNamespace
import com.intellij.lang.annotation.*
import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors



class PolicyEntryAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {

        if (element is AlfaPolicyOrPolicySetRef) {
            element.getNamespace()
            val policySet = findPolicySet(element.project, element.text)
            val policy = findPolicy(element.project, element.text)
            if (policy == null && policySet == null){
                val range = TextRange(element.textRange.startOffset, element.textRange.endOffset);
                val annotation = holder.createInfoAnnotation(range, null)
                annotation.textAttributes = DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE
            }
        }
    }
}
