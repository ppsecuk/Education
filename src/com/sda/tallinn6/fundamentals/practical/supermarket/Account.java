package com.sda.tallinn6.fundamentals.practical.supermarket;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double account;
    private List<Product> listOfProducts = new ArrayList<>();

    public double getAccount() {
        return account;
    }

    public Account(double account) {
        this.account = account;
    }

    public void setAccount(double account) {
        this.account = account;

    }

    public void printAccountInfo(String boughtProducts, int quantity, double balance){
    }

    public boolean deduct(double balance, double FinalSum){
        if(balance>FinalSum){
            return true;
            //balance = balance - FinalSum;
            //System.out.println("OK. You have purchased an item. Your new balance is: " + balance + " EUR.");
        }return false;
    }

    public void appUpdateProduct(Product product){
        for(int i=0;i<listOfProducts.size();i++){

        }
    }
}
