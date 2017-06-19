package com.dmgburg.alfa.psi

import com.dmgburg.alfa.AlfaLanguage
import com.intellij.psi.tree.IElementType

class AlfaElementType(name : String) : IElementType(name, AlfaLanguage.INSTANCE)
class AlfaTokenType(val name : String) : IElementType(name, AlfaLanguage.INSTANCE)
