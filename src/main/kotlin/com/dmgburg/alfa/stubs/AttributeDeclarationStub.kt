package com.dmgburg.alfa.stubs

import com.dmgburg.alfa.psi.AlfaAttributeDeclaration
import com.dmgburg.alfa.psi.AlfaTypes
import com.intellij.psi.PsiElement
import com.intellij.psi.stubs.StubBase
import com.intellij.psi.stubs.StubElement

class AttributeDeclarationStub(parent: StubElement<*>?, val name: String) : StubBase<AlfaAttributeDeclaration>(parent, AlfaTypes.ATTRIBUTE_DECLARATION)