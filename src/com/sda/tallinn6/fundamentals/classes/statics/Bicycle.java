package com.sda.tallinn6.fundamentals.classes.statics;

public class Bicycle {

    private int cadence;
    private int gear;
    private int speed;
    public String name;
    static int count = 0;
    public int instanceCount;

    public static final double PI = 3.141592567890345;
    public static final int TEMPERATURE_BOILING_WATER =100;

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        count++;
        instanceCount++;
    }


    public static void calculateSomething(){
        System.out.println("I am a static method");
    }
}
