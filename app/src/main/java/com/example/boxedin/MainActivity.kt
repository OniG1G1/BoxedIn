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
import com.example.boxedin.presentation.session.SessionVM
import com.example.boxedin.presentation.setup.SetupVM
import com.example.boxedin.ui.theme.BoxedInTheme

/*
    1. Host Compose
    2. Ask SessionManager for app state
    3. Show SetupScreen OR SessionScreen
 */
class MainActivity : ComponentActivity() {
    private val sessionManager = SessionManager() // dependency for now, later this may be injected

    private val setupVM =
        SetupVM(sessionManager)

    private val sessionVM =
        SessionVM(sessionManager)

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
                    // consider adding APP STATE when more screens are made
                    if (hasSession) {
                        SessionScreen(
                            sessionVM = sessionVM,
                            modifier = Modifier.padding(innerPadding)
                        )
                    } else {
                        SetupScreen(
                            setupVM = setupVM,
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}
