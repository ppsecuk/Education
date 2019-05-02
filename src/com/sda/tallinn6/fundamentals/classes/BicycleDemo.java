package com.sda.tallinn6.fundamentals.classes;

public class BicycleDemo {

    public static void main(String[] args) {

        // Create two different
        // com.sda.tallinn6.fundamentals.classes.Bicycle objects
        Bicycle myBike = new Bicycle();
        Bicycle yourBike = new Bicycle();
        System.out.println(myBike);
        System.out.println(yourBike);
        myBike.speed = 10;
        myBike.cadence = 2;
        myBike.gear = 2;
        System.out.println(myBike.speed);
        System.out.println(myBike.cadence);
        System.out.println(myBike.gear);
        yourBike.gear = 4;
        yourBike.speed = 10;
        System.out.println(yourBike.speed);
        System.out.println(yourBike.cadence);
        System.out.println(yourBike.gear);



        // Invoke methods on
        // those objects
        System.out.println("Invoking methods..");
        myBike.changeCadence(50);
        myBike.speedUp(10);
        myBike.changeGear(2);
        myBike.printStates();

        System.out.println("Your bike invoking methods");
        yourBike.changeCadence(50);
        yourBike.printStates();
        yourBike.speedUp(10);
        yourBike.printStates();
        yourBike.changeGear(2);
        yourBike.printStates();
        yourBike.changeCadence(40);
        yourBike.printStates();
        yourBike.speedUp(10);
        yourBike.printStates();
        yourBike.applyBrakes(4);
        yourBike.printStates();
        yourBike.changeGear(3);
        yourBike.printStates();

        Person person = new Person();
    }
}
