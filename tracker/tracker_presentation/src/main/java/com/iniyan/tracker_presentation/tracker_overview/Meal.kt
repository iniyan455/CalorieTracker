package com.iniyan.tracker_presentation.tracker_overview

import androidx.annotation.DrawableRes
import com.iniyan.core.util.UiText
import com.iniyan.tracker_domain.model.MealType

// why we are putting kept in presentation module instead of domain layer - This is not needed in data model or dmoain model because this need only to
// show ui in presentation
data class Meal(
    val name: UiText.StringResource,
    @DrawableRes val drawableRes: Int,
    val mealType: MealType,
    val carbs: Int = 0,
    val protein: Int = 0,
    val fat: Int = 0,
    val calories: Int = 0,
    val isExpanded: Boolean = false
)

val defaultMeals = listOf(
    Meal(
        name = UiText.StringResource(com.iniyan.core.R.string.breakfast),
        drawableRes = com.iniyan.core.R.drawable.ic_breakfast,
        mealType = MealType.Breakfast
    ),
    Meal(
        name = UiText.StringResource(com.iniyan.core.R.string.lunch),
        drawableRes = com.iniyan.core.R.drawable.ic_lunch,
        mealType = MealType.Lunch
    ),
    Meal(
        name = UiText.StringResource(com.iniyan.core.R.string.dinner),
        drawableRes = com.iniyan.core.R.drawable.ic_dinner,
        mealType = MealType.Dinner
    ),
    Meal(
        name = UiText.StringResource(com.iniyan.core.R.string.snacks),
        drawableRes = com.iniyan.core.R.drawable.ic_snack,
        mealType = MealType.Snack
    ),
)
