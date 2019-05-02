package com.sda.tallinn6.fundamentals.loops;

public class LoopsHomework {

    /**
     *
     *     *******
     *     ******
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 1. Write a method prints stars like above
     * 2. Write a method to calculate the sum of first 10 natural number.
     * 3. Write a method to calculate factorial number of given input!
     *
     */

    public static void main(String[] args) {
        System.out.println("*******");
        System.out.println("******");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }

    public static void printStars(){
        for (int i=7; i > 0; i--) {
            for (int j = 0; i > j; j++);
            System.out.print("*");
        }
        System.out.println();
    }
}
