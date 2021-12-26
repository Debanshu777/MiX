package com.debanshu777.mix

import android.app.Application
import com.google.android.material.color.DynamicColors

class MiXApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // Apply dynamic color
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}