package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.concurrence_practice;

public class Consumer implements Runnable{
    @Override
    public void run() {
        System.out.println("I consume following number: " + Math.random());
    }
}
