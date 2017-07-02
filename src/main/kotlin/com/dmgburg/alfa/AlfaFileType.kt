package com.dmgburg.alfa

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import org.jetbrains.annotations.*

import javax.*
import javax.swing.*

class AlfaFileType private constructor() : LanguageFileType(AlfaLanguage.INSTANCE) {

    override fun getName(): String {
        return "Alfa file"
    }

    override fun getDescription(): String {
        return "Alfa language file"
    }

    override fun getDefaultExtension(): String {
        return "alfa"
    }

    override fun getIcon(): Icon? {
        return AlfaIcons.FILE
    }

    companion object {
        val INSTANCE = AlfaFileType()
    }
}

class AlfaFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer) {
        consumer.consume(AlfaFileType.INSTANCE, "alfa")
    }

}
