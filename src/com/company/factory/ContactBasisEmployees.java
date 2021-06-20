package com.company.factory;

public class ContactBasisEmployees extends Employee {

    double rate;

    public ContactBasisEmployees(String id, String name, double rate){
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    @Override
    public double calcSalary() {
        return rate - (rate * 0.05);
    }
}
