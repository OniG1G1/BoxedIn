package com.example.boxedin.presentation.setup

import com.example.boxedin.domain.SessionManager

// TODO: implement SetupScreen → calls sessionManager.startSession()
class SetupVM(
    private val sessionManager : SessionManager
) {

    fun startSession(name : String, durationMinutes : Int) {
        sessionManager.startSession(name, durationMinutes)
    }
}
