package com.dmgburg.alfa.stubs

import com.dmgburg.alfa.AlfaLanguage
import com.dmgburg.alfa.psi.AlfaAttributeDeclaration
import com.dmgburg.alfa.psi.AlfaTypes
import com.dmgburg.alfa.psi.impl.AlfaAttributeDeclarationImpl
import com.intellij.lang.LighterAST
import com.intellij.lang.LighterASTNode
import com.intellij.lang.LighterASTTokenNode
import com.intellij.openapi.project.Project
import com.intellij.psi.impl.source.tree.LightTreeUtil
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.stubs.*
import com.intellij.util.CharTable

class AlfaAttributeStubElementType(debugName: String) : ILightStubElementType<AttributeDeclarationStub, AlfaAttributeDeclaration>(debugName, AlfaLanguage.INSTANCE) {
    override fun createPsi(stub: AttributeDeclarationStub): AlfaAttributeDeclaration {
        return AlfaAttributeDeclarationImpl(stub, this)
    }

    override fun serialize(stub: AttributeDeclarationStub, dataStream: StubOutputStream) {
        dataStream.writeName(stub.name)
    }

    override fun createStub(psi: AlfaAttributeDeclaration, parentStub: StubElement<*>?): AttributeDeclarationStub {
        return AttributeDeclarationStub(parentStub,  psi.name)
    }

    override fun createStub(tree: LighterAST, node: LighterASTNode?, parentStub: StubElement<*>?): AttributeDeclarationStub {
        val keyNode = LightTreeUtil.firstChildOfType(tree, node, AlfaTypes.ATTRIBUTE_NAME) ?: throw IllegalStateException("Attribute without name!")
        val key = intern(tree.getCharTable(), keyNode)
        return AttributeDeclarationStub(parentStub, key)
    }

    override fun indexStub(stub: AttributeDeclarationStub, sink: IndexSink) {
        sink.occurrence(AttributeKeyIndex.key, stub.name);
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): AttributeDeclarationStub {
        val ref = dataStream.readName()
        return AttributeDeclarationStub(parentStub, ref!!.string)
    }

    override fun getExternalId(): String {
        return "alfa.attribute"
    }

    fun intern(table: CharTable, node: LighterASTNode): String {
        assert(node is LighterASTTokenNode) { node }
        return table.intern((node as LighterASTTokenNode).text).toString()
    }
}

object AttributeKeyIndex : StringStubIndexExtension<AlfaAttributeDeclaration>() {
    var KEY : StubIndexKey<String, AlfaAttributeDeclaration>? = null

    init{
        if(KEY == null){
            KEY = StubIndexKey.createIndexKey("alfa.attribute.index")
        }
    }

    override fun getKey(): StubIndexKey<String, AlfaAttributeDeclaration> {
        return KEY!!
    }

    override fun get(key: String, project: Project, scope: GlobalSearchScope): Collection<AlfaAttributeDeclaration> {
        return StubIndex.getElements(getKey(), key, project, scope, AlfaAttributeDeclaration::class.java)
    }
}