package com.example.bloque1_actividadentregable_javiercg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.bloque1_actividadentregable_javiercg.ui.theme.Bloque1_ActividadEntregable_JavierCGTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Bloque1_ActividadEntregable_JavierCGTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Text(
        text = funMessage(10.3f),
        modifier = modifier
    )
}

fun funMessage(input: Any):String {
    var result = when(input) {
        is Int -> "Bienvenido, jugador nº: $input"
        is Float -> if (input > -20.0f && input < 50.0f) {
            "La temperatura hoy es de $input ºC"
        } else {
            "Parece que el termómetro se ha estropeado, marca $input ºC"
        }
        is String -> "Ha llegado un mensaje nuevo: $input"
        is Boolean -> "$input es lo contrario de " + !input
        else -> {"El tipo no coincide"}
    }
    return result
}