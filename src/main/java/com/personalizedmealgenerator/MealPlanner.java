package com.personalizedmealgenerator;

public class MealPlanner {
        // Generic Method to generate a meal plan dynamically
        public static <T extends MealPlanInterface> Meal<T> generateMealPlan(T meal) {
            System.out.println("Generating meal plan for: " + meal.getDietType());
            return new Meal<>(meal);
        }
    }