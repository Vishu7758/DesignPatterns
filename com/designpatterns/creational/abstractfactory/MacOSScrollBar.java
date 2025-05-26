package com.designpatterns.creational.abstractfactory;

public class MacOSScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("Scrolling a macOS scrollbar.");
    }
}
