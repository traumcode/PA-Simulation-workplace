package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Workplace REBU = new Workplace();

        Department department1 = new Department("Colectare Gunoaie");
        Department department2 = new Department("Sortare Plastic");
        Department department3 = new Department("Sortare Hartie");

        Salesperson salesperson1 = new Salesperson("Mitrica");
        Salesperson salesperson2 = new Salesperson("Doru");
        Salesperson salesperson3 = new Salesperson("Laurentiu");
        Salesperson salesperson4 = new Salesperson("Maria");

        OfficeWorker officeWorker1 = new OfficeWorker("Eusebiu",OfficeWorkerType.JUNIOR);
        OfficeWorker officeWorker2 = new OfficeWorker("Gigica",OfficeWorkerType.SENIOR);
        OfficeWorker officeWorker3 = new OfficeWorker("Ana",OfficeWorkerType.JUNIOR);
        OfficeWorker officeWorker4 = new OfficeWorker("Relu",OfficeWorkerType.SENIOR);

        Lead lead1 = new Lead("NeaAndrei");
        Lead lead2 = new Lead("NeaMarin");
        Lead lead3 = new Lead("NeaDorel");


        department1.assignLead(lead1);
        department1.addEmployee(salesperson1);
        department1.addEmployee(salesperson2);
        department1.addEmployee(officeWorker1);
        department1.addEmployee(officeWorker2);

        System.out.println(department1.getLead().getName() + " is Leader of " + department1.getName() + " and has a salary of " + department1.getLead().calculateSalary() + " $");
        for(Employee employee : department1.getEmployeeList()) {
            System.out.println(employee.getName()+ " has a salary of " + employee.calculateSalary() + " $.");
        }
    }
}