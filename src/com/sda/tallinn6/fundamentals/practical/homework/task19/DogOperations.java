package com.sda.tallinn6.fundamentals.practical.homework.task19;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DogOperations {

    public static void main(String[] args) {
        System.out.println("Welcome to Dog Administration.");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Dog> hashMapDog = new HashMap<>();

        while (true) {
            System.out.println("What do you want to do ? Add/Remove/Search/View/Done");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("Done")) {
                break;
            } else if (command.equalsIgnoreCase("Add")) {
                System.out.println("Enter dog name");
                String dogName = scanner.nextLine();
                if (hashMapDog.containsKey(dogName)) {
                    System.out.println("Dog name already exists for " + dogName);
                    continue;
                }
                System.out.println("Enter dog age");
                Integer dogAge = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter dog species");
                String dogSpecies = scanner.nextLine();

                Dog dog = new Dog(dogName, dogAge, dogSpecies);
                System.out.println("Dog is entered.");
                dog.print();
                hashMapDog.put(dogName, dog);

            } else if (command.equalsIgnoreCase("Search")) {
                System.out.println("Enter dog name");
                String dogName = scanner.nextLine();

                boolean found = false;
                for (Map.Entry<String, Dog> entry : hashMapDog.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase(dogName)) {
                        if (!found) {
                            found = true;
                            System.out.println("System found dog.");
                        }

                        Dog dog = entry.getValue();
                        System.out.println(entry.getKey() + " => " + dog.getName() + " ," + dog.getAge() + " ," + dog.getSpecies());
                    }

                }

                if (!found) {
                    System.out.println(dogName + " does not exist.");
                }


            } else if (command.equalsIgnoreCase("Remove")) {
                System.out.println("Enter dog name");
                String dogName = scanner.nextLine();
                if (hashMapDog.containsKey(dogName)) {
                    hashMapDog.remove(dogName);
                    System.out.println(dogName+" is removed.");
                }else{
                    System.out.println(dogName+" does not exist.");
                }


            } else if (command.equalsIgnoreCase("View")) {
                System.out.println("Printing all dogs.");
                for (Map.Entry<String, Dog> entry : hashMapDog.entrySet()) {
                    Dog dog = entry.getValue();
                    System.out.println(entry.getKey() + " => " + dog.getName() + " ," + dog.getAge() + " ," + dog.getSpecies());
                }

            } else {
                System.out.println("Invalid command");
            }
        }

    }
}
