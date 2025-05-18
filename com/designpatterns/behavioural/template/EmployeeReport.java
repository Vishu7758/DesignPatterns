package com.designpatterns.behavioural.template;

public class EmployeeReport extends ReportTemplate {
    @Override
    protected void gatherData() {
        System.out.println("Gathering employee data...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing employee data...");
    }
}
