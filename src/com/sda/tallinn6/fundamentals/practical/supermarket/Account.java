package com.sda.tallinn6.fundamentals.practical.supermarket;

import java.util.ArrayList;
import java.util.List;

public class Account {
    double balance;
    List<Product> listOfProducts = new ArrayList<>();

    public double getBalance() {
        return balance;
    }

    public Account(double account) {
        this.balance = account;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public void printAccountInfo(){
        for (Product boughtProduct : listOfProducts) {
            System.out.println("Product name: " + boughtProduct.getName() + " Quantity: " + boughtProduct.getQuantity());
        }
            System.out.println("Your current balance is: " + balance);
    }

    public boolean deduct(double cost){
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        cost = superMarketUtilities.round(cost);
        balance = superMarketUtilities.round(balance);
        if(balance <cost){
            System.out.println("You don't have enough money.");
            return false;
        }else{
            balance = balance-cost;
            balance = superMarketUtilities.round(balance);
            return true;
        }
    }

    public void appUpdateProduct(String productName, int amount){
        List<Product> listOfBoughtProducts = new ArrayList<>();

        for (Product boughtExistingProduct : listOfBoughtProducts) {
            if(boughtExistingProduct.getName().equalsIgnoreCase(productName)){
                int updatedAmount = boughtExistingProduct.getQuantity()+amount;
                return;
            }
        }Product newProduct = new Product();
        newProduct.setName(productName);
        newProduct.setQuantity(amount);
        listOfBoughtProducts.add(newProduct);
        System.out.println("Product has been added");
    }


}
