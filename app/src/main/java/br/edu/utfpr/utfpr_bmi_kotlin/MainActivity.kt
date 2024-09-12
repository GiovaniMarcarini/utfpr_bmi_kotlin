package br.edu.utfpr.utfpr_bmi_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import br.edu.utfpr.utfpr_bmi_kotlin.ui.theme.WordReverserComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WordReverserComposeTheme {
                WordReverserApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WordReverserApp() {
    var word by remember { mutableStateOf(TextFieldValue("")) }
    var reversedWord by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Inversor de Palavras") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = word,
                onValueChange = { word = it },
                label = { Text("Insira a Palavra") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { reversedWord = reverseString(word.text) }) {
                Text("Inverter Palavra")
            }
            Spacer(modifier = Modifier.height(16.dp))
            if (reversedWord.isNotEmpty()) {
                Text("Palavra Invertida: $reversedWord", style = MaterialTheme.typography.headlineMedium)
            }
        }
    }
}

fun reverseString(word: String): String {
    return word.reversed()
}