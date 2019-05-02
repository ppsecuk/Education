package com.sda.tallinn6.fundamentals.methods;

import com.sda.tallinn6.fundamentals.classes.Bicycle;

public class MethodExamples {

    public static void main(String[] args) {
        int sum = calculateSum(5,10);
        System.out.println(sum);

        System.out.println(calculateSum(70,2));

        findBiggerNumber(2,4);

        System.out.println(findBiggerNumber(3,7));
        System.out.println(findBiggerNumber(3,7));
        printVariables(5,3);

        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2006));
    }

    public void printSome(){
        System.out.println("I belong to: " + "MethodExample");
    }

    // write a method calculate sum of two numbers

    public static int calculateSum(int firstNumber, int secondNumber){
        int result = firstNumber+secondNumber;
        return result;
    }

    // write a method gives the bigger number of two numbers

    public static int findBiggerNumber(int number1, int number2){
        return number1 > number2 ? number1 : number2;
    }

    private static void printVariables(int param1, double param2){
        System.out.println("param1:" +
                param1 + " param2:" +
                param2);
    }

    // write a method defines given year is a leap year or not
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }


}
