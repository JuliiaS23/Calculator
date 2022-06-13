package com.company;


public class Calculator {
    double sum (double a, double b) {
        System.out.println(a + b);
        return a + b;
    }
    double sqrtCondition (double x){
        if (x >= 0) {
            return Math.sqrt(x);
        } else {
            System.out.println("відʼємне число");
        }

        return x;
    }
    double sqrt(double a,double b){
        double c = a - b;
        return sqrtCondition(c);


    }
    void num(double d){
        System.out.println(d);
        System.out.println(d*d);
        sqrtCondition(d);
    }
    void random (){
        double j = Math.random();
        System.out.println(j);
    }
    double random10 (){
        return Math.random() * 10;

    }
}
