package com.sda.tallinn6.fundamentals.classes;

public class BicycleDemo2 {

    public static void main(String[] args) {
        // Create two different
        // com.sda.tallinn6.fundamentals.classes.Bicycle objects

        Bicycle2 myBike = new Bicycle2(10,
                0,1,"Storm");
        Bicycle2 yourBike = new Bicycle2("Hello");

        yourBike.printStates();

    }
}
