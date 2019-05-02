package com.sda.tallinn6.foundamentals.classes;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    protected int testParameter;
    String colour;

    public Bicycle(){

    }
    void changeGear(int newValue){
        gear = newValue;
    }
    void speedUp(int increment) {
        speed = speed + increment;
    }
    void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    void printStates() {
        System.out.println("gear: " + gear + " speed: " + speed);
    }
}
