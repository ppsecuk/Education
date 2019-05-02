package com.sda.tallinn6.fundamentals.practical;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("Let's play a game...");
        System.out.println("Find what's the number (0-100) in my mind...");
        Random random = new Random();
        int randomNumber = random.nextInt(101); // 0 to 100 included
        Scanner scanner = new Scanner(System.in);

        int attemptCount=0;
        while (true) {
            System.out.println("Please enter the number");
            int userNumber = scanner.nextInt();
            if(userNumber==randomNumber){
                System.out.println("You are correct");
                break;
            }else{
                System.out.println("You are wrong");
                attemptCount++;
                System.out.println("This was your " + attemptCount + " attempt");

                int difference = Math.abs((userNumber-randomNumber));
                if(difference<5){
                    System.out.println("It's burning");
                }else if (difference<10){
                    System.out.println("It's very hot");
                }else if (difference<25){
                    System.out.println("It's warm");
                }else{
                    System.out.println("It's cold");
                }
            }
        }

    }

}

