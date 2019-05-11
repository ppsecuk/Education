package com.sda.tallinn6.fundamentals.practical.homework.task14;

import java.util.Scanner;

public class NumberOrNot {
    public static void main(String[] args) {
        System.out.println("Welcome stranger.");

        while(true){
            System.out.println("Please enter a number:");
            Scanner scanner = new Scanner(System.in); //creating scanner
            String input = scanner.nextLine();

            try
            {
                Double.parseDouble(input);
                System.out.println(input + " is a valid number");
            }
            catch (NumberFormatException e)
            {
                System.out.println(input + " is not a valid integer number");
            }
        }
    }
}
