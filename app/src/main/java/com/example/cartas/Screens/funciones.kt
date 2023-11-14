package com.example.cartas.Screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext

@Composable
fun inicio() {

    val context = LocalContext.current
    var cartaBocaAbajo by rememberSaveable { mutableStateOf("abajo") }
    var cartaBocaArriba by rememberSaveable { mutableStateOf("") }


}