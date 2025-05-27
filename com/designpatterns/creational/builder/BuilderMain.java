package com.designpatterns.creational.builder;

public class BuilderMain {
    public static void main(String[] ignoredArgs) {
        // Build the meal
        Meal meal = new MealBuilder("Grilled Chicken", "Caesar Salad", "Iced Tea")
                .setDessert("Chocolate Cake")
                .setAppetizer("Bruschetta").build();

        // Display the meal details
        meal.displayMeal();

        // Create another meal with different options
        Meal simpleMeal = new MealBuilder("Vegetable Stir Fry", "Rice", "Lemonade").build();

        // Display the simple meal details
        simpleMeal.displayMeal();
    }
}
