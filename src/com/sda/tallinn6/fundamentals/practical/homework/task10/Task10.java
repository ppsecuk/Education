package com.sda.tallinn6.fundamentals.practical.homework.task10;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Welcome stranger.");
        String[] emptyStrings = new String[5]; //creating an array

        while(true) {
            System.out.println("What operation do you want to do? Add/Remove/View/Search/Done.");
            Scanner scanner = new Scanner(System.in); //creating scanner
            String input = scanner.nextLine();
            ProductList productList = new ProductList();

            if (input.equalsIgnoreCase("done")) {
                System.out.println("OK. You are done, see you later.");
                break;
            }else if(input.equalsIgnoreCase("add")) {
                System.out.println("OK. Let's add. Please provide name of the product:");
                String newItemName = scanner.nextLine();

                if(productList.isNotFull() && productList.getIndexOfProduct(newItemName)==-1) {
                    Product addProduct = new Product(newItemName);
                    productList.insertProduct(addProduct);
                    System.out.println("OK. Product has been added.");
                }else {
                    System.out.println("ERROR. Failed to add product. Possible reasons: item already exists, no space left or you used incorrect format.");
                }
            }else if(input.equalsIgnoreCase("remove")){
                System.out.println("OK. Let's remove. Please provide name of the product:");
                String existingItemName = scanner.nextLine();

                if(productList.getIndexOfProduct(existingItemName)==-1){
                    System.out.println("ERROR. This item doesn't exists.");
                }else{
                    productList.removeProduct(productList.getIndexOfProduct(existingItemName));
                    System.out.println("OK. Item has been removed");
                }
            }else if(input.equalsIgnoreCase("search")){
                System.out.println("OK. Let's search. Please provide name of the product:");
                String searchItem = scanner.nextLine();
                int i = 0;
                boolean found = false;

                for (i = 0; i < emptyStrings.length; i++) {
                    if (Arrays.asList(emptyStrings).indexOf(searchItem)==i) {
                        found = true;
                        System.out.println("Found " + input + " at index " + i + ".");
                        break;
                    }else{
                        System.out.println("Nothing found.");
                        break;
                    }
                }
            }
            else{
                System.out.println("Invalid input, please try again.");
            }
        }
    }
}
