package com.designpatterns.behavioural.template;

public class TemplateMain {
    public static void main(String[] ignoredArgs) {
        // Create an employee report
        ReportTemplate employeeReport = new EmployeeReport();
        employeeReport.generateReport();

        System.out.println();

        // Create an inventory report
        ReportTemplate inventoryReport = new InventoryReport();
        inventoryReport.generateReport();
    }
}
