package com.dmgburg.alfa.stubs

import com.dmgburg.alfa.AlfaLanguage
import com.dmgburg.alfa.psi.AlfaPolicySetEntry
import com.dmgburg.alfa.psi.AlfaTypes
import com.dmgburg.alfa.psi.impl.AlfaPolicySetEntryImpl
import com.intellij.lang.LighterAST
import com.intellij.lang.LighterASTNode
import com.intellij.lang.LighterASTTokenNode
import com.intellij.openapi.project.Project
import com.intellij.psi.impl.source.tree.LightTreeUtil
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.stubs.*
import com.intellij.util.CharTable

class PolicySetStubElementType(debugName: String) : ILightStubElementType<PolicySetEntryStub, AlfaPolicySetEntry>(debugName, AlfaLanguage.INSTANCE) {
    override fun createPsi(stub: PolicySetEntryStub): AlfaPolicySetEntry {
        return AlfaPolicySetEntryImpl(stub, this)
    }

    override fun serialize(stub: PolicySetEntryStub, dataStream: StubOutputStream) {
        dataStream.writeName(stub.name)
    }

    override fun createStub(psi: AlfaPolicySetEntry, parentStub: StubElement<*>?): PolicySetEntryStub {
        return PolicySetEntryStub(parentStub,  psi.name)
    }

    override fun createStub(tree: LighterAST, node: LighterASTNode?, parentStub: StubElement<*>?): PolicySetEntryStub {
        val keyNode = LightTreeUtil.firstChildOfType(tree, node, AlfaTypes.POLICY_SET_NAME) ?: throw IllegalStateException("PolicySet without name!")
        val key = intern(tree.getCharTable(), keyNode)
        return PolicySetEntryStub(parentStub, key)
    }

    override fun indexStub(stub: PolicySetEntryStub, sink: IndexSink) {
        sink.occurrence(PolicySetKeyIndex.key, stub.name);
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): PolicySetEntryStub {
        val ref = dataStream.readName()
        return PolicySetEntryStub(parentStub, ref!!.string)
    }

    override fun getExternalId(): String {
        return "alfa.PolicySet"
    }

    fun intern(table: CharTable, node: LighterASTNode): String {
        assert(node is LighterASTTokenNode) { node }
        return table.intern((node as LighterASTTokenNode).text).toString()
    }
}

object PolicySetKeyIndex : StringStubIndexExtension<AlfaPolicySetEntry>() {
    var KEY : StubIndexKey<String, AlfaPolicySetEntry>? = null

    init{
        if(KEY == null){
            KEY = StubIndexKey.createIndexKey("alfa.PolicySet.index")
        }
    }

    override fun getKey(): StubIndexKey<String, AlfaPolicySetEntry> {
        return KEY!!
    }

    override fun get(key: String, project: Project, scope: GlobalSearchScope): Collection<AlfaPolicySetEntry> {
        return StubIndex.getElements(getKey(), key, project, scope, AlfaPolicySetEntry::class.java)
    }
}