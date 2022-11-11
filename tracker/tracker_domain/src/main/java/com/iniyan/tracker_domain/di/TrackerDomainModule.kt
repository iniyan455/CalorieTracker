package com.iniyan.tracker_domain.di

import com.iniyan.core.domain.preferences.Preferences
import com.iniyan.tracker_domain.repository.TrackerRepository
import com.iniyan.tracker_domain.use_case.CalculateMealNutrients
import com.iniyan.tracker_domain.use_case.DeleteTrackedFood
import com.iniyan.tracker_domain.use_case.GetFoodForDate
import com.iniyan.tracker_domain.use_case.SearchFood
import com.iniyan.tracker_domain.use_case.TrackFood
import com.iniyan.tracker_domain.use_case.TrackerUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object TrackerDomainModule {

    @ViewModelScoped
    @Provides
    fun provideTrackerUsecase(
        repository: TrackerRepository,
        preferences: Preferences
    ): TrackerUseCases {
        return TrackerUseCases(
            trackedFood = TrackFood(repository),
            searchFood = SearchFood(repository),
            getFoodForDate = GetFoodForDate(repository),
            deleteTrackedFood = DeleteTrackedFood(repository),
            calculateMealNutrients = CalculateMealNutrients(preferences)
        )
    }
}
