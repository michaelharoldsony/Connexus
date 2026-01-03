package com.example.connexus.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.connexus.ui.auth.LoginScreen
import com.example.connexus.ui.auth.SignupScreen
import com.example.connexus.ui.home.HomeScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(
                onLoginSuccess = { navController.navigate("home") },
                onSignupClick = { navController.navigate("signup") }
            )
        }

        composable("signup") {
            SignupScreen(
                onSignupSuccess = { navController.navigate("home") }
            )
        }

        composable("home") {
            HomeScreen()
        }
    }
}