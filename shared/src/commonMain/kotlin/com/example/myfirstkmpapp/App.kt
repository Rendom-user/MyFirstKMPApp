package com.example.myfirstkmpapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun App() {
    MaterialTheme {
        val platform = getPlatform()

        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Halo, Hezkiel!",
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                text = "NIM: 123140118",
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = "Platform: ${platform.name}",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}