package com.example.boxedin.presentation.setup

import androidx.compose.ui.Modifier

// TODO: wiring SetupScreen button → SessionManager.startSession()
class SetupScreen(modifier: Modifier) {

}

/*
@Composable
fun SetupScreen(
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

            label = {
                Text("Session Name")
            },

            placeholder = {
                Text("e.g. Math Study")
            },

            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = sessionDuration,
            onValueChange = { sessionDuration = it },

            label = {
                Text("Duration (minutes)")
            },

            placeholder = {
                Text("e.g. 60")
            },

            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                // TODO start session
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
        SetupScreen()
    }
}*/