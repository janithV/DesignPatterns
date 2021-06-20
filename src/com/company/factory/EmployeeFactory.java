package com.company.factory;

public class EmployeeFactory {

    public Employee getInstance(String type, String name, int hoursWorked, int daysWorked, double rate){
        Employee employee = null;
        if(type.equals("hourly")){
            employee = new HourlyEmployee("1", name, hoursWorked, rate);
        }

        else if(type.equals("monthly")) {
            employee = new MonthlyEmployee("2", name, rate);
        }

        else if(type.equals("daily")){
            employee = new DailyEmployee("3", name, daysWorked,rate);
        }
        else if(type.equals("contract")){
            employee = new ContactBasisEmployees("4", name,rate);
        }
        return employee;
    }
}
