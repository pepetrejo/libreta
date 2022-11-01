package com.pepetrejo.libreta.Maquina

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.pepetrejo.libreta.modeloMaquina.infinity

@Composable
fun MaquinaScreen(maquinaViewModel: MaquinaViewModel) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Body(Modifier.align(Alignment.Center), maquinaViewModel)
    }
}

@Composable
fun Body(modifier: Modifier, maquinaViewModel: MaquinaViewModel) {
    val nombre: String by maquinaViewModel.nombre.observeAsState(initial = "")
    val bill50: String by maquinaViewModel.bill50.observeAsState(initial = "")
    val cantidad50: String by maquinaViewModel.cantidad50.observeAsState(initial = "")
    val bill20: String by maquinaViewModel.bill20.observeAsState(initial = "")
    val cantidad20: String by maquinaViewModel.cantidad20.observeAsState(initial = "")
    val bill10: String by maquinaViewModel.bill10.observeAsState(initial = "")
    val cantidad10: String by maquinaViewModel.cantidad10.observeAsState(initial = "")
    val totalInfinity: String by maquinaViewModel.totalInfinity.observeAsState(initial = "")



    Column(modifier = modifier) {


        MyText(texto = nombre)
        Spacer(modifier = Modifier.padding(8.dp))


        Numero(num = bill50, backgroundColor = Color.LightGray) {
            maquinaViewModel.onDatosChanged(bill50 = it, bill20 = bill20, bill10 = bill10, total = totalInfinity)
        }

        Spacer(modifier = Modifier.padding(8.dp))
        Numero(num = bill20, backgroundColor = Color.LightGray) {
            maquinaViewModel.onDatosChanged(bill50 = bill50, bill20 = it, bill10 = bill10, total = totalInfinity)
        }

        Spacer(modifier = Modifier.padding(8.dp))
        Numero(num = bill10, backgroundColor = Color.LightGray) {
            maquinaViewModel.onDatosChanged(bill50 = bill50, bill20 = bill20, bill10 = it, total = totalInfinity)
        }

        Spacer(modifier = Modifier.padding(8.dp))
        MyText(texto = "Total 50 es: $cantidad50")

        Spacer(modifier = Modifier.padding(8.dp))
        MyText(texto = "Total 20 es: $cantidad20")

        Spacer(modifier = Modifier.padding(8.dp))
        MyText(texto = "Total 10 es: $cantidad10")

        Spacer(modifier = Modifier.padding(8.dp))
        MyText(texto = "Total $nombre: $totalInfinity")


        /*
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
        MyText(texto = "Pendiente: $pendiente")*/
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
fun MyText(texto: String) {
    Text(text = texto, fontWeight = FontWeight.ExtraBold, color = Color.Blue)
}

@Composable
fun MyRow(name: String, onTextChanged: (String) -> Unit) {
    Row(
        modifier = Modifier
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = name, modifier = Modifier
                //.weight(2f),
                .width(100.dp)
        )

        Numero(backgroundColor = Color.LightGray, num = "2222") {}
    }
}

@Composable
fun Nombre(backgroundColor: Color, nombre: String, onTextChanged: (String) -> Unit) {
    TextField(
        value = nombre,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text(text = "Numero 1") },
        maxLines = 1,
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFFFFFFFF),
            backgroundColor = backgroundColor,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}