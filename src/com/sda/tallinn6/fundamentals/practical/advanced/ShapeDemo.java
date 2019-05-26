package com.sda.tallinn6.fundamentals.practical.advanced;

public class ShapeDemo {
    public static void main(String[] args) {

        //cannot create an object out of abstract class
        //Shape shape = new Shape();
        //shape.printArea();

        Circle circle = new Circle(6);
        circle.printArea();

        Rectangle rectangle = new Rectangle(7,5);
        rectangle.printArea();

        Shape shapeRef = new Rectangle(9,4);
        shapeRef.printArea();

        shapeRef = new Circle(8);
        shapeRef.printArea();
    }
}
