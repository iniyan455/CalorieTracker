package com.iniyan.onboarding_presentation.gender

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iniyan.core.domain.model.Gender
import com.iniyan.core.domain.preferences.Preferences
import com.iniyan.core.navigation.Route
import com.iniyan.core.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

@HiltViewModel
class GenderViewModel @Inject constructor(private val preferences: Preferences) : ViewModel() {
    var selectedGender by mutableStateOf<Gender>(Gender.Male)
        private set
    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    fun onGenderClick(gender: Gender) {
        selectedGender = gender
    }

    fun onNextClick() {
        viewModelScope.launch {
            preferences.saveGender(gender = selectedGender)
            _uiEvent.send(UiEvent.Navigate(Route.AGE))
        }
    }

}
