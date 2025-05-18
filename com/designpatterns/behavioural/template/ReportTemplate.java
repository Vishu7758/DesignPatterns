package com.designpatterns.behavioural.template;

/**
 * Abstract class representing a report template.
 * This class can be extended to create specific report templates.
 */
public abstract class ReportTemplate {
    public final void generateReport() {
        gatherData();
        processData();
        formatReport();
        printReport();
    }

    protected abstract void gatherData();

    protected abstract void processData();

    protected void formatReport() {
        System.out.println("Formatting report...");
    }

    protected void printReport() {
        System.out.println("Printing report...");
    }
}
