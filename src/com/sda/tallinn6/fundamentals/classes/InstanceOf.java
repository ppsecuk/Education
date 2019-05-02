package com.sda.tallinn6.fundamentals.classes;

public class InstanceOf {
    public static void main(String[] args) {
        Bicycle first = new Bicycle();
        boolean result = first instanceof Bicycle;
        Bicycle second = null;
        boolean result2 = second instanceof Bicycle;

        System.out.println("First: " + result);
        System.out.println("Second: " + result2);

    }
}