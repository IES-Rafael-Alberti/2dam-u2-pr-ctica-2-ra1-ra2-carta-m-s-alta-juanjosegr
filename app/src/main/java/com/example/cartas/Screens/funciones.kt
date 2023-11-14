package com.example.cartas.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import com.example.cartas.Screens.Baraja.Companion.obtenerNombreRecurso

@Composable
fun Juego() {

    val context = LocalContext.current
    var cartaBocaAbajo by rememberSaveable { mutableStateOf("abajo") }
    var cartaBocaArriba by rememberSaveable {
        mutableStateOf(
            context.resources.getIdentifier(
                cartaBocaAbajo,
                "drawable",
                context.packageName
            )
        )
    }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Image(painter = painterResource(id = cartaBocaArriba), contentDescription = "")
        }
    }
    Row(
        Modifier.padding(20.dp)
    ) {
        Button(
            onClick = {
                Baraja.barajar()
                if (Baraja.listaCartas.size == 0) {
                    Baraja.crearBaraja()
                    cartaBocaAbajo = "abajo"
                }
                val cartaNueva = Baraja.dameCarta()
                cartaBocaAbajo = obtenerNombreRecurso(cartaNueva)
                println("$cartaNueva || $cartaBocaAbajo || ${Baraja.listaCartas.size}")
            }
        ) {
            Text(text = "Dame carta")
        }
        Button(onClick = {
            Baraja.crearBaraja()
            Baraja.barajar()
            cartaBocaAbajo = "abajo"
        }) {
            Text(text = "Barajar")
        }
    }

    LaunchedEffect(cartaBocaAbajo) {
        val carta = context.resources.getIdentifier(cartaBocaAbajo, "drawable", context.packageName)
        cartaBocaArriba = carta
    }


}