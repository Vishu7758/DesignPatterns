package com.designpatterns.creational.builder;

public class MealBuilder {
    String mainCourse;
    String sideDish;
    String drink;
    String dessert = "Default Dessert";
    String appetizer = "Default Appetizer";

    public MealBuilder(String mainCourse, String sideDish, String drink) {
        this.mainCourse = mainCourse;
        this.sideDish = sideDish;
        this.drink = drink;
    }

    public MealBuilder setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public MealBuilder setAppetizer(String appetizer) {
        this.appetizer = appetizer;
        return this;
    }

    public Meal build() {
        return Meal.getInstance(this);
    }
}
