package com.sda.tallinn6.fundamentals.practical.homework.task12;

import java.util.Scanner;

public class NameAndAges {
    public static void main(String[] args) {
        System.out.println("Welcome stranger.");

        while(true) {
            System.out.println("Enter your dog name:");
            Scanner scanner = new Scanner(System.in); //creating scanner
            String inputName = scanner.nextLine();
            DogAges dogAges = new DogAges();
            String inputSpecies = scanner.nextLine();

            System.out.println("Enter your dog age:");
            int inputAge = scanner.nextInt();
            if(inputAge<0){
                System.out.println("Age cannot be negative.");
            }else if(inputSpecies.equalsIgnoreCase("beagle") || inputSpecies.equalsIgnoreCase("husky") || inputSpecies.equalsIgnoreCase("chihuahua")){
                System.out.println();
            }else{
                System.out.println("It is not Chihuahua or Husky or Beagle...");
                //this code doesn't work
            }
        }
    }
}
