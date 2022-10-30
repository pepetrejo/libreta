package com.pepetrejo.libreta.suma

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
fun SumaScreen(numViewModel: NumViewModel) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Body(Modifier.align(Alignment.Center), numViewModel)
    }
}

@Composable
fun Body(modifier: Modifier, numViewModel: NumViewModel) {
    val num1: String by numViewModel.num1.observeAsState(initial = "")
    val num2: String by numViewModel.num2.observeAsState(initial = "")
    val suma: String by numViewModel.sumatorio.observeAsState(initial = "0")
    Column(modifier = modifier) {
        Numero1(num = num1, backgroundColor = Color.Magenta) {
            numViewModel.onNumChanged(num1 = it,  num2= num2)
        }
Spacer(modifier = Modifier.padding(8.dp))
        Numero1(num = num2, backgroundColor = Color.Blue) {
            numViewModel.onNumChanged(num1= num1, num2 = it)

        }
        Spacer(modifier = Modifier.padding(8.dp))
        MyText(texto = suma)
    }
}

@Composable
fun Numero1(backgroundColor: Color, num: String, onTextChanged: (String) -> Unit) {
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

