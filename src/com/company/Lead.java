package com.company;

public class Lead extends Employee{
    private Department department;

    public Lead(String name) {
        super(name, EmployeeType.LEAD);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = 1800;

        for(Employee employee : department.getEmployeeList()) {
            baseSalary += 200;
        }
        return baseSalary;
    }

    public void assignLeadToDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Lead{" +
                "department=" + department +
                '}';
    }
}
