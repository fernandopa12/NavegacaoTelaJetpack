package com.example.aula02jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.aula02jetpack.ui.theme.Aula02JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula02JetpackTheme {
                val navController = rememberNavController()

                NavHost(navController = navController , startDestination = "home"){
                    composable(route="login/{nome}", arguments = listOf(
                        navArgument("nome"){
                            type = NavType.StringType
                            defaultValue = ""
                            nullable = true
                        }
                    )){
                        LoginScreen(nome = it.arguments?.getString("nome")?:"")
                    }
                    composable(route="home") {
                        HomeScreen(navController)
                    }
                }
            }
        }
    }
}

