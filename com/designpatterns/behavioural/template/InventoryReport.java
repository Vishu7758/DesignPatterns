package com.designpatterns.behavioural.template;

public class InventoryReport extends ReportTemplate {
    @Override
    protected void gatherData() {
        System.out.println("Gathering inventory data...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing inventory data...");
    }
}
