package com.example.connexus.ui.home

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

@Composable
fun HomeScreen() {
    var selectedIndex by remember { mutableStateOf(0) }

    val screens = listOf(
        Pair("Feed", Icons.Default.Home),
        Pair("Chat", Icons.Default.Chat),
        Pair("Profile", Icons.Default.Person)
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                screens.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
                        icon = { Icon(item.second, contentDescription = null) },
                        label = { Text(item.first) }
                    )
                }
            }
        }
    ) {
        when (selectedIndex) {
            0 -> FeedScreen()
            1 -> ChatScreen()
            2 -> ProfileScreen()
        }
    }
}