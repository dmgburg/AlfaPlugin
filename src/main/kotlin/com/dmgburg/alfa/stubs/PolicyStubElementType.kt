package com.dmgburg.alfa.stubs

import com.dmgburg.alfa.AlfaLanguage
import com.dmgburg.alfa.psi.AlfaPolicyEntry
import com.dmgburg.alfa.psi.AlfaTypes
import com.dmgburg.alfa.psi.impl.AlfaPolicyEntryImpl
import com.intellij.lang.LighterAST
import com.intellij.lang.LighterASTNode
import com.intellij.lang.LighterASTTokenNode
import com.intellij.openapi.project.Project
import com.intellij.psi.impl.source.tree.LightTreeUtil
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.stubs.*
import com.intellij.util.CharTable

class PolicyStubElementType(debugName: String) : ILightStubElementType<PolicyEntryStub, AlfaPolicyEntry>(debugName, AlfaLanguage.INSTANCE) {
    override fun createPsi(stub: PolicyEntryStub): AlfaPolicyEntry {
        return AlfaPolicyEntryImpl(stub, this)
    }

    override fun serialize(stub: PolicyEntryStub, dataStream: StubOutputStream) {
        dataStream.writeName(stub.name)
    }

    override fun createStub(psi: AlfaPolicyEntry, parentStub: StubElement<*>?): PolicyEntryStub {
        return PolicyEntryStub(parentStub,  psi.name)
    }

    override fun createStub(tree: LighterAST, node: LighterASTNode?, parentStub: StubElement<*>?): PolicyEntryStub {
        val keyNode = LightTreeUtil.firstChildOfType(tree, node, AlfaTypes.POLICY_NAME) ?: throw IllegalStateException("Policy without name!")
        val key = intern(tree.getCharTable(), keyNode)
        return PolicyEntryStub(parentStub, key)
    }

    override fun indexStub(stub: PolicyEntryStub, sink: IndexSink) {
        sink.occurrence(PolicyKeyIndex.key, stub.name);
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): PolicyEntryStub {
        val ref = dataStream.readName()
        return PolicyEntryStub(parentStub, ref!!.string)
    }

    override fun getExternalId(): String {
        return "alfa.Policy"
    }

    fun intern(table: CharTable, node: LighterASTNode): String {
        assert(node is LighterASTTokenNode) { node }
        return table.intern((node as LighterASTTokenNode).text).toString()
    }
}

object PolicyKeyIndex : StringStubIndexExtension<AlfaPolicyEntry>() {
    var KEY : StubIndexKey<String, AlfaPolicyEntry>? = null

    init{
        if(KEY == null){
            KEY = StubIndexKey.createIndexKey("alfa.Policy.index")
        }
    }

    override fun getKey(): StubIndexKey<String, AlfaPolicyEntry> {
        return KEY!!
    }

    override fun get(key: String, project: Project, scope: GlobalSearchScope): Collection<AlfaPolicyEntry> {
        return StubIndex.getElements(getKey(), key, project, scope, AlfaPolicyEntry::class.java)
    }
}