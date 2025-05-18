package com.designpatterns.behavioural.strategy;

public class StrategyMain {
    public static void main(String[] ignoredArgs) {
        TextDocument document = new TextDocument();
        document.setText("Hello, World!");

        // Set formatter to HTML
        document.setFormatter(new HTMLFormatter());
        document.display(); // Output: <html><body>Hello, World!</body></html>

        // Change formatter to Plain Text
        document.setFormatter(new PlainTextFormatter());
        document.display(); // Output: Hello, World!
    }
}
