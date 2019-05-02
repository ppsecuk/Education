package com.sda.tallinn6.foundamentals.classes;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle();
        Bicycle yourBike = new Bicycle();

        System.out.println(myBike);
        myBike.speed = 10;
        myBike.cadence = 2;
        myBike.gear = 2;
        System.out.println(myBike.speed);
        System.out.println(myBike.cadence);
        System.out.println(myBike.gear);


        System.out.println(yourBike);
        yourBike.gear = 4;
        yourBike.speed = 20;
        yourBike.cadence = 3;
        System.out.println(yourBike.speed);
        System.out.println(yourBike.cadence);
        System.out.println(yourBike.gear);

        myBike.changeGear(40);
        myBike.speedUp(15);
        myBike.printStates();
    }
}
