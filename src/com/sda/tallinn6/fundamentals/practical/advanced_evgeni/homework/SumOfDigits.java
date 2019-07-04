package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.homework;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String args[]) {
        int usersNumber, n, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        usersNumber = input.nextInt();
        while(usersNumber > 0)
        {
            n = usersNumber % 10;
            sum = sum + n;
            usersNumber = usersNumber / 10;
        }
        System.out.println("Sum of Digits:" + sum);
    }
}