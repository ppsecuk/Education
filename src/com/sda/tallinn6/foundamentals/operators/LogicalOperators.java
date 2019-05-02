package com.sda.tallinn6.foundamentals.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2)){
            System.out.println("value1 is 1 AND value2 is 2");
        }
        boolean test6 = (value1 == 1) && (value2 == 2);
        System.out.println("value1 is 1 AND value2 is 2 " + test6);

        boolean test7 = (value1 == 1) || (value2 == 1);
        System.out.println("value1 is 1 OR value2 is 1" + test7);

        // ||, && - checks one of the arguments (if first arg true, then it checks rest), however &, | checks both always.

        boolean conditionalOr1 = (value1 == 2) | (value2+1 == 3);
        System.out.println("value1 is 1 or value2 plus 1 is 3: " + conditionalOr1);
    }
}
