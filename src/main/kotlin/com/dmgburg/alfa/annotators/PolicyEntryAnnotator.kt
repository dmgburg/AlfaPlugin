package com.dmgburg.alfa.annotators

import com.dmgburg.alfa.psi.AlfaPolicyOrPolicySetRef
import com.dmgburg.alfa.psi.findPolicy
import com.dmgburg.alfa.psi.findPolicySet
import com.dmgburg.alfa.utils.getNamespace
import com.intellij.lang.annotation.*
import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import com.intellij.openapi.editor.colors.CodeInsightColors.ERRORS_ATTRIBUTES

class PolicyEntryAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element is AlfaPolicyOrPolicySetRef) {
            val elementText = element.text
            val policySet = findPolicySet(element.project, elementText)
            val policy = findPolicy(element.project, elementText)
            if (policy == null && policySet == null){
                val range = TextRange(element.textRange.startOffset, element.textRange.endOffset);
                val annotation = holder.createInfoAnnotation(range, "No policy or policySet with name '$elementText' found")
                annotation.textAttributes = ERRORS_ATTRIBUTES
            }
        }
    }
}
