package com.sda.tallinn6.fundamentals.operators;

public class OperatorsHomework {

    // HOMEWORK

    public static void main(String[] args) {
        // 1. Try to evaluate the a value after each step then find the final result!
        int a = 10;

        a = ++a + a + --a - --a + a++;
        System.out.println(a);

        // 2. Try to understand the difference the expressions below:

        int a1 = 10;
        int b1 = 20;
        System.out.println(a1=b1); // what it prints? try to guess without running the main method

        System.out.println(a1 == b1); // what it prints? try to guess without running the main method


        // 3. try to understand what the expression below prints without running the main method

        int marks = 8;
        int total = 10;

        System.out.println(total<marks  && ++marks>5);
        System.out.println(marks);
        System.out.println(total == 10 || ++marks>5);
        System.out.println(marks);

    }


}
