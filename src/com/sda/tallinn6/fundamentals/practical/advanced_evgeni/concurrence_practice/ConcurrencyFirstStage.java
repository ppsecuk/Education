package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.concurrence_practice;

public class ConcurrencyFirstStage {
    public static void main(String[] args) {
        Thread thread1 = new Task1("1") ;
        Thread thread2 = new Task1("2");
        Thread thread3 = new Task1("3");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println();
    }
}
