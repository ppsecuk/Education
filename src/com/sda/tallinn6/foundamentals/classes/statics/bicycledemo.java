package com.sda.tallinn6.foundamentals.classes.statics;

public class bicycledemo {
    public static void main(String[] args) {
        bicycle bike = new bicycle(50,1,20);
        System.out.println(bicycle.count);
        System.out.println(bike.instanceCount);

        bicycle anotherBike = new bicycle(20,3,4);
        System.out.println(bicycle.count);
        System.out.println(anotherBike.instanceCount);

    }
}
