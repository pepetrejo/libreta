package com.pepetrejo.libreta.Maquina

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

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
    val bill5: String by maquinaViewModel.bill5.observeAsState(initial = "")
    val cantidad5: String by maquinaViewModel.cantidad5.observeAsState(initial = "")
    val mon1: String by maquinaViewModel.mon1.observeAsState(initial = "")
    val cantidad1: String by maquinaViewModel.cantidad1.observeAsState(initial = "")
    val mon2: String by maquinaViewModel.mon2.observeAsState(initial = "")
    val cantidad2: String by maquinaViewModel.cantidad2.observeAsState(initial = "")
    val mon050: String by maquinaViewModel.mon050.observeAsState(initial = "")
    val cantidad050: String by maquinaViewModel.cantidad050.observeAsState(initial = "")
    val mon020: String by maquinaViewModel.mon020.observeAsState(initial = "")
    val cantidad020: String by maquinaViewModel.cantidad020.observeAsState(initial = "")
    val mon010: String by maquinaViewModel.mon010.observeAsState(initial = "")
    val cantidad010: String by maquinaViewModel.cantidad010.observeAsState(initial = "")






    Column(modifier = modifier) {

        MyText(texto = nombre)
        Spacer(modifier = Modifier.padding(16.dp))

        MyCard(modifier = Modifier.padding(2.dp).height(100.dp).fillMaxWidth(1f), num = bill50, tipo = "Bill50€", total = cantidad50 , onValueChanged = {maquinaViewModel.onDatosChanged(
            bill50 = it,
            bill20 = bill20,
            bill10 = bill10,
            bill5 = bill5,
            mon2 = mon2,
            mon1 = mon1,
            mon050 = mon050,
            mon020 = mon020,
            mon010 = mon010,
            total = totalInfinity)}
        )

        MyCard(modifier = Modifier.padding(2.dp).height(100.dp).fillMaxWidth(1f), num = bill20, tipo = "Bill20€", total = cantidad20 , onValueChanged = {maquinaViewModel.onDatosChanged(
            bill50 = bill50,
            bill20 = it,
            bill10 = bill10,
            bill5 = bill5,
            mon2 = mon2,
            mon1 = mon1,
            mon050 = mon050,
            mon020 = mon020,
            mon010 = mon010,
            total = totalInfinity)}
        )


        Spacer(modifier = Modifier.padding(2.dp))
        CantidadIn(num = bill10, backgroundColor = Color.LightGray) {
            maquinaViewModel.onDatosChanged(
                bill50 = bill50,
                bill20 = bill20,
                bill10 = it,
                bill5 = bill5,
                mon2 = mon2,
                mon1 = mon1,
                mon050 = mon050,
                mon020 = mon020,
                mon010 = mon010,
                total = totalInfinity
            )
        }

        Spacer(modifier = Modifier.padding(2.dp))
        CantidadIn(num = bill5, backgroundColor = Color.LightGray) {
            maquinaViewModel.onDatosChanged(
                bill50 = bill50,
                bill20 = bill20,
                bill10 = bill10,
                bill5 = it,
                mon2 = mon2,
                mon1 = mon1,
                mon050 = mon050,
                mon020 = mon020,
                mon010 = mon010,
                total = totalInfinity
            )
        }

        Spacer(modifier = Modifier.padding(2.dp))
        CantidadIn(num = mon2, backgroundColor = Color.LightGray) {
            maquinaViewModel.onDatosChanged(
                bill50 = bill50,
                bill20 = bill20,
                bill10 = bill10,
                bill5 = bill5,
                mon2 = it,
                mon1 = mon1,
                mon050 = mon050,
                mon020 = mon020,
                mon010 = mon010,
                total = totalInfinity
            )
        }

        Spacer(modifier = Modifier.padding(2.dp))
        CantidadIn(num = mon1, backgroundColor = Color.LightGray) {
            maquinaViewModel.onDatosChanged(
                bill50 = bill50,
                bill20 = bill20,
                bill10 = bill10,
                bill5 = bill5,
                mon2 = mon2,
                mon1 = it,
                mon050 = mon050,
                mon020 = mon020,
                mon010 = mon010,
                total = totalInfinity
            )
        }

        Spacer(modifier = Modifier.padding(2.dp))
        CantidadIn(num = mon050, backgroundColor = Color.LightGray) {
            maquinaViewModel.onDatosChanged(
                bill50 = bill50,
                bill20 = bill20,
                bill10 = bill10,
                bill5 = bill5,
                mon2 = mon010,
                mon1 = mon1,
                mon050 = it,
                mon020 = mon020,
                mon010 = mon010,
                total = totalInfinity
            )
        }

        Spacer(modifier = Modifier.padding(2.dp))
        CantidadIn(num = mon020, backgroundColor = Color.LightGray) {
            maquinaViewModel.onDatosChanged(
                bill50 = bill50,
                bill20 = bill20,
                bill10 = bill10,
                bill5 = bill5,
                mon2 = mon2,
                mon1 = mon1,
                mon050 = mon050,
                mon020 = it,
                mon010 = mon010,
                total = totalInfinity
            )
        }

        Spacer(modifier = Modifier.padding(2.dp))
        CantidadIn(num = mon010, backgroundColor = Color.LightGray) {
            maquinaViewModel.onDatosChanged(
                bill50 = bill50,
                bill20 = bill20,
                bill10 = bill10,
                bill5 = bill5,
                mon2 = mon2,
                mon1 = mon1,
                mon050 = mon050,
                mon020 = mon020,
                mon010 = it,
                total = totalInfinity
            )
        }


        Spacer(modifier = Modifier.padding(1.dp))
        MyText(texto = "Total 50 es: $cantidad50")

        Spacer(modifier = Modifier.padding(1.dp))
        MyText(texto = "Total 20 es: $cantidad20")

       /* Spacer(modifier = Modifier.padding(1.dp))
        MyText(texto = "Total 10 es: $cantidad10")

        Spacer(modifier = Modifier.padding(1.dp))
        MyText(texto = "Total 5 es: $cantidad5")

        Spacer(modifier = Modifier.padding(1.dp))
        MyText(texto = "Total 2 es: $cantidad2")

        Spacer(modifier = Modifier.padding(1.dp))
        MyText(texto = "Total 1 es: $cantidad1")

        Spacer(modifier = Modifier.padding(1.dp))
        MyText(texto = "Total 0,50 es: $cantidad050")

        Spacer(modifier = Modifier.padding(1.dp))
        MyText(texto = "Total 0,20 es: $cantidad020")

        Spacer(modifier = Modifier.padding(1.dp))
        MyText(texto = "Total 0,10 es: $cantidad010")*/

        Spacer(modifier = Modifier.padding(1.dp))
        MyText(texto = "Total $nombre: $totalInfinity")


    }
}

