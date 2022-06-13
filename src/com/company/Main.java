package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(34, 67);
        calculator.sqrt(5,1);
        calculator.num(5.2);
        calculator.random();
        calculator.random10();
        double result = calculator.sqrt(1,5);
        System.out.println(result);
        System.out.println(calculator.random10());
    }
}