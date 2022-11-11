package com.iniyan.tracker_domain.use_case

import com.iniyan.tracker_domain.model.TrackedFood
import com.iniyan.tracker_domain.repository.TrackerRepository
import java.time.LocalDate
import kotlinx.coroutines.flow.Flow

class GetFoodForDate(private val repository: TrackerRepository) {

    operator fun invoke(
        date: LocalDate
    ): Flow<List<TrackedFood>> {
        return repository.getFoodForDate(localDate = date)
    }
}
