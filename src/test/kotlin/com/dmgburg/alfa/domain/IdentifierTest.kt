package com.dmgburg.alfa.domain

import org.junit.Assert.*
import org.junit.Test

class IdentifierTest {
    @Test
    fun testIdentifierMatches(){
        assertTrue(Identifier(listOf("com", "acme", "example", "managers")).matches(listOf("example","managers")))
    }

    @Test
    fun testIdentifierNotMatches(){
        assertFalse(Identifier(listOf("com", "acme", "example", "managers")).matches(listOf("dmgburg","example","managers")))
    }
}
