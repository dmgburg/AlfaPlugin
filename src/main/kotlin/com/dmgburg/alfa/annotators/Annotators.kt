package com.dmgburg.alfa.annotators

import com.dmgburg.alfa.psi.*
import com.dmgburg.alfa.utils.getNamespace
import com.intellij.lang.annotation.*
import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import com.intellij.openapi.editor.colors.CodeInsightColors.ERRORS_ATTRIBUTES

class RefAnnotator : Annotator {
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

        if (element is AlfaAttributeRef) {
            val elementText = element.text
            val attribute = findAttribute(element.project, elementText)
            if (attribute == null){
                val range = TextRange(element.textRange.startOffset, element.textRange.endOffset);
                val annotation = holder.createInfoAnnotation(range, "No attribute with name '$elementText' found")
                annotation.textAttributes = ERRORS_ATTRIBUTES
            }
        }
    }
}

class NoMoreThanOneChildExpectedAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element is AlfaPolicySetEntry) {
            val targets = element.children
                    .filter { psiElement -> psiElement is AlfaPolicySetBody }
                    .map { it.firstChild }.filter { it is AlfaTargetEntry }
            if (targets.size > 1) {
                val unexpectedTarget = targets.last()
                val range = TextRange(unexpectedTarget.textRange.startOffset, unexpectedTarget.textRange.endOffset);
                val annotation = holder.createInfoAnnotation(range, "Policy set can have only one target entry")
                annotation.textAttributes = ERRORS_ATTRIBUTES
            }
        }
        if (element is AlfaPolicySetEntry) {
            val combinationAlgorithms = element.children
                    .filter { psiElement -> psiElement is AlfaPolicySetBody }
                    .map { it.firstChild }.filter { it is AlfaCombinationAlgorithmRef }
            if (combinationAlgorithms.size > 1) {
                val algorithm = combinationAlgorithms.last()
                val range = TextRange(algorithm.textRange.startOffset, algorithm.textRange.endOffset);
                val annotation = holder.createInfoAnnotation(range, "Policy set can have only one combination algorithm")
                annotation.textAttributes = ERRORS_ATTRIBUTES
            }
        }

        if (element is AlfaPolicyEntry) {
            val targets = element.children
                    .filter { psiElement -> psiElement is AlfaPolicyBody }
                    .map { it.firstChild }.filter { it is AlfaTargetEntry }
            if (targets.size > 1) {
                val unexpectedTarget = targets.last()
                val range = TextRange(unexpectedTarget.textRange.startOffset, unexpectedTarget.textRange.endOffset);
                val annotation = holder.createInfoAnnotation(range, "Policy can have only one target entry")
                annotation.textAttributes = ERRORS_ATTRIBUTES
            }
        }
        if (element is AlfaPolicyEntry) {
            val combinationAlgorithms = element.children
                    .filter { psiElement -> psiElement is AlfaPolicyBody }
                    .map { it.firstChild }.filter { it is AlfaCombinationAlgorithmRef }
            if (combinationAlgorithms.size > 1) {
                val algorithm = combinationAlgorithms.last()
                val range = TextRange(algorithm.textRange.startOffset, algorithm.textRange.endOffset);
                val annotation = holder.createInfoAnnotation(range, "Policy can have only one combination algorithm")
                annotation.textAttributes = ERRORS_ATTRIBUTES
            }
        }
    }
}
