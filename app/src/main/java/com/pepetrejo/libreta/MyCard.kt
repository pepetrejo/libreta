package com.pepetrejo.libreta


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.pepetrejo.libreta.model.Maquina


@Composable
fun MaquinaView() {
    val context = LocalContext.current
    LazyColumn() {
        items(getDatos()) { maquina ->
            ItemMaquina(maquina = maquina) {
                //Toast.makeText(context,it.name, Toast.LENGTH_SHORT).show()

            }
        }
    }
}

@Composable
fun ItemMaquina(maquina: Maquina, onItemSelected: (Maquina) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { onItemSelected(maquina) },
        elevation = 8.dp,
        shape = MaterialTheme.shapes.small,
        backgroundColor = Color.LightGray,
        contentColor = Color.Black,
        border = BorderStroke(1.dp, Color.DarkGray)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = maquina.name, modifier = Modifier
                    //.weight(2f),
                    .width(100.dp)
            )
            Text(
                text = maquina.ticket.toString(), modifier = Modifier
                    //.weight(2f),
                    .width(100.dp)
            )
            /*Text(
                text = maquina.recuperado.toString(), modifier = Modifier
                    //.weight(2f),
                    .width(100.dp)
            )*/


            //MyTextFieldOutline("Recuperado")
        }
    }
}


// Estas funciones son las que estoy usando
@Composable
fun MyTextFieldOutline(
    modifier: Modifier,
    label: String,
    numero: String,
    num: String,
    onValueChanged: (String) -> Unit
) {
    OutlinedTextField(
        value = numero,
        onValueChange = { onValueChanged(it) },
        modifier = modifier,
        label = { Text(text = label) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Magenta,
            unfocusedBorderColor = Color.Blue,
        ),
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@Composable
fun MyText(name: String) {
    Text(text = name)
}


// Hasta aqui


@Composable
fun MyCard(modifier1: Modifier, number1:String, onValueChanged1:(String)->Unit, modifier2: Modifier,number2:String, onValueChanged2: (String) -> Unit

) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 8.dp,
        shape = MaterialTheme.shapes.small,
        backgroundColor = Color.LightGray,
        contentColor = Color.Black,
        border = BorderStroke(1.dp, Color.DarkGray)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Nombre", modifier = Modifier
                    //.weight(2f),
                    .fillMaxWidth(0.2f)
            )
            MyTextFieldOutline(
                modifier = modifier1,
                label = "numero1",
                numero = number1,
                num = "",
                onValueChanged = onValueChanged1
            )

            MyTextFieldOutline(
                modifier = modifier2,
                label = "numero2",
                numero = number2,
                num = "",
                onValueChanged = onValueChanged2
            )
        }
    }
}
