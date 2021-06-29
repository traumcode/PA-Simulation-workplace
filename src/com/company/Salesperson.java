package com.company;

import java.util.Random;

public class Salesperson extends Employee{
    public Salesperson(String name) {
        super(name, EmployeeType.SALESPERSON);
    }

    @Override
    public int calculateSalary() {
        Random random = new Random();
        return random.nextInt((1850-1650)+1) + 1650;
    }
}
