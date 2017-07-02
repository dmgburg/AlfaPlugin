package com.dmgburg.alfa.reference

import com.dmgburg.alfa.domain.Identifier
import com.dmgburg.alfa.stubs.*
import com.intellij.extapi.psi.StubBasedPsiElementBase
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.stubs.IStubElementType

interface AlfaNamedElement : PsiNameIdentifierOwner
interface AlfaElementWithIdentifier : AlfaNamedElement {
    fun getIdentifier(): Identifier
}

abstract class AlfaNamedPolicy : StubBasedPsiElementBase<PolicyEntryStub>, AlfaElementWithIdentifier {
    constructor(astNode: ASTNode) : super(astNode);
    constructor(stub: PolicyEntryStub, type: IStubElementType<*, *>) : super(stub, type)
}

abstract class AlfaNamedPolicySet : StubBasedPsiElementBase<PolicySetEntryStub>, AlfaElementWithIdentifier {
    constructor(astNode: ASTNode) : super(astNode);
    constructor(stub: PolicySetEntryStub, type: IStubElementType<*, *>) : super(stub, type)
}

abstract class AlfaNamedRule : StubBasedPsiElementBase<RuleEntryStub>, AlfaElementWithIdentifier {
    constructor(astNode: ASTNode) : super(astNode);
    constructor(stub: RuleEntryStub, type: IStubElementType<*, *>) : super(stub, type)
}

abstract class AlfaNamedAttribute : StubBasedPsiElementBase<AttributeDeclarationStub>, AlfaElementWithIdentifier {
    constructor(astNode: ASTNode) : super(astNode);
    constructor(stub: AttributeDeclarationStub, type: IStubElementType<*, *>) : super(stub, type)
}

abstract class AlfaNamedOperator : StubBasedPsiElementBase<OperatorDeclarationStub>, AlfaNamedElement{
    constructor(astNode: ASTNode) : super(astNode);
    constructor(stub: OperatorDeclarationStub, type: IStubElementType<*, *>) : super(stub, type)
}
