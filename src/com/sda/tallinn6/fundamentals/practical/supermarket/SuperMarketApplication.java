package com.sda.tallinn6.fundamentals.practical.supermarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuperMarketApplication {
    public static void main(String[] args) {
        System.out.println("Welcome admin!");
        SuperMarket superMarket = new SuperMarket();
        Scanner scanner = new Scanner(System.in);
        SuperMarketApplication superMarketApplication = new SuperMarketApplication();

        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("OK. What operation do you want to do? (Add - Remove - Done)");
            String action = scanner1.nextLine();

            if(action.equalsIgnoreCase("done")){
                System.out.println("OK. You are done, bye.");
                break;
            }else if (action.equalsIgnoreCase("add")) {
                System.out.println("OK. Let's add. Please provide name of the product:");
                String newItemName = scanner1.nextLine();

                    if(superMarket.getIndexOfProduct(newItemName)==-1){
                    System.out.println("OK. Please provide price");
                    double newPrice = scanner1.nextDouble();
                    Product addProduct = new Product(newItemName, newPrice);
                    superMarket.insertProduct(addProduct);
                    System.out.println("OK. Product has been inserted successfully.");

                }else{
                    System.out.println("ERROR. Failed to add product.");
                }

            }else if(action.equalsIgnoreCase("remove")){
                System.out.println("OK. Let's remove. Please enter existing product name:");
                String existingProductName = scanner1.nextLine();

                if(superMarket.getIndexOfProduct(existingProductName)==-1){
                    System.out.println("ERROR. This product doesn't exist");
                }else {
                    superMarket.removeProduct(superMarket.getIndexOfProduct(existingProductName));
                    System.out.println("OK. Product has been deleted.");
                }
            }
            else{
                System.out.println("ERROR. Invalid comment");
            }
        }
        superMarket.printAllProducts();
        System.out.println("Enter your budget:");
        double budget = Double.parseDouble(scanner.nextLine());
        Account account = new Account(budget);
        System.out.println("Your budget now is: " + account.getBalance());
        int amount = Integer.parseInt(scanner.nextLine());
        Account amountOf = new Account(amount);

        while(true) {
            System.out.println("What do you want to buy?");
            String newItem = scanner.nextLine();

            if (newItem.equalsIgnoreCase("done")) {
                System.out.println("OK. You are done, bye.");
                break;
            }
                int indexOfProduct = superMarket.getIndexOfProduct(newItem);
                if (indexOfProduct == -1) {
                    System.out.println("This product doesn't exists.");
                } else {
                    SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
                    List<Product> listOfProducts = superMarket.getListOfProducts();
                    Product selectedProduct = listOfProducts.get(indexOfProduct);
                    System.out.println("OK. How many of " + selectedProduct.getName() + " do you want?");

                    int requestedQuantity = Integer.parseInt(scanner.nextLine());

                    double totalCost = selectedProduct.getPrice()*requestedQuantity;
                    totalCost = superMarketUtilities.round(totalCost);
                    boolean isEnoughtmoney = account.deduct(totalCost);

                    if(isEnoughtmoney){
                        System.out.println("You bought " + selectedProduct.getName());
                        account.appUpdateProduct(selectedProduct.getName(),requestedQuantity);
                    }
                }
            }
        }
}
