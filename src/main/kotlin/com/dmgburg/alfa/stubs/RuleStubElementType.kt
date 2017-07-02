package com.dmgburg.alfa.stubs

import com.dmgburg.alfa.AlfaLanguage
import com.dmgburg.alfa.psi.AlfaRuleEntry
import com.dmgburg.alfa.psi.AlfaTypes
import com.dmgburg.alfa.psi.impl.AlfaRuleEntryImpl
import com.intellij.lang.LighterAST
import com.intellij.lang.LighterASTNode
import com.intellij.lang.LighterASTTokenNode
import com.intellij.openapi.project.Project
import com.intellij.psi.impl.source.tree.LightTreeUtil
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.stubs.*
import com.intellij.util.CharTable

class RuleStubElementType(debugName: String) : ILightStubElementType<RuleEntryStub, AlfaRuleEntry>(debugName, AlfaLanguage.INSTANCE) {
    override fun createPsi(stub: RuleEntryStub): AlfaRuleEntry {
        return AlfaRuleEntryImpl(stub, this)
    }

    override fun serialize(stub: RuleEntryStub, dataStream: StubOutputStream) {
        dataStream.writeName(stub.name)
    }

    override fun createStub(psi: AlfaRuleEntry, parentStub: StubElement<*>?): RuleEntryStub {
        return RuleEntryStub(parentStub,  psi.name)
    }

    override fun createStub(tree: LighterAST, node: LighterASTNode?, parentStub: StubElement<*>?): RuleEntryStub {
        val keyNode = LightTreeUtil.firstChildOfType(tree, node, AlfaTypes.RULE_NAME) ?: throw IllegalStateException("Rule without name!")
        val key = intern(tree.getCharTable(), keyNode)
        return RuleEntryStub(parentStub, key)
    }

    override fun indexStub(stub: RuleEntryStub, sink: IndexSink) {
        sink.occurrence(RuleKeyIndex.key, stub.name);
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): RuleEntryStub {
        val ref = dataStream.readName()
        return RuleEntryStub(parentStub, ref!!.string)
    }

    override fun getExternalId(): String {
        return "alfa.Rule"
    }

    fun intern(table: CharTable, node: LighterASTNode): String {
        assert(node is LighterASTTokenNode) { node }
        return table.intern((node as LighterASTTokenNode).text).toString()
    }
}

object RuleKeyIndex : StringStubIndexExtension<AlfaRuleEntry>() {
    var KEY : StubIndexKey<String, AlfaRuleEntry>? = null

    init{
        if(KEY == null){
            KEY = StubIndexKey.createIndexKey("alfa.Rule.index")
        }
    }

    override fun getKey(): StubIndexKey<String, AlfaRuleEntry> {
        return KEY!!
    }

    override fun get(key: String, project: Project, scope: GlobalSearchScope): Collection<AlfaRuleEntry> {
        return StubIndex.getElements(getKey(), key, project, scope, AlfaRuleEntry::class.java)
    }
}