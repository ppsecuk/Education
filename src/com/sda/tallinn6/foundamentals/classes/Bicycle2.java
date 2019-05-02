package com.sda.tallinn6.foundamentals.classes;

import com.sda.tallinn6.foundamentals.datatypes.FloatingPointPrimitives;
import com.sda.tallinn6.foundamentals.loops.ForLoop;

public class Bicycle2 {
    private int cadence;
    private int gear;
    private int speed;
    private final String name;
    private final String colour = "Red";
    private boolean isBicycle;

    FloatingPointPrimitives pointPrimitives;
    protected ForLoop forLoop;

    public Bicycle2(int cadence, int gear, int speed, String name) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        this.name = name;
    }

    public Bicycle2(String name) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        this.name = name;
    }

    public void applyBrake(int decrement){
        speed =- decrement;
    }
    private void changeCadence(int change){ // we cannot reach private from other file
        cadence =- change;
    }
    public void speedUp(int increment){
        speed =+ increment;
    }
    void printStates() {
        System.out.println("cadence: " + cadence + " speed: " + speed + " Is bicycle? " + isBicycle + " gear: " + gear);
    }

}
