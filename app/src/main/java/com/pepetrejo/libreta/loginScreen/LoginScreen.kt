package com.pepetrejo.libreta.loginScreen

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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel

@Composable
fun LoginScreen(loginViewModel: ViewModel) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(8.dp)) {
        Body(Modifier.align(Alignment.Center), loginViewModel = LoginViewModel())
    }
}

@Composable
fun Body(modifier: Modifier, loginViewModel: LoginViewModel) {
    val email:String by loginViewModel.email.observeAsState(initial = "")
    Column(modifier = modifier) {
        Email(email) {
            loginViewModel.onLoginChanged(it)
        }

    }
}

@Composable
fun Email(email: String, onTextChanged: (String) -> Unit) {
    TextField(
        value = email,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text(text = "Email") },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFFB2B2B2),
            backgroundColor = Color(0xFFFAFAFA),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}