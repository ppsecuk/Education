package com.sda.tallinn6.fundamentals.practical.homework.task15;


import com.tallinn.four.lectures.twelve.SuperMarketUtilities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {
    double balance;
    String[] items = {"Headset","Meat", "Pineapple", "Book", "Dinner Coupon"};
    double[] prices = {20.04, 2.20, 3.50, 14.67, 18.02};

    public void printItemsWithPrices() {
        for (int counter=0;counter<items.length;counter++){
            if(!items[counter].isEmpty()){
                System.out.println("Auctioned Item:"+items[counter]+" Price:"+prices[counter]);
            }

        }
    }

    public double getBalance() {
        return balance;
    }

    public double[] getPrices() {
        return prices;
    }

    public void removeItemSold(int index){
        items[index] ="";
    }

    public void addMoneyToAccount(int index){
        balance = balance+prices[index];
        balance=round(balance);
    }

    public Double round(Double val) {
        return new BigDecimal(val.toString()).
                setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public String[] getItems() {
        return items;
    }

    public Account() {
    }
}
