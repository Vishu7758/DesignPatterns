package com.designpatterns.creational.factory;

public class PDFDocument extends Document {
    @Override
    public void displayType() {
        System.out.println("This is a PDF document.");
    }
}
