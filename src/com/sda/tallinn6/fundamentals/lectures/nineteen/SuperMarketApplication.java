package com.tallinn.four.lectures.nineteen;



import java.util.List;
import java.util.Scanner;

public class SuperMarketApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome Admin to the Super Market Application");

        //This superMarket object will contain the product list.
        SuperMarket superMarket = new SuperMarket();

        SuperMarketApplication superMarketApplication = new SuperMarketApplication();

        while (true) {
            System.out.println("What do you want to do: Add - Remove - Done");
            String userInput = scanner.nextLine();  //we get the user input

            if (userInput.equalsIgnoreCase("Add")) {
                //This place runs if the input was add
                superMarketApplication.addNewProduct(superMarket);

            } else if (userInput.equalsIgnoreCase("Remove")) {
                //This place will run if the input is remove
                //--------------------------- LECTURE 21 -----------------------
                superMarketApplication.removeProduct(superMarket);
                //--------------------------- LECTURE 21 -----------------------
            } else if (userInput.equalsIgnoreCase("Done")) {
                //this place will run if the input is done
                break;
            } else {
                //this place will run if input is not Add remove or done
                System.out.println("Invalid command.");
            }

        }
        superMarket.printAllProducts();
        //--------------------------- LECTURE 21 -----------------------
        System.out.println("Please enter your budget");
        double budget = Double.parseDouble(scanner.nextLine());
        Account account = new Account(budget);
        System.out.println("Your budget is "+account.getBalance());

        while(true){
            System.out.println("What do you want to buy (done = finish buying)");
            String requestedProductName = scanner.nextLine();
            if(requestedProductName.equalsIgnoreCase("done")){
                break;
            }
            int indexOfProduct = superMarket.getIndexOfProduct(requestedProductName);
            if(indexOfProduct==-1){
                System.out.println("This item does not exists");
            }else{
                SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();

                List<Product> listOfProducts = superMarket.getListOfProducts();
                Product selectedProduct = listOfProducts.get(indexOfProduct);
                System.out.println("How many of "+selectedProduct.getName()+" do you want");

                int requestedQuantity = Integer.parseInt(scanner.nextLine());

                //Lets check if the person has the enough money to buy the
                //product if so deduct the balance and insert the items.
                double totalCost = selectedProduct.getPrice()*requestedQuantity;
                totalCost = superMarketUtilities.round(totalCost);
                boolean isEnoughMoney =account.deduct(totalCost);
                if(isEnoughMoney){
                    System.out.println("You bought "+selectedProduct.getName());

                    account.addUpdateProduct(selectedProduct.getName(),requestedQuantity);
                }
            }
        }

        account.printAccountInfo();




        //--------------------------- LECTURE 21 -----------------------

        /**
         * Educational purposes
         */
     /*   Product oneProduct = new Product("a",1);
        Product oneProduct2 = new Product("a",1);
        List<Product> list = new ArrayList<>();
        list.add(oneProduct);
        list.add(oneProduct2);
        int index = list.indexOf(oneProduct2);*/
        /**
         * Educational purposes
         */
    }



    /**
     * This will try to add new product to the super market.
     */
    private  void addNewProduct(SuperMarket superMarket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name");
        String incomingProductName = scanner.nextLine();

        //This will return either -1 or the index of the product in the list.
        int indexOfProduct = superMarket.getIndexOfProduct(incomingProductName);
        if (indexOfProduct == -1) {
            System.out.println("Enter the product price");
            Double incomingPrice = Double.parseDouble(scanner.nextLine());
            SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
            incomingPrice = superMarketUtilities.round(incomingPrice);

            Product insertableProduct = new Product(incomingProductName, incomingPrice);

            //We are good to go. Because there is no product with this name
            superMarket.insertProduct(insertableProduct);


        } else {
            System.out.println("This product name already exists.");
        }

    }



    //--------------------------- LECTURE 21 -----------------------
    private  void removeProduct(SuperMarket superMarket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name to be removed");
        String incomingProductName = scanner.nextLine();

        //This will return either -1 or the index of the product in the list.
        int indexOfProduct = superMarket.getIndexOfProduct(incomingProductName);
        if (indexOfProduct == -1) {
            System.out.println("This product does not exists");
        } else {
            System.out.println("Product removed.");
            superMarket.removeProduct(indexOfProduct);
        }
    }
    //--------------------------- LECTURE 21 -----------------------
}
