package com.sda.tallinn6.fundamentals.classes.statics;

public class BicycleDemo {

    public static void main(String[] args) {
        Bicycle bike = new Bicycle(50, 1, 20);

        System.out.println(Bicycle.count);
        System.out.println(bike.instanceCount);
        Bicycle.calculateSomething();


        Bicycle anotherBike = new Bicycle(20, 3, 10);
        System.out.println(Bicycle.count);
        System.out.println(anotherBike.instanceCount);

        System.out.println(Bicycle.TEMPERATURE_BOILING_WATER);
        System.out.println(Bicycle.PI);



    }

}
