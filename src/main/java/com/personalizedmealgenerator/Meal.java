package com.personalizedmealgenerator;

// Generic class to manage any type of MealPlan (Vegetarian, Vegan, Keto, etc.)
class Meal<T extends MealPlanInterface> {
    private T mealType;

    // Constructor
    public Meal(T mealType) {
        this.mealType = mealType;
    }

    // Get Meal Type
    public T getMealType() {
        return mealType;
    }

    // Display Meal Details
    @Override
    public String toString() {
        return "Meal: " + mealType.getMealName() + " | Type: " + mealType.getDietType();
    }
}

