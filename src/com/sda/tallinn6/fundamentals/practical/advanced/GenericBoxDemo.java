package com.sda.tallinn6.fundamentals.practical.advanced;

public class GenericBoxDemo {
    public static void main(String[] args) {
        Student student = new Student("John", "Smith", 12,true);
        GenericBox<Student> studentGenericBox = new GenericBox<>(student);

        Circle circle = new Circle(6);
        GenericBox<Circle> circleGenericBox = new GenericBox<>(circle);

        Rectangle rectangle = new Rectangle(12,21);
        GenericBox<Rectangle> rectangleGenericBox = new GenericBox<>(rectangle);

        Shape shape = new Rectangle(6,3);
        GenericBox<Shape> shapeGenericBox = new GenericBox<>(shape);

        GenericBox<Shape> shapeCircleGenericBox = new GenericBox<>(circle);
        GenericBox<Shape> shapeRectangleGenericBox = new GenericBox<>(rectangle);
    }

    public static void printGenericObjectItem(GenericBox<Object> genericBox){
        System.out.println(genericBox.getItem());
    }
}
