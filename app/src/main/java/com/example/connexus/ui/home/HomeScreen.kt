package com.example.connexus.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen() {
    var selectedIndex by remember { mutableStateOf(0) }

    val screens = listOf(
        Pair("Feed", Icons.Filled.Home),
        Pair("Chat", Icons.Filled.Send),
        Pair("Profile", Icons.Filled.Person)
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
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            when (selectedIndex) {
                0 -> FeedScreen()
                1 -> ChatScreen()
                2 -> ProfileScreen()
            }
        }
    }
}