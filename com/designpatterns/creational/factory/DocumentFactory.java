package com.designpatterns.creational.factory;

public class DocumentFactory {
    public static Document createDocument(String type) {
        return switch (type.toLowerCase()) {
            case "pdf" -> new PDFDocument();
            case "word" -> new WordDocument();
            case "html" -> new HTMLDocument();
            default -> throw new IllegalArgumentException("Unknown document type: " + type);
        };
    }
}
