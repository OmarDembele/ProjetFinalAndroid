package com.esmt.cours.projetfinalandroid


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.esmt.cours.projetfinalandroid.feature_product.composables.LoginPage
import com.esmt.cours.projetfinalandroid.feature_product.composables.RegisterPage
import com.esmt.cours.projetfinalandroid.ui.theme.ProjetFinalAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetFinalAndroidTheme {
                LoginApplication()
            }
        }
    }
}
@Composable
fun LoginApplication(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login_page", builder = {
        composable("login_page", content = { LoginPage(navController = navController) })
        composable("register_page", content = { RegisterPage(navController = navController) })
    })
}
}