package com.dmgburg.alfa.formatting

import com.dmgburg.alfa.psi.AlfaTypes
import com.dmgburg.alfa.psi.AlfaTypes.*
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.psi.TokenType
import com.intellij.psi.formatter.common.AbstractBlock
import org.bouncycastle.crypto.tls.CipherType.block

import java.util.ArrayList

class AlfaBlock(node: ASTNode, wrap: Wrap?, alignment: Alignment?, private val spacingBuilder: SpacingBuilder, val intent: Int) : AbstractBlock(node, wrap, alignment) {


    override fun buildChildren(): List<Block> {
        val blocks = ArrayList<Block>()
        var child: ASTNode? = myNode.firstChildNode
        while (child != null) {
            when (child.elementType) {
                TokenType.WHITE_SPACE -> {}
                NAMESPACE_BODY, POLICY_SET_BODY, POLICY_BODY,
                RULE_BODY, ATTRIBUTE_BODY, ADVICE_BODY,
                OBLIGATION_BODY, FUNCTION_BODY,
                OPERATOR_DECLARATION_BODY-> {
                    val block = AlfaBlock(child, Wrap.createWrap(WrapType.NORMAL, true), Alignment.createAlignment(), spacingBuilder, 4)
                    blocks.add(block)
                }
                else ->{
                    val block = AlfaBlock(child, Wrap.createWrap(WrapType.NORMAL, true), Alignment.createAlignment(), spacingBuilder, 0)
                    blocks.add(block)
                }
            }
            child = child.treeNext

        }
        return blocks
    }


    override fun getIndent(): Indent? {
        return Indent.getSpaceIndent(intent)
    }

    override fun getSpacing(child1: Block?, child2: Block): Spacing? {
        return spacingBuilder.getSpacing(this, child1, child2)
    }

    override fun isLeaf(): Boolean {
        return myNode.firstChildNode == null
    }
}