package org.example;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
        return a / b;
    }
    public int mod(int a, int b) {
        return a % b;
    }

    public int square(int a) {
        return a * a;
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }
}
