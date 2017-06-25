package com.dmgburg.alfa.formatting

import com.dmgburg.alfa.AlfaLanguage
import com.dmgburg.alfa.psi.AlfaTypes
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.codeStyle.CodeStyleSettings


class AlfaFormattingModelBuilder : FormattingModelBuilder {
    override fun createModel(element: PsiElement, settings: CodeStyleSettings): FormattingModel {
        return FormattingModelProvider.createFormattingModelForPsiFile(element.containingFile,
                AlfaBlock(element.node, Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        createSpaceBuilder(settings), 0),
                settings)
    }

    private fun createSpaceBuilder(settings: CodeStyleSettings): SpacingBuilder {
        return SpacingBuilder(settings, AlfaLanguage.INSTANCE)
                .around(AlfaTypes.EQUAL)
                .spaceIf(settings.SPACE_AROUND_EQUALITY_OPERATORS)
                .around(AlfaTypes.ASSIGN)
                .spaceIf(settings.SPACE_AROUND_ASSIGNMENT_OPERATORS)
    }

    override fun getRangeAffectingIndent(file: PsiFile, offset: Int, elementAtOffset: ASTNode): TextRange? {
        return null
    }
}