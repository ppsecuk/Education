package com.sda.tallinn6.fundamentals.practical.advanced;

public class GenericBoxDemo2 {
    public static void main(String[] args) {
//        Student student = new Student("John", "Smith", 12,true);
//        GenericBox2<Student> studentGenericBox = new GenericBox2<>(student);

        Circle circle = new Circle(6);
        GenericBox2<Circle> circleGenericBox = new GenericBox2<>(circle);

        Rectangle rectangle = new Rectangle(12,21);
        GenericBox2<Rectangle> rectangleGenericBox = new GenericBox2<>(rectangle);

        Shape shape = new Rectangle(6,3);
        GenericBox2<Shape> shapeGenericBox = new GenericBox2<>(shape);

        GenericBox2<Shape> shapeCircleGenericBox = new GenericBox2<>(circle);
        GenericBox2<Shape> shapeRectangleGenericBox = new GenericBox2<>(rectangle);
    }
}
