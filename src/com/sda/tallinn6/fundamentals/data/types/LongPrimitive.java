package com.sda.tallinn6.fundamentals.data.types;

public class LongPrimitive {

    public static void main(String[] args) {
        long l = 2000000;
        long m = 2000l;
        long v = 4000L;

        System.out.println("All are long :");
        System.out.println(l);
        System.out.println(m);
        System.out.println(v);

        //9223372036854775807
        long biggest = 9223372036854775807l;
        System.out.println("Biggest long: "+ biggest);
    }
}
