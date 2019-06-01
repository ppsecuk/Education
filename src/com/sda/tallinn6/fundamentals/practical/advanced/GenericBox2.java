package com.sda.tallinn6.fundamentals.practical.advanced;

public class GenericBox2<E extends Shape>{
    private E item;

    public GenericBox2(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }
}
