package com.company.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the employee type:");
        String type= scanner.next();

        System.out.println("Enter the employee name:");
        String name= scanner.next();

        System.out.println("Enter the rate:");
        double rate = scanner.nextDouble();

        System.out.println("Enter the hours worked:");
        int hoursWorked = scanner.nextInt();

        System.out.println("Enter the days worked:");
        int daysWorked = scanner.nextInt();

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee employee = employeeFactory.getInstance(type,name, hoursWorked, daysWorked, rate);

        System.out.println("Salary of " + name + " is " + employee.calcSalary());

        //open-closed principle --> open for extension and closed for modification

        //WHAT IS A FACTORY??? --> the place where you create objects

    }
}
