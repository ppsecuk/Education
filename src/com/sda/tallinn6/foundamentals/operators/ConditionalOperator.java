package com.sda.tallinn6.foundamentals.operators;

public class ConditionalOperator {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;
        System.out.println(result);

        int result2 = value1>value2 ? value1 : value2;
        System.out.println(result2);

        int value3 = 3;
        //homework to compare 3 numbers and show biggest
    }
}
