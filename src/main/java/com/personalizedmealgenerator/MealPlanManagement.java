package com.personalizedmealgenerator;
import java.util.ArrayList;
import java.util.List;

public class MealPlanManagement {
        private List<Meal<? extends MealPlanInterface>> meals; // Allows any MealPlan type

        // Constructor
        public MealPlanManagement() {
            meals = new ArrayList<>();
        }

        // Add a meal to the plan
        public void addMeal(Meal<? extends MealPlanInterface> meal) {
            meals.add(meal);
        }

        // Display all meals
        public void showMeals() {
            System.out.println("\n--- Personalized Meal Plan ---");
            for (Meal<? extends MealPlanInterface> meal : meals) {
                System.out.println(meal);
            }
        }
    }