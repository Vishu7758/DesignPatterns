package com.designpatterns.creational.builder;

public class Meal {
    private final String mainCourse;
    private final String sideDish;
    private final String drink;
    private final String dessert;
    private final String appetizer;

    private Meal(MealBuilder builder) {
        this.mainCourse = builder.mainCourse;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.appetizer = builder.appetizer;
    }

    public static synchronized Meal getInstance(MealBuilder builder) {
        return new Meal(builder);
    }

    public void displayMeal() {
        System.out.println("Meal includes:");
        System.out.println("Main Course: " + mainCourse);
        System.out.println("Side Dish: " + sideDish);
        System.out.println("Drink: " + drink);
        System.out.println("Dessert: " + dessert);
        System.out.println("Appetizer: " + appetizer);
    }
}
