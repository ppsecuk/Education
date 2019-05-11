package com.sda.tallinn6.fundamentals.practical.homework.extra;

import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int numberToCheck = scanner.nextInt();
            //reader.close();

            int firstNumber = 0, secondNumber = 1, fibonacciNumber = 1;

            while (fibonacciNumber < numberToCheck) {
                fibonacciNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = fibonacciNumber;
            }
            if (numberToCheck == fibonacciNumber) {
                System.out.println("It is fib value");
            } else if (numberToCheck <= 0) {
                System.out.println("Negative values and 0 are not fib values.");
            } else {
                System.out.println("It is not fib value");
            }
        }
    }
}
