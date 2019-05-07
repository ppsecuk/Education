package com.tallinn.four.recap.extra.task3;

import com.tallinn.four.recap.extra.task2.Fibonacci;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Prime prime = new Prime();
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number<=0){
            System.out.println("Negative values and 0 are not prime values.");
        }else{
            boolean isPrime = prime.isPrime(number);
            if(isPrime){
                System.out.println("It is prime value");
            }else{
                System.out.println("It is not prime value");
            }
        }
    }

    public boolean isPrime(int number) {
        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            return true;
        } else {
            return false;
        }
    }
}