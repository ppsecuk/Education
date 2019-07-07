package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.concurrence_practice;

public class Producer implements Runnable{
    @Override
    public void run() {
        System.out.println("I produce the following number: " + Math.random());
    }

}
