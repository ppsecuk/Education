package com.sda.tallinn6.fundamentals.practical.advanced.concurrency;

public class StopWatchDemo {
    public static void main(String[] args) {
        StopWatchTread stopWatchTread1 = new StopWatchTread("1");
        StopWatchTread stopWatchTread2 = new StopWatchTread("2");
        //stopWatchTread.run(); //bad practice
        stopWatchTread1.start(); // good practice
        stopWatchTread2.start(); // good practice

        Thread stopWatchRunnable1 = new Thread(new StopWatchRunnable("run1"));
        Thread stopWatchRunnable2 = new Thread(new StopWatchRunnable("run2"));

        stopWatchRunnable1.start();
        stopWatchRunnable2.start();
    }
}
