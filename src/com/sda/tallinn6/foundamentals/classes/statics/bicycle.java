package com.sda.tallinn6.foundamentals.classes.statics;

public class bicycle {
    private int cadence;
    private int gear;
    private int speed;
    static int count = 0;
    public int instanceCount;

    public bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        count++;
        instanceCount++;
    }

}
