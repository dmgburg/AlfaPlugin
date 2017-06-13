package com.dmgburg.alfa

import com.intellij.lang.Language

class AlfaLanguage private constructor() : Language("Alfa") {
    companion object {
        val INSTANCE = AlfaLanguage()
    }
}