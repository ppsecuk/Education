package com.sda.tallinn6.fundamentals.operators;

public class LogicalOperators {

    public static void main(String[] args) {
        // LOGICAL OPERATORS
        System.out.println("Logical com.sda.tallinn6.fundamentals.operators.Operators");
        // &, |, !, &&, ||
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2)){
            System.out.println("value1 is 1 AND value2 is 2");
        }
        boolean test6 = (value1 == 1) && (value2 == 2);
        System.out.println("value1 is 1 AND value2 is 2 :" + test6);

        if((value1 == 1) || (value2 == 1)){
            System.out.println("value1 is 1 OR value2 is 1");
        }
        boolean test7 = (value1 == 1) || (value2 == 1);
        System.out.println("value1 is 1 OR value2 is 1 :" + test7);
        // What's happening here exactly ?
        // The && and || operators "short-circuit", meaning they don't evaluate the right hand side
        // if it isn't necessary.

        // & and | operators always evaluate both sides.
        boolean conditionalAnd = (value1 == 2) & (value2+1 == 3);
        System.out.println("value1 is 1 and value2 plus 1 is 3 :" + conditionalAnd);


        // LOGICAL OPERATORS
    }
}
