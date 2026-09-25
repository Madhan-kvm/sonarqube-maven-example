package com.example;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public double calculateBonus() {
        if (salary >= 100000) {
            return salary * 0.20;
        } else if (salary >= 50000) {
            return salary * 0.10;
        } else {
            return salary * 0.05;
        }
    }

    public String getPerformanceRating() {
        if (salary >= 100000) {
            return "Excellent";
        } else if (salary >= 50000) {
            return "Good";
        } else {
            return "Average";
        }
    }

    public boolean isEligibleForPromotion() {
        if (salary >= 80000 && department.equalsIgnoreCase("IT")) {
            return true;
        }

        if (salary >= 90000 && department.equalsIgnoreCase("HR")) {
            return true;
        }

        return false;
    }

    public String getEmployeeLevel() {
        if (salary >= 100000) {
            return "Senior";
        } else if (salary >= 50000) {
            return "Mid-Level";
        } else {
            return "Junior";
        }
    }

    public boolean isValidEmployee() {
        if (id <= 0) {
            return false;
        }

        if (name == null || name.isBlank()) {
            return false;
        }

        if (salary <= 0) {
            return false;
        }

        if (department == null || department.isBlank()) {
            return false;
        }

        return true;
    }
}