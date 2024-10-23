package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Employee e1 = new Employee(1, "Iftekar", "Tech", 10, 41);
        double totalPay = e1.punchIn(10);
        System.out.println(totalPay);
    }
}