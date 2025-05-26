package com.designpatterns.creational.singleton;

public class SingletonMain {
    public static void main(String[] ignoredArgs) {
        // Get the singleton instance
        Logger logger = Logger.getInstance();

        // Log messages using the singleton instance
        logger.info("This is an info message.");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");

        // Verify that the same instance is used
        Logger anotherLogger = Logger.getInstance();
        System.out.println("Are both logger instances the same? " + (logger == anotherLogger));
    }
}
