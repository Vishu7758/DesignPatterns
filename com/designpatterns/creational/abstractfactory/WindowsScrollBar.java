package com.designpatterns.creational.abstractfactory;

public class WindowsScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("Scrolling a Windows scrollbar.");
    }
}
