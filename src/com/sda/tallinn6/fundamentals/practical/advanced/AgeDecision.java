package com.sda.tallinn6.fundamentals.practical.advanced;

import java.util.Scanner;

public class AgeDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("Welcome, please enter your age:");
        try {
            age = scanner.nextInt();
        }catch (Exception ex){
            System.out.println("Invalid input");
            return;
            //System.exit(0); - in this case block "finally" won't be executed
        }finally{
            System.out.println("This block will be executed always. The only exception is : System.exit");
        }

        if(age < 0){
            System.out.println("Negative values are not allowed");
        }else if(age < 13){
            System.out.println("Your are child");
        }else if(age < 18){
            System.out.println("You are teenager");
        }else {
            System.out.println("Your are adult");
        }
    }
}
