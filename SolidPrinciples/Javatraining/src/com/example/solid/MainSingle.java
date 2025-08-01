package com.example.solid;

// This file serves as the entry point of the application. It creates instances of the classes demonstrating the SOLID principles and calls their methods.

public class MainSingle {
    public static void main(String[] args) {
        // Demonstrating Single Responsibility Principle
        Singleresponsible singleResponsibility = new Singleresponsible();
        singleResponsibility.generateReport();
        singleResponsibility.sendReport("NC");
        singleResponsibility.setReportContent("Hello");
        System.out.println(singleResponsibility.generateReport());
    }
}