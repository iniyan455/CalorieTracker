package com.iniyan.tracker_domain.use_case

import com.iniyan.tracker_domain.model.TrackedFood

data class TrackerUseCases(
    val trackedFood: TrackFood,
    val searchFood: SearchFood,
    val getFoodForDate: GetFoodForDate,
    val deleteTrackedFood: DeleteTrackedFood,
    val calculateMealNutrients: CalculateMealNutrients
)
