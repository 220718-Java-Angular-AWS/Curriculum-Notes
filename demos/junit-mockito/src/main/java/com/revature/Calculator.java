package com.revature;

public class Calculator {
    public int add(int a, int ...b) {
        if(b.length == 1) {
            return a + b[0];
        }
        int sum = a;
        for(int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        return sum;
    }

    public double add(double a, double ...b) {
        if(b.length == 1) {
            return a + b[0];
        }
        double sum = a;
        for(int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        return sum;
    }

    public long multiply(int a, int ...b) {
        if(b.length == 1) {
            return a * b[0];
        }
        int sum = a;
        for(int i = 0; i < b.length; i++) {
            sum *= b[i];
        }
        return sum;
    }

    public double multiply(double a, double ...b) {
        if(b.length == 1) {
            return a * b[0];
        }
        double sum = a;
        for(int i = 0; i < b.length; i++) {
            sum *= b[i];
        }
        return sum;
    }




}
