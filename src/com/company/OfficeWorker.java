package com.company;

public class OfficeWorker extends Employee{
    private OfficeWorkerType type;

    public OfficeWorker(String name, OfficeWorkerType type) {
        super(name, EmployeeType.OFFICEWORKER);
        this.type = type;
    }

    public OfficeWorkerType getType() {
        return type;
    }

    @Override
    public int calculateSalary() {
        return this.type.equals(OfficeWorkerType.JUNIOR) ? 1275 : 1700;
    }
}
