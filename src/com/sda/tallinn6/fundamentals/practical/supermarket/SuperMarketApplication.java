package com.sda.tallinn6.fundamentals.practical.supermarket;

import java.util.Scanner;

public class SuperMarketApplication {
    public static void main(String[] args) {
        System.out.println("Welcome admin!");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            SuperMarket superMarket = new SuperMarket();
            SuperMarketApplication superMarketApplication = new SuperMarketApplication();

            System.out.println("OK. What operation do you want to do? (Add - Remove - Done)");
            String action = scanner.nextLine();

            if(action.equalsIgnoreCase("done")){
                System.out.println("OK. You are done, bye.");
                break;
            }else if (action.equalsIgnoreCase("add")){
                System.out.println("OK. Let's add. Please provide name of the product:");
                String newItemName = scanner.nextLine();

                if(superMarket.getIndexOfProduct(newItemName)==-1){
                    System.out.println("OK. Please provide price");
                    double newPrice = scanner.nextDouble();
                    Product addProduct = new Product(newItemName, newPrice);
                    superMarket.insertProduct(addProduct);
                    System.out.println("OK. Product has been inserted successfully.");
                }else{
                    System.out.println("ERROR. Failed to add product.");
                }

            }else if(action.equalsIgnoreCase("remove")){
                System.out.println("OK. Let's remove. Please enter existing product name:");
                String existingProductName = scanner.nextLine();

                if(superMarket.getIndexOfProduct(existingProductName)==-1){
                    System.out.println("ERROR. This product doesn't exist");
                }else {
                    superMarket.removeProduct(superMarket.getIndexOfProduct(existingProductName));
                    System.out.println("OK. Product has been deleted.");
                }

            }else{
                System.out.println("ERROR. Invalid comment");
            }
        }
    }
}
