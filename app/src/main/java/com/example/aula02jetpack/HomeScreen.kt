package com.example.aula02jetpack

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController){
    var nome by rememberSaveable { mutableStateOf("") }

    Column {
        Text(text = "Vc está na tela HOME")
        OutlinedTextField(value = nome , onValueChange = {nome=it})
        Button(onClick = { navController.navigate("login/$nome") }) {
            Text(text = "Ir para Login")
        }
    }

}