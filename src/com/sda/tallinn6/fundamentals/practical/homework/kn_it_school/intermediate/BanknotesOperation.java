package com.sda.tallinn6.fundamentals.practical.homework.kn_it_school.intermediate;

import java.util.Scanner;

public class BanknotesOperation {

    public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 100, 50, 20, 10, 5 };
        int[] noteCounter = new int[5];

        for (int i = 0; i < 5; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        System.out.println("Currency Count:");
        for (int i = 0; i < 5; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter amount of money you want to withdraw. The number should be divisible by 5.");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        if(amount <= 0){
            System.out.println("Negative number or 0 is not accepted.");
        }else if(amount % 5 != 0){
            System.out.println("The number should be divisible by 5. Please try again.");
        }else{
            countCurrency(amount);
        }
    }
}
