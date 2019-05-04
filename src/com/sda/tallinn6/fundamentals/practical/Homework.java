package com.sda.tallinn6.fundamentals.practical;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Welcome! Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if(name.equalsIgnoreCase("James Bond")){
            System.out.println("Welcome 007");
        }else{
            System.out.println("Your are not James");
        }
    }
}
