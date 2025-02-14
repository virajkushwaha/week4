package com.personalizedmealgenerator;

// Vegan Meal Plan
class VeganMeal implements MealPlanInterface {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public String getDietType() {
        return "Vegan";
    }
}

