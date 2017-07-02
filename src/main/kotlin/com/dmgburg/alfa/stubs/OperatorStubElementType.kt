package com.dmgburg.alfa.stubs

import com.dmgburg.alfa.AlfaLanguage
import com.dmgburg.alfa.psi.AlfaOperatorDeclaration
import com.dmgburg.alfa.psi.AlfaTypes
import com.dmgburg.alfa.psi.impl.AlfaOperatorDeclarationImpl
import com.intellij.lang.LighterAST
import com.intellij.lang.LighterASTNode
import com.intellij.lang.LighterASTTokenNode
import com.intellij.openapi.project.Project
import com.intellij.psi.impl.source.tree.LightTreeUtil
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.stubs.*
import com.intellij.util.CharTable

class OperatorStubElementType(debugName: String) : ILightStubElementType<OperatorDeclarationStub, AlfaOperatorDeclaration>(debugName, AlfaLanguage.INSTANCE) {
    override fun createPsi(stub: OperatorDeclarationStub): AlfaOperatorDeclaration {
        return AlfaOperatorDeclarationImpl(stub, this)
    }

    override fun serialize(stub: OperatorDeclarationStub, dataStream: StubOutputStream) {
        dataStream.writeName(stub.name)
    }

    override fun createStub(psi: AlfaOperatorDeclaration, parentStub: StubElement<*>?): OperatorDeclarationStub {
        return OperatorDeclarationStub(parentStub,  psi.name)
    }

    override fun createStub(tree: LighterAST, node: LighterASTNode?, parentStub: StubElement<*>?): OperatorDeclarationStub {
        val keyNode = LightTreeUtil.firstChildOfType(tree, node, AlfaTypes.POLICY_SET_NAME) ?: throw IllegalStateException("Operator without name!")
        val key = intern(tree.getCharTable(), keyNode)
        return OperatorDeclarationStub(parentStub, key)
    }

    override fun indexStub(stub: OperatorDeclarationStub, sink: IndexSink) {
        sink.occurrence(OperatorKeyIndex.key, stub.name);
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): OperatorDeclarationStub {
        val ref = dataStream.readName()
        return OperatorDeclarationStub(parentStub, ref!!.string)
    }

    override fun getExternalId(): String {
        return "alfa.Operator"
    }

    fun intern(table: CharTable, node: LighterASTNode): String {
        assert(node is LighterASTTokenNode) { node }
        return table.intern((node as LighterASTTokenNode).text).toString()
    }
}

object OperatorKeyIndex : StringStubIndexExtension<AlfaOperatorDeclaration>() {
    var KEY : StubIndexKey<String, AlfaOperatorDeclaration>? = null

    init{
        if(KEY == null){
            KEY = StubIndexKey.createIndexKey("alfa.Operator.index")
        }
    }

    override fun getKey(): StubIndexKey<String, AlfaOperatorDeclaration> {
        return KEY!!
    }

    override fun get(key: String, project: Project, scope: GlobalSearchScope): Collection<AlfaOperatorDeclaration> {
        return StubIndex.getElements(getKey(), key, project, scope, AlfaOperatorDeclaration::class.java)
    }
}