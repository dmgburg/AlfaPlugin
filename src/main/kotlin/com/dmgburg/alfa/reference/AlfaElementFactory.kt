package com.dmgburg.alfa.reference

import com.dmgburg.alfa.psi.AlfaFile
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory

//object AlfaElementFactory {
//    fun createProperty(project: Project, name: String, value: String): SimpleProperty {
//        val file = createFile(project, name + " = " + value)
//        return file.getFirstChild() as SimpleProperty
//    }
//
//    fun createProperty(project: Project, name: String): SimpleProperty {
//        val file = createFile(project, name)
//        return file.getFirstChild() as SimpleProperty
//    }
//
//    fun createCRLF(project: Project): PsiElement {
//        val file = createFile(project, "\n")
//        return file.getFirstChild()
//    }
//
//    fun createFile(project: Project, text: String): AlfaFile {
//        val name = "dummy.simple"
//        return PsiFileFactory.getInstance(project).createFileFromText(name, SimpleFileType.INSTANCE, text) as SimpleFile
//    }
//}
