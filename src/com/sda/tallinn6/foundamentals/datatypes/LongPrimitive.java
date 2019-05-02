package com.sda.tallinn6.foundamentals.datatypes;

public class LongPrimitive {
    public static void main(String[] args) {
        long l = 2000000;
        long m = 2000l;
        long v = 4000L;

        System.out.println(+ l + m + v);

        long biggest = 9223372036854775807l;
        System.out.println(+ biggest);
    }
}
