package com.sda.tallinn6.fundamentals.lectures.nineteen;

public class Product {
    private String name;
    private double price;
    //--------------------------- LECTURE 21 -----------------------
    private int quantity;
    //--------------------------- LECTURE 21 -----------------------
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }
    //--------------------------- LECTURE 21 -----------------------
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    //--------------------------- LECTURE 21 -----------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
