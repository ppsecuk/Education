package com.sda.tallinn6.fundamentals.operators;

public class RelationalOperator {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2){
            System.out.println("value1 == value2");
        }
        boolean test1 = value1 == value2;
        System.out.println("value1 is equal to value2" + test1);

        if(value1 != value2) {
            System.out.println("value1 != value2");
        }
        boolean test2 = value1 != value2;
        System.out.println("value1 is not equal to value2" + test2);

        if(value1 > value2){
            System.out.println("value1 > value2");
        }
        boolean test3 = value1 > value2;
        System.out.println("value1 is bigger than value2" + test3);

        if(value1 < value2){
            System.out.println("value1 < value2");
        }
        boolean test4 = value1 < value2;
        System.out.println("value2 is bigger than value1" + test4);

        if(value1 <= value2){
            System.out.println("value1 <= value2");
        }
        boolean test5 = value1 <= value2;
        System.out.println("value2 is bigger than value1" + test5);

    }
}
