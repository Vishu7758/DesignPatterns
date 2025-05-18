package com.designpatterns.behavioural.strategy;

/**
 * TextFormatter is an interface that defines a method for formatting text.
 * Implementing classes will provide specific formatting strategies.
 */
public interface TextFormatter {
    /**
     * Formats the given text.
     *
     * @param text the text to format
     * @return the formatted text
     */
    String format(String text);
}
