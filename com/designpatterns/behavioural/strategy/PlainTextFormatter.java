package com.designpatterns.behavioural.strategy;

public class PlainTextFormatter implements TextFormatter {
    /**
     * Formats the given text as plain text.
     *
     * @param text the text to format
     * @return the formatted text
     */
    @Override
    public String format(String text) {
        return text;
    }
}