@OptIn(ExperimentalComposeUiApi::class) //Esto es para keyboardController
@Composable
fun CantidadIn(modifier: Modifier = Modifier.padding(1.dp), backgroundColor: Color, num: String, onTextChanged: (String) -> Unit) {
    val maxChar = 5
    var keyboardController = LocalSoftwareKeyboardController.current // En esta variable se indica ocultar teclado
    TextField(
        value = num,
        textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.End),
        onValueChange = { if(it.length < maxChar){ onTextChanged(it)} },
        modifier = modifier,
        placeholder = { Text(text = "0", textAlign = TextAlign.Center) },
        maxLines = 1,
        singleLine = true,
        keyboardActions = KeyboardActions(onDone = {keyboardController?.hide()}),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFFFFFFFF),
            backgroundColor = backgroundColor,
            focusedIndicatorColor = Color.Blue,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Composable
fun MyText(texto: String) {
    Text(text = texto, fontWeight = FontWeight.ExtraBold, color = Color.Blue)
}


@Composable
fun MyCard( num: String, modifier: Modifier, tipo:String, total:String,onValueChanged: (String) -> Unit) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(1.dp),
        elevation = 8.dp,
        shape = MaterialTheme.shapes.small,
        backgroundColor = Color.Cyan,
        contentColor = Color.Black,
        border = BorderStroke(1.dp, Color.DarkGray)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = tipo, modifier = Modifier
                    .fillMaxWidth(0.3f), textAlign = TextAlign.Start
            )

            CantidadIn(backgroundColor = Color.LightGray, num = num, onTextChanged = onValueChanged, modifier = Modifier.fillMaxWidth(0.5f))

            Text(
                text = total, modifier = Modifier
                    .fillMaxWidth(1f), textAlign = TextAlign.End
            )
        }
    }
}
