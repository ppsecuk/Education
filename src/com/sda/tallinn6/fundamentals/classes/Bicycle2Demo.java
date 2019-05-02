package com.sda.tallinn6.fundamentals.classes;

import com.sda.tallinn6.fundamentals.classes.Bicycle2;

import java.time.format.TextStyle;

public class Bicycle2Demo {
    public static void main(String[] args) {
        com.sda.tallinn6.fundamentals.classes.Bicycle2 myBike = new com.sda.tallinn6.fundamentals.classes.Bicycle2(10,0,1, "test");
        com.sda.tallinn6.fundamentals.classes.Bicycle2 yourBike = new Bicycle2("test2");
        yourBike.printStates();

    }
}
