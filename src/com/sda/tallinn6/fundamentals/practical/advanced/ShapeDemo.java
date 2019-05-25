package com.sda.tallinn6.fundamentals.practical.advanced;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.printArea();

        Circle circle = new Circle();
        circle.printArea();

        Rectangle rectangle = new Rectangle();
        rectangle.printArea();

        Shape shapeRef = new Rectangle();
        shapeRef.printArea();
    }
}
