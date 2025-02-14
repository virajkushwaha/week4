package com.personalizedmealgenerator;

public class Main {
    public static void main(String[] args) {
        // Create meal plan manager
        MealPlanManagement manager = new MealPlanManagement();

        // Create meal plans for different diets
        Meal<VegetarianMeal> vegMeal = MealPlanner.generateMealPlan(new VegetarianMeal("Grilled Vegetables with Veges soup"));
        Meal<VeganMeal> veganMeal = MealPlanner.generateMealPlan(new VeganMeal("Tofu Stir-Fry with Rice"));
        // Add meals to the plan
        manager.addMeal(vegMeal);
        manager.addMeal(veganMeal);

        // Display all meal plans
        manager.showMeals();
    }
}

