package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, float hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        return getRegularPay() + getOverTimePay();
    }

    public double getRegularPay(){
        return getRegularHoursWorked() * payRate;
    }

    public double getOverTimePay(){
        return getOverTimeHours() * payRate * 1.5;
    }

    public float getRegularHoursWorked(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public double getOverTimeHours(){
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }
}
