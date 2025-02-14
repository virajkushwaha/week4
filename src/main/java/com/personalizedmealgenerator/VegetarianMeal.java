package com.personalizedmealgenerator;

// Vegetarian Meal Plan
public class VegetarianMeal implements MealPlanInterface {
    private String mealName;

    // Constructor
    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public String getDietType() {
        return "Vegetarian";
    }
}

