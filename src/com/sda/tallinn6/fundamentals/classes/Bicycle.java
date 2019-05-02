package com.sda.tallinn6.fundamentals.classes;

public class Bicycle {

    // // field, constructor, and method declarations
    // What is class ?
    // What is a method?
    // What is an object?
    // Object's life-cycle
    // What can class consist? - member variables,methods

    int cadence = 0;
    int speed = 0;
    int gear = 1;
    protected  int testAccessMod;
    public int accessibleVar;
    String colour;

    //constructor
    public Bicycle(){

    }


    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

}


class Person{

}
