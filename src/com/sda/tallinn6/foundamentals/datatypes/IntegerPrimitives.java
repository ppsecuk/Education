package com.sda.tallinn6.foundamentals.datatypes;

public class IntegerPrimitives {
    public static void main(String[] args) {
        int myFirstLiteral = 60;
        int x= 3;

        System.out.println(myFirstLiteral);
        System.out.println(x);

        System.out.println("First integer: " + myFirstLiteral + " and second integer: " + x);

        int myBiggest = Integer.MAX_VALUE;
        System.out.println("Maximum int value: ");
        System.out.println(myBiggest);

        long myNewBiggest = 2147483650L;
        System.out.println("My new biggest int is: " + myNewBiggest);

        //homework do overflow operation for minimum

        int myNegativeInt = -400;
        System.out.println("My negative integer:" + myNegativeInt);

        int myIntegerWithUnderscore = 100_000_00;
        System.out.println("First underscore: " + myIntegerWithUnderscore);

        //homework: do some operation with underscore integers
    }
}
