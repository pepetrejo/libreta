package com.pepetrejo.libreta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pepetrejo.libreta.Clases.ClasesScreen
import com.pepetrejo.libreta.Clases.ClasesViewModel
import com.pepetrejo.libreta.Maquina.MaquinaScreen
import com.pepetrejo.libreta.Maquina.MaquinaViewModel
import com.pepetrejo.libreta.suma.NumViewModel
import com.pepetrejo.libreta.suma.SumaScreen
import com.pepetrejo.libreta.ui.theme.LibretaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LibretaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
                        //SumaScreen(NumViewModel())

                        MaquinaScreen(MaquinaViewModel())

                    }


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LibretaTheme {
        Greeting("Android")
    }
}

