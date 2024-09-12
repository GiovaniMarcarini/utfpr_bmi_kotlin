package br.edu.utfpr.utfpr_bmi_kotlin.wordreversercompose

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performClick
import br.edu.utfpr.utfpr_bmi_kotlin.WordReverserApp
import org.junit.Rule
import org.junit.Test

class WordReverserComposeTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testWordReverserUI() {
        composeTestRule.setContent {
            WordReverserApp()
        }

        // Digitar uma palavra no TextField
        composeTestRule.onNodeWithText("Insira a Palavra").performTextInput("hello")

        // Clicar no botão "Inverter Palavra"
        composeTestRule.onNodeWithText("Inverter Palavra").performClick()

        // Verificar se a palavra invertida é exibida corretamente
        composeTestRule.onNodeWithText("Palavra Invertida: olleh").assertExists()
    }
}