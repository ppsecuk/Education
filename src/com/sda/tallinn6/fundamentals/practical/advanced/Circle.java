package com.sda.tallinn6.fundamentals.practical.advanced;

public class Circle extends Shape {
        private int radius;
        private double PI = 3.147;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
    @Override
    public void printArea() {
        System.out.println("Area for this circle is " + calculateArea());
    }
}
