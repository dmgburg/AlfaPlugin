package com.dmgburg.alfa

import com.dmgburg.alfa.psi.parser._AlfaLexer
import com.intellij.lexer.FlexAdapter


class AlfaLexerAdapter : FlexAdapter(_AlfaLexer())