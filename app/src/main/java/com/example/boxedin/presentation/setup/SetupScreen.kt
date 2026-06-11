package com.example.boxedin.presentation.setup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.boxedin.domain.SessionManager
import com.example.boxedin.ui.theme.BoxedInTheme

// Text is lost upon rotation
@Composable
fun SetupScreen(
    setupVM: SetupVM,
    modifier: Modifier = Modifier
) {
    var sessionName by remember {
        mutableStateOf("")
    }

    var sessionDuration by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "BoxedIn",
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            value = sessionName,
            onValueChange = { sessionName = it },
            label = { Text("Session Name") },
            placeholder = { Text("e.g. Math Study") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = sessionDuration,
            onValueChange = { sessionDuration = it },
            label = { Text("Duration (minutes)") },
            placeholder = { Text("e.g. 60") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                val duration = sessionDuration.toIntOrNull()

                if (duration != null && duration > 0) {
                    setupVM.startSession(
                        sessionName,
                        duration
                    )
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Start Session")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSetupScreen() {
    BoxedInTheme {
        SetupScreen(
            setupVM = SetupVM(
                SessionManager()
            )
        )
    }
}

