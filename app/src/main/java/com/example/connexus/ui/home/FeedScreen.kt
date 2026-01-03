package com.example.connexus.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FeedScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Feed", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Posts will appear here.")
    }
}