package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    final int REGULAR_HOURS = 40;
    final double OVERTIME_PAY_RATE = 1.5;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * OVERTIME_PAY_RATE);
    }

    private double getRegularHours() {
        return hoursWorked;
    }

    private double getOvertimeHours() {

        if (hoursWorked > REGULAR_HOURS) {
            return hoursWorked - REGULAR_HOURS;
        }
        return 0;
    }
}
