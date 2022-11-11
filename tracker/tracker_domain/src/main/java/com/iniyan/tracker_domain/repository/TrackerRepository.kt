package com.iniyan.tracker_domain.repository

import com.iniyan.tracker_domain.model.TrackableFood
import com.iniyan.tracker_domain.model.TrackedFood
import java.time.LocalDate
import kotlinx.coroutines.flow.Flow

// creating for it why because later on we can create a fake repo for testing purpose. we don't want to test with actual database or real thing.
//instead of the actual repo we can simulate it expected behaviours.
interface TrackerRepository {

    suspend fun searchFood(
        query: String,
        page: Int,
        pageSize: Int
    ): Result<List<TrackableFood>>

    suspend fun insertTrackedFood(food: TrackedFood)
    suspend fun deleteTrackedFood(food: TrackedFood)
    fun getFoodForDate(localDate: LocalDate) : Flow<List<TrackedFood>>
}
