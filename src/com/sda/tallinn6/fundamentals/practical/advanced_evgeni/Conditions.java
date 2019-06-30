package com.sda.tallinn6.fundamentals.practical.advanced_evgeni;

public class Conditions {
    public static void main(String[] args) {
        Integer num1 = 5;
        Integer num2 = 7;
        Integer num3 = 9;

        if (isLessThan(num1, num2)){
            System.out.println("Condition is working");
        }else{
            System.out.println("Not working");
        }
    }
    private static boolean isLessThan(Integer n1, Integer n2){
        return n1 < n2;
    }
}
