package com.dmgburg.alfa.psi

import com.dmgburg.alfa.AlfaFileType
import com.dmgburg.alfa.AlfaLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import javax.swing.Icon

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
}