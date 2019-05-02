package com.sda.tallinn6.foundamentals.classes;

import java.time.format.TextStyle;

public class Bicycle2Demo {
    public static void main(String[] args) {
        Bicycle2 myBike = new Bicycle2(10,0,1, "test");
        Bicycle2 yourBike = new Bicycle2("test2");
        yourBike.printStates();

    }
}
