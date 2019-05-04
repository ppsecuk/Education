package com.sda.tallinn6.fundamentals.data.types;

public class IntegerPrimitives {

    public static void main(String[] args) {
        int myFirstLiteral = 60;
        int x = 3;

        System.out.println(myFirstLiteral);
        System.out.println(x);

        System.out.println("First integer:" + myFirstLiteral
                + " Second integer: " + x );

        int myNegativeInt = -400;

        System.out.println("My negative integer: " + myNegativeInt);

        int myIntegerWithUnderscore = 100_000_000;

        System.out.println("First underscore:" + myIntegerWithUnderscore);

        int myIntegerWithUnderscore2 = 1_00_0;
        System.out.println("Second underscore:" + myIntegerWithUnderscore2);

        int myBiggest = Integer.MAX_VALUE;

        System.out.println("Maximum int value:");
        System.out.println(myBiggest);

        int myMinimum = Integer.MIN_VALUE;

        System.out.println("Minimum int value:");
        System.out.println(myMinimum);

        long myNewBiggest = 2147483650L;
        System.out.println("My new biggest:" + myNewBiggest);

    }
}
