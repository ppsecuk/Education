package com.sda.tallinn6.fundamentals.practical.advanced.concurrency;

public class StopWatchTread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <10; i++){
            System.out.println(getName() + "Stop watch " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public StopWatchTread(String name) {
        super(name);
    }
}
