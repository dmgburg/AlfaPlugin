package com.dmgburg.alfa

import com.dmgburg.alfa.psi.AlfaFile
import com.dmgburg.alfa.psi.AlfaStubFile
import com.dmgburg.alfa.psi.AlfaTypes
import com.dmgburg.alfa.psi.parser.AlfaParser
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.lang.ParserDefinition.SpaceRequirements
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.lang.PsiParser
import com.intellij.psi.tree.TokenSet
import com.intellij.lang.ParserDefinition
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IStubFileElementType


class AlfaParserDefinition : ParserDefinition {

    override fun createLexer(project: Project): Lexer {
        return AlfaLexerAdapter()
    }

    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createParser(project: Project): PsiParser {
        return AlfaParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return AlfaFile(viewProvider)
    }

    override fun spaceExistanceTypeBetweenTokens(left: ASTNode, right: ASTNode): SpaceRequirements {
        return SpaceRequirements.MAY
    }

    override fun createElement(node: ASTNode): PsiElement {
        return AlfaTypes.Factory.createElement(node)
    }

    companion object {
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS = TokenSet.create(AlfaTypes.LINE_COMMENT, AlfaTypes.BLOCK_COMMENT)

        val FILE = IStubFileElementType<AlfaStubFile>(AlfaLanguage.INSTANCE)
    }
}
