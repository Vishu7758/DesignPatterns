package com.designpatterns.creational.abstractfactory;

public class WindowsFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton(); // Create a Windows button
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar(); // Create a Windows scrollbar
    }
}
