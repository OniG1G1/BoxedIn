package com.example.boxedin.domain

import android.R
import android.util.Log
import com.example.boxedin.domain.model.Session
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/*
    Responsible for:
    - starting sessions
    - ending sessions
    - calculating elapsed time
 */
class SessionManager {

    private val _hasActiveSession = MutableStateFlow(false)
    val hasActiveSession : StateFlow<Boolean> = _hasActiveSession

    private var activeSession: Session? = null

    fun startSession(name: String, duration: Int) {
        activeSession = Session(
            name = name,
            durationMinutes = duration,
            startTimeMillis = System.currentTimeMillis()
        )

        Log.d(
            "SessionManager",
            """
        Session Started
        Name: $name
        Duration: $duration minutes
        Start Time: ${activeSession?.startTimeMillis}
        """.trimIndent()
        )
        _hasActiveSession.value = true
    }

    fun endSession() {
        activeSession = null
        _hasActiveSession.value = false
    }

    fun getProgress() {
        // later
    }
}