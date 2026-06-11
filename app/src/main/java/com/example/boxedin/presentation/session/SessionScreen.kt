package com.example.boxedin.presentation.session

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.boxedin.domain.SessionManager
import com.example.boxedin.presentation.setup.SetupVM

@Composable
fun SessionScreen(
    sessionVM: SessionVM,
    modifier: Modifier = Modifier
) {
    Log.d("SessionScreen",
        "Session Screen is now visible."
    )
}
