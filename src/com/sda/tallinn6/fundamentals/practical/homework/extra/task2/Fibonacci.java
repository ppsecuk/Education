package com.tallinn.four.recap.extra.task2;

import java.util.Scanner;

public class Fibonacci {

    public boolean isFibo(int actualNumber) {

        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 2;

        if (actualNumber == firstNumber  || actualNumber == thirdNumber) {
            return true;
        }

        while (actualNumber > thirdNumber) {

            firstNumber = secondNumber + thirdNumber;
            secondNumber = firstNumber + thirdNumber;
            thirdNumber = firstNumber + secondNumber;

            if (actualNumber == firstNumber || actualNumber == secondNumber || actualNumber == thirdNumber) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number<=0){
            System.out.println("Negative values and 0 are not fibonacci values.");
        }else{
            boolean isFib = fibonacci.isFibo(number);
            if(isFib){
                System.out.println("It is fib value");
            }else{
                System.out.println("It is not fib value");
            }
        }
    }
}