package com.sda.tallinn6.fundamentals.practical.homework.task16;


public class Students {
    private String name;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Students(String name) {
        this.name = name;
    }
}
