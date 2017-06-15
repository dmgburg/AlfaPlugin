package com.dmgburg.alfa.coloring

import com.dmgburg.alfa.AlfaIcons
import com.dmgburg.alfa.coloring.AlfaSyntaxHighlighter.Companion.DESCRIPTORS
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.*
import org.jetbrains.annotations.*

import javax.swing.*

class AlfaColorSettingsPage : ColorSettingsPage {

    override fun getIcon(): Icon? {
        return AlfaIcons.FILE
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return AlfaSyntaxHighlighter()
    }

    override fun getDemoText(): String {
        return """
namespace com.acme{
	namespace example{
		/**
		 * A policy about what managers can do. It is linked to from the
		 * documents policy set.
		 */
		policy managers{
			target clause role == "manager"
			apply firstApplicable
			rule allowSameDepartment{
				condition user.department == document.department
				permit
			}
		}
	}

	/**
	 * The main policy. It references the managers policy
	 */
	policyset documents{
		target clause resourceType == "document"
		apply firstApplicable
		// The following is a policy reference
		example.managers
	}
}
"""
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): String {
        return "Alfa"
    }
}