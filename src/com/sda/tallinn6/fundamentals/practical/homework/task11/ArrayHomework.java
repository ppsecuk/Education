package com.sda.tallinn6.fundamentals.practical.homework.task11;

import java.util.Scanner;

public class ArrayHomework {

    public static void main(String[] args) {
        System.out.println("Welcome stranger.");
        Scanner scanner = new Scanner(System.in);
        String[] items = {"", "", "", "", ""};
        ArrayUtilities arrayUtilities = new ArrayUtilities();

        while (true) {
            System.out.println("What operation do you want to do? Add/Remove/View/Search/Done.");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Done")) {
                break;
            } else if (input.equalsIgnoreCase("View")) {
                arrayUtilities.view(items);
            } else if (input.equalsIgnoreCase("Remove")) {
                System.out.println("What item you want to remove.");
                String itemRemoved = scanner.nextLine();
                items = arrayUtilities.remove(itemRemoved, items);

            } else if (input.equalsIgnoreCase("Add")) {
                System.out.println("What item you want to add.");
                String itemAdded = scanner.nextLine();
                items = arrayUtilities.add(itemAdded, items);

            } else if (input.equalsIgnoreCase("Search")) {
                System.out.println("What item you want to search.");
                String itemSearched = scanner.nextLine();
                arrayUtilities.search(itemSearched, items);

            } else {
                System.out.println("Invalid Command");
            }

        }

    }
}
