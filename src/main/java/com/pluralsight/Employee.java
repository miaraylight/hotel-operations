package com.pluralsight;

import java.time.Duration;
import java.time.LocalTime;

public class Employee {
    final int REGULAR_HOURS = 40;
    final double OVERTIME_PAY_RATE = 1.5;
    private final double payRate;
    LocalTime startTime = null;
    LocalTime endTime = null;
    private int employeeId;
    private String name;
    private String department;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
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

    public void punchTimeCard(LocalTime punchTime) {
        if (startTime == null) {
            startTime = punchTime;
            System.out.println("Punched in at: " + startTime);
        } else {
            endTime = punchTime;
            System.out.println("Punched out at: " + endTime);

            Duration duration = Duration.between(startTime, endTime);

            double hoursWorkedToday = duration.toMinutes() / 60.0;
            hoursWorked += hoursWorkedToday;

            System.out.println("Today:" + hoursWorkedToday + " Week: " + hoursWorked);

            startTime = null;
            endTime = null;
        }
    }
}
