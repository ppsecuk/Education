package com.sda.tallinn6.foundamentals.operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int result = 0;
        double d = 4.2 + 3;
        System.out.println("result: " + result);
        System.out.println("d: " + d);

        result = result + 5;
        System.out.println("Now result is: " + result);

        result = result - 1;
        System.out.println("result after substraction is: " + result);

        // same with addition, multiplection, division etc...

        int unary = +1;
        System.out.println("unary: " + unary);

        int y = 10;
        y=+1;

        System.out.println("y=+1 result is: " + y);

        unary--;
        System.out.println("now unary is: " + unary);

        unary++;
        System.out.println("after ++ unary is: " + unary);

        unary = -unary;
        System.out.println("result: " + unary);

        boolean success = false;
        System.out.println(success);
        System.out.println(!success);

        int i = 3;

        ++i;
        System.out.println(i);

        i++;
        System.out.println(i);

        ++i;
        System.out.println(i);

        //different between ++i and i++ is: ++i is doing increment first, then assigning. i++ first prints existing value, then increments it +1 and add to the value
    }
}
