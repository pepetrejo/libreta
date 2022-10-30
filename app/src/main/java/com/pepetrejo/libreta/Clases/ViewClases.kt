package com.pepetrejo.libreta.Clases

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp


@Composable
fun ClasesScreen(clasesViewModel: ClasesViewModel) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Body(Modifier.align(Alignment.Center), clasesViewModel)
    }
}

@Composable
fun Body(modifier: Modifier, clasesViewModel: ClasesViewModel) {
    val ticket: String by clasesViewModel.ticket.observeAsState(initial = "")
    val recuperado: String by clasesViewModel.recuperado.observeAsState(initial = "")
    val pendiente: String by clasesViewModel.pendiente.observeAsState(initial = "")
    val nombre: String by clasesViewModel.nombre.observeAsState(initial = "")

    Column(modifier = modifier) {

        MyText(texto = nombre)
        Spacer(modifier = Modifier.padding(8.dp))

        Numero(num = ticket, backgroundColor = Color.Magenta) {
            clasesViewModel.onDatosChanged(num1 = it,  num2= recuperado)
        }
        Spacer(modifier = Modifier.padding(8.dp))
        Numero(num = recuperado, backgroundColor = Color.Blue) {
            clasesViewModel.onDatosChanged(num1= ticket, num2 = it)

        }
        Spacer(modifier = Modifier.padding(8.dp))
        MyText(texto = "Ticket: $ticket")

        Spacer(modifier = Modifier.padding(8.dp))
        MyText(texto = "Recuperado: $recuperado")

        Spacer(modifier = Modifier.padding(8.dp))
        MyText(texto = "Pendiente: $pendiente")
    }
}

@Composable
fun Numero(backgroundColor: Color, num: String, onTextChanged: (String) -> Unit) {
    TextField(
        value = num,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text(text = "Numero 1") },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFFFFFFFF),
            backgroundColor = backgroundColor,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Composable
fun MyText(texto:String) {
    Text(text = texto, fontWeight = FontWeight.ExtraBold, color = Color.Blue)
}

