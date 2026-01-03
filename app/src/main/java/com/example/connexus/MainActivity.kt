package com.example.connexus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.connexus.navigation.AppNavGraph
import com.example.connexus.ui.theme.ConnexusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConnexusTheme {
                AppNavGraph()
            }
        }
    }
}