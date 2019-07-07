package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.concurrence_practice;

public class App {
    public static void main(String[] args) {
        Thread producer = new Thread();
        Thread consumer = new Thread();
        producer.start();
        consumer.start();
    }
}
