package com.company;

import java.util.UUID;

public abstract class Employee {
    private String name;
    private UUID id;
    private Department department;
    private EmployeeType employeeType;


    public Employee(String name, EmployeeType employeeType) {
        this.name = name;
        this.employeeType = employeeType;
        this.id = UUID.randomUUID();
    }

    public Department getDepartment() {
        return department;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void assignToDepartment(Department department) {
        this.department = department;
    }

    public abstract int calculateSalary();

    public String getName() {
        return name;
    }
}
