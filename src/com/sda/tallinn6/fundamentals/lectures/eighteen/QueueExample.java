package com.tallinn.four.lectures.eighteen;

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

        String name = waitingQueue.remove(); //(The Dequeue operation)
        System.out.println(name);

        name = waitingQueue.poll();
        System.out.println(name);
        System.out.println(waitingQueue);







    }
}
