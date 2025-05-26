package com.designpatterns.creational.abstractfactory;

public interface UIFactory {
    Button createButton(); // Method to create a button

    ScrollBar createScrollBar(); // Method to create a scrollbar
}
