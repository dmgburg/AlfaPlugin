package com.dmgburg.alfa.coloring

import com.dmgburg.alfa.psi.AlfaTypes.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.*
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.psi.impl.source.tree.ChildRole.CONDITION
import org.apache.log4j.spi.Filter.DENY

class AlfaSyntaxHighlighter : com.intellij.openapi.fileTypes.SyntaxHighlighterBase() {

    override fun getHighlightingLexer(): com.intellij.lexer.Lexer {
        return com.dmgburg.alfa.AlfaLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: com.intellij.psi.tree.IElementType): Array<com.intellij.openapi.editor.colors.TextAttributesKey> {
        return when (tokenType) {
//            NAMESPACE, TARGET, CLAUSE, APPLY, RULE, PERMIT, DENY, CONDITION -> return KEY_KEYS
            POLICY, POLICYSET -> return POLICY_OR_SET_KEYS
            STRING_LITERAL -> VALUE_KEYS
            com.intellij.psi.TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }

    companion object {
        val SEPARATOR = createTextAttributesKey("SIMPLE_SEPARATOR", com.intellij.openapi.editor.DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val KEY = createTextAttributesKey("SIMPLE_KEY", com.intellij.openapi.editor.DefaultLanguageHighlighterColors.KEYWORD)
        val VALUE = createTextAttributesKey("SIMPLE_VALUE", com.intellij.openapi.editor.DefaultLanguageHighlighterColors.STRING)
        val COMMENT = createTextAttributesKey("SIMPLE_COMMENT", com.intellij.openapi.editor.DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", com.intellij.openapi.editor.HighlighterColors.BAD_CHARACTER)
        val POLICY_OR_SET = createTextAttributesKey("SIMPLE_BAD_CHARACTER", DefaultLanguageHighlighterColors.FUNCTION_CALL)

        private val BAD_CHAR_KEYS = arrayOf(com.dmgburg.alfa.coloring.AlfaSyntaxHighlighter.Companion.BAD_CHARACTER)
        private val SEPARATOR_KEYS = arrayOf(com.dmgburg.alfa.coloring.AlfaSyntaxHighlighter.Companion.SEPARATOR)
        private val KEY_KEYS = arrayOf(com.dmgburg.alfa.coloring.AlfaSyntaxHighlighter.Companion.KEY)
        private val VALUE_KEYS = arrayOf(com.dmgburg.alfa.coloring.AlfaSyntaxHighlighter.Companion.VALUE)
        private val COMMENT_KEYS = arrayOf(com.dmgburg.alfa.coloring.AlfaSyntaxHighlighter.Companion.COMMENT)
        private val EMPTY_KEYS = emptyArray<com.intellij.openapi.editor.colors.TextAttributesKey>()
        private val POLICY_OR_SET_KEYS = arrayOf(POLICY_OR_SET)

        val DESCRIPTORS = arrayOf(
                AttributesDescriptor("Key", KEY),
                AttributesDescriptor("Separator", SEPARATOR),
                AttributesDescriptor("Value", VALUE),
                AttributesDescriptor("badCharacter", BAD_CHARACTER),
                AttributesDescriptor("Comment", COMMENT),
                AttributesDescriptor("PolicyOrSet", POLICY_OR_SET)
        )
    }
}
