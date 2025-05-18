package com.designpatterns.behavioural.strategy;

public class TextDocument {
    private String text;
    private TextFormatter formatter;

    public void setText(String text) {
        this.text = text;
    }

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void display() {
        if (formatter != null) {
            System.out.println(formatter.format(text));
        } else {
            System.out.println("No formatter set.");
        }
    }
}
