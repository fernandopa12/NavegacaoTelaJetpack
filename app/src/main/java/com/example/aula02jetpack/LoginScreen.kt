package com.example.aula02jetpack

import android.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun LoginScreen(nome:String){
    Column {
        Text(text = "Vc está na tela de Login..")
        Text(text = "Olá $nome")
    }

}