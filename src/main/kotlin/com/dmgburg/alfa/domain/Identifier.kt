package com.dmgburg.alfa.domain

data class Identifier(val identifier: List<String>) {
    fun matches(that: List<String>) : Boolean {
        if (that.isEmpty()){
            return false
        }
        val start = identifier.lastIndexOf(that[0])
        if (that.size != identifier.size - start){
            return false
        }

        (0.. that.size - 1).forEach{ i ->
            if (identifier[start + i] != that[i]){
                return false
            }
        }
        return true
    }
}