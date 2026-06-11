package com.example.boxedin.domain

import android.R

/*
    Responsible for:
    - starting sessions
    - ending sessions
    - calculating elapsed time
 */
class SessionManager {
    fun startSession() {}
    fun endSession() {}

    fun hasActiveSession() : Boolean {
        return false;
    }

    fun getProgress() {}
}