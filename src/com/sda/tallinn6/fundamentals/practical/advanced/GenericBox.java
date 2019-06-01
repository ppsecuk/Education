package com.sda.tallinn6.fundamentals.practical.advanced;

public class GenericBox <E>{
    private E item;

    public GenericBox(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }
}
