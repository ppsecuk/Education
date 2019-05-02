package com.sda.tallinn6.foundamentals.operators;

public class BitWiseBitShiftOperators {
    public static void main(String[] args) {
        int a = 0b0111100;
        System.out.println(a);
        int b = 0b0001101;
        System.out.println(b);

        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + ~a);
        System.out.println("a << 2: " + (a << 2));
        System.out.println("a >>>2: " + (a >>> 2));
    }
}
