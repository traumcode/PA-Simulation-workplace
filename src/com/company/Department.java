package com.company;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employeeList;
    private Employee lead;

    public Department(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee getLead() {
        return lead;
    }

    public void assignLead(Lead lead) {
        this.lead = lead;
        ((Lead)this.lead).assignLeadToDepartment(this);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }
}
