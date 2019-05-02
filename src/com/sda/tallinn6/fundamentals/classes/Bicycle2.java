package com.sda.tallinn6.fundamentals.classes;

import com.sda.tallinn6.fundamentals.data.types.FloatingPointPrimitives;

public class Bicycle2 {

    /**
     * What is an access modifier?
     * What is a Constructor?
     */
    private final String colour = "Red";
    private int cadence;
    private int gear;
    private int speed;
    private final String name;
    private boolean isBicycle;

    private FloatingPointPrimitives pointPrimitives;
    protected Person person;

    public Bicycle2(String name) {
        this.name = name;
    }

    public Bicycle2(int cadence, int gear, int speed, String name) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        this.name = name;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    private void changeCadence(int newCadence){
        this.cadence = newCadence;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear
                + " isBicycle:" + isBicycle);
    }
}
