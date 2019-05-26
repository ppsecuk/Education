package com.sda.tallinn6.fundamentals.practical.advanced;

public class Rectangle extends Shape{

    private int lenght;
    private double width;

    public Rectangle(int lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return lenght * width;
    }

    @Override
    public void printArea(){
        System.out.println("Are for rectangle is " + calculateArea());
    }
}
