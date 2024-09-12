package br.edu.utfpr.utfpr_bmi_kotlin.wordreversercompose

import br.edu.utfpr.utfpr_bmi_kotlin.reverseString
import org.junit.Assert.assertEquals
import org.junit.Test

class WordReverserUnitTest {

    @Test
    fun testReverseString() {
        // Verifica se a palavra é invertida corretamente
        assertEquals("olleh", reverseString("hello"))
        assertEquals("rettulf", reverseString("flutter"))
        assertEquals("trad", reverseString("dart"))
    }

    @Test
    fun testReverseEmptyString() {
        // Verifica se uma string vazia é tratada corretamente
        assertEquals("", reverseString(""))
    }
}