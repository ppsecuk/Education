package com.sda.tallinn6.fundamentals.classes.statics;

public class Bicycle2 {
    private int cadence;
    private int gear;
    private int speed;
    static int count = 0;
    public int instanceCount;

    public Bicycle2(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        count++;
        instanceCount++;
    }

}
