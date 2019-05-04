package com.sda.tallinn6.fundamentals.classes.statics;

public class Bicycledemo2 {
    public static void main(String[] args) {
        Bicycle2 bike = new Bicycle2(50,1,20);
        System.out.println(Bicycle2.count);
        System.out.println(bike.instanceCount);

        Bicycle2 anotherBike = new Bicycle2(20,3,4);
        System.out.println(Bicycle2.count);
        System.out.println(anotherBike.instanceCount);

    }
}
