package com.sda.tallinn6.fundamentals.practical.advanced_evgeni;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Celsius degree:");
        final String celsius = input.nextLine();
        Double valueInFahreinheit;
        try {
            valueInFahreinheit = (9.0 / 5) * Double.parseDouble(celsius) + 32;
            System.out.println("The temperature is: " + valueInFahreinheit);
        }catch (NumberFormatException e) {
            System.out.println("Please enter the number only");
        }finally{
            System.out.println("Finally is running");
        }
    }
}
