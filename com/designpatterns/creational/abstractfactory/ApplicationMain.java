package com.designpatterns.creational.abstractfactory;

public class ApplicationMain {
    private final Button button;
    private final ScrollBar scrollBar;

    public ApplicationMain(UIFactory factory) {
        this.button = factory.createButton();
        this.scrollBar = factory.createScrollBar();
    }

    public static void main(String[] ignoredArgs) {
        UIFactory factory = new WindowsFactory(); // Create a Windows factory
        ApplicationMain app = new ApplicationMain(factory); // Create the application with the factory
        app.renderUI(); // Render the UI components
        // If you want to switch to macOS
        ApplicationMain macApp = new ApplicationMain(new MacOSFactory()); // Create a macOS application
        macApp.renderUI(); // Render the macOS UI components
    }

    public void renderUI() {
        button.render(); // Render the button
        scrollBar.scroll(); // Render the scrollbar
    }
}
