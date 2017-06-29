package com.dmgburg.alfa.utils

import com.dmgburg.alfa.AlfaFileType
import com.dmgburg.alfa.psi.*
import com.dmgburg.alfa.psi.impl.AlfaPolicyNameImpl
import com.intellij.lang.ASTNode
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.CompositeElement


fun createPolicyName(project: Project, name: String): AlfaPolicyName {
    val file = createFile(project,
"""
namespace abc {
    policyset abc {
        policy $name {}
    }
}
""")
    return dfs(file, AlfaPolicyName::class.java).first()
}

fun createAttributeName(project: Project, name: String): AlfaAttributeName {
    val file = createFile(project,
"""
namespace abc {
    attribute $name {
        id = "xacmlDeclaration"
        type = string
        category = randomCat
    }
}
""")
    return dfs(file, AlfaAttributeName::class.java).first()
}

//fun createProperty(project: Project, name: String): SimpleProperty {
//    val file = createFile(project, name)
//    return file.getFirstChild() as SimpleProperty
//}
//
//fun createCRLF(project: Project): PsiElement {
//    val file = createFile(project, "\n")
//    return file.getFirstChild()
//}
//
fun createFile(project: Project, text: String): AlfaFile {
    val name = "dummy.alfa"
    return PsiFileFactory.getInstance(project).createFileFromText(name, AlfaFileType.INSTANCE, text) as AlfaFile
}