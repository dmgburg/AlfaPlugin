package com.dmgburg.alfa.psi

import com.dmgburg.alfa.AlfaFileType
import com.dmgburg.alfa.AlfaLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import javax.swing.Icon
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry
import com.intellij.psi.PsiReference



class AlfaFile(fileViewProvider: FileViewProvider) : PsiFileBase(fileViewProvider, AlfaLanguage.INSTANCE) {
    override fun getFileType(): FileType {
        return AlfaFileType.INSTANCE
    }

    override fun toString(): String {
        return "Alfa file"
    }

    override fun getIcon(flags: Int): Icon? {
        return super.getIcon(flags)
    }

    override fun getReferences(): Array<PsiReference> {
        return ReferenceProvidersRegistry.getReferencesFromProviders(this)
    }
}