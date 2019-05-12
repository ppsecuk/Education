package com.sda.tallinn6.fundamentals.practical.homework.task18;



import java.io.IOException;
import java.util.*;

public class Items {


    public static void main(String[] args) throws IOException {
        HashMap<String,Double> hashMapItems = new  HashMap<String,Double>();
        System.out.println("Welcome to Storage");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do ? Add/Remove/Search/View/Done");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("Done")) {
                break;
            } else if (command.equalsIgnoreCase("Add")) {
                System.out.println("Enter storage item");
                String itemName = scanner.nextLine();
                System.out.println("Enter item price");
                Double itemPrice = scanner.nextDouble();
                scanner.nextLine();

                if(hashMapItems.containsKey(itemName)){
                    System.out.println(itemName+" already exists.");
                }else{
                    System.out.println(itemName + " is added. Its price:"+itemPrice);
                    hashMapItems.put(itemName,itemPrice);
                }

            } else if (command.equalsIgnoreCase("Remove")) {
                System.out.println("Enter storage item");
                String itemName = scanner.nextLine();
                if(hashMapItems.containsKey(itemName)){
                    System.out.println(itemName + "  is removed.");
                    hashMapItems.remove(itemName);
                }else{
                    System.out.println(itemName+" does not exist.");
                }

            } else if (command.equalsIgnoreCase("Search")) {
                System.out.println("Enter storage item");
                String itemName = scanner.nextLine();
                for(Map.Entry<String, Double> entry: hashMapItems.entrySet()) {
                    if(entry.getKey().equalsIgnoreCase(itemName)){
                        System.out.println("Found Item "+entry.getKey() + " => " + entry.getValue());
                    }

                }


            } else if (command.equalsIgnoreCase("View")) {
                System.out.println("Printing out items and prices.");
                for(Map.Entry<String, Double> entry: hashMapItems.entrySet()) {
                    System.out.println(entry.getKey() + " => " + entry.getValue());
                }
            } else {
                System.out.println("Invalid command");
            }

            System.out.println("---------------------------");
        }
    }

}
