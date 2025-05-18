package com.designpatterns.behavioural.strategy;

public class HTMLFormatter implements TextFormatter {
    /**
     * Formats the given text as HTML.
     *
     * @param text the text to format
     * @return the formatted text
     */
    @Override
    public String format(String text) {
        return "<html><body>" + text + "</body></html>";
    }
}
