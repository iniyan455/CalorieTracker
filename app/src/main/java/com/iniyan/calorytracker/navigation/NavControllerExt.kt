package com.iniyan.calorytracker.navigation

import androidx.navigation.NavController
import com.iniyan.core.util.UiEvent

fun NavController.navigate(events: UiEvent.Navigate) {
    this.navigate(events.route)
}
