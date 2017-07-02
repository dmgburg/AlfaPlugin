package com.dmgburg.alfa.stubs

import com.dmgburg.alfa.psi.*
import com.intellij.psi.PsiElement
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubBase
import com.intellij.psi.stubs.StubElement

class AttributeDeclarationStub(parent: StubElement<*>?, val name: String) : StubBase<AlfaAttributeDeclaration>(parent, AlfaTypes.ATTRIBUTE_DECLARATION as IStubElementType<out StubElement<*>, *>?)
class PolicyEntryStub(parent: StubElement<*>?, val name: String) : StubBase<AlfaPolicyEntry>(parent, AlfaTypes.POLICY_ENTRY as IStubElementType<out StubElement<*>, *>?)
class PolicySetEntryStub(parent: StubElement<*>?, val name: String) : StubBase<AlfaPolicySetEntry>(parent, AlfaTypes.POLICY_SET_ENTRY as IStubElementType<out StubElement<*>, *>?)
class RuleEntryStub(parent: StubElement<*>?, val name: String) : StubBase<AlfaRuleEntry>(parent, AlfaTypes.RULE_ENTRY as IStubElementType<out StubElement<*>, *>?)
class OperatorDeclarationStub(parent: StubElement<*>?, val name: String) : StubBase<AlfaOperatorDeclaration>(parent, AlfaTypes.OPERATOR_DECLARATION as IStubElementType<out StubElement<*>, *>?)