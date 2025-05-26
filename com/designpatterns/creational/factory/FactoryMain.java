package com.designpatterns.creational.factory;

public class FactoryMain {
    public static void main(String[] ignoredArgs) {
        Document pdf = DocumentFactory.createDocument("PDF");
        pdf.displayType();

        Document word = DocumentFactory.createDocument("Word");
        word.displayType();

        Document html = DocumentFactory.createDocument("HTML");
        html.displayType();
    }
}
