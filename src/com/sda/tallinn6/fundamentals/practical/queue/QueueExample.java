package com.sda.tallinn6.fundamentals.practical.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> waitingQueue = new LinkedList<>();
        waitingQueue.add("Kaspar");
        waitingQueue.add("Pavel");
        waitingQueue.add("Vladimir");
        waitingQueue.add("Heidi");

        System.out.println(waitingQueue);

        String name = waitingQueue.remove(); //removing from top
        System.out.println(name); // this name was removed

        name = waitingQueue.poll(); //same as remove, but when no data left, shows 'null'. Remove shows 'exception error'
        System.out.println(name);
        System.out.println(waitingQueue);
    }
}
