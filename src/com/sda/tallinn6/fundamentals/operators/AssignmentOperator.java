package com.sda.tallinn6.fundamentals.operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        System.out.println("Assignment Operators");
        int speed = 1000;
        System.out.println("Speed: " + speed);
        boolean b = true;
        char c = 'a';
        int another = speed;
        System.out.println("another: " + speed);

        speed += 100;
        System.out.println("Speed value now: " + speed);

        speed -= 50;
        System.out.println("and now it's: " + speed);

        speed *= 5;
        System.out.println("After multiplection, it's: " + speed);

        speed /=10;
        System.out.println("And after division it's: " + speed);

        speed %= 5;
        System.out.println("Remainder is: " + speed);

    }
}
