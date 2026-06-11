package com.example.boxedin.domain

import android.R
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

    fun startSession() {
        _hasActiveSession.value = true
    }

    fun endSession() {
        _hasActiveSession.value = false
    }

    fun getProgress() {
        // later
    }
}