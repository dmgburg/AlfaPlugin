package com.dmgburg.alfa

import com.intellij.openapi.fileTypes.*

class AlfaFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(fileTypeConsumer: FileTypeConsumer) {
        fileTypeConsumer.consume(AlfaFileType.INSTANCE, "alfa")
    }
}