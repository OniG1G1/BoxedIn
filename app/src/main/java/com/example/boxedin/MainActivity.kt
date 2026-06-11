package com.example.boxedin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.boxedin.domain.SessionManager
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.boxedin.presentation.setup.SetupScreen
import com.example.boxedin.presentation.session.SessionScreen
import com.example.boxedin.ui.theme.BoxedInTheme
/*
    1. Host Compose
    2. Ask SessionManager for app state
    3. Show SetupScreen OR SessionScreen
 */

class MainActivity : ComponentActivity() {
    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BoxedInTheme { // Sets the theme specified in ui.theme

                // Creating a simple Scaffold
                // Layout for the application
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SetupScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }*/

    // dependency for now, later this may be injected
    private val sessionManager = SessionManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            BoxedInTheme {

                val hasSession by sessionManager
                    .hasActiveSession
                    .collectAsState()

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    if (hasSession) {
                        SessionScreen(
                            modifier = Modifier.padding(innerPadding)
                        )
                    } else {
                        SetupScreen(
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}
