package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.concurrence_practice.exercise;

import com.sda.tallinn6.fundamentals.practical.advanced_evgeni.concurrence_practice.exercise.BubbleSortCallable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class AppFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<List<Integer>> task1 = new BubbleSortCallable(Arrays.asList(3,1,4,5,9));
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        final Future<List<Integer>> resultOfExecution = executorService.submit(task1);

        while (!resultOfExecution.isDone()) {
            System.out.println("I am waiting... ");
            if (Math.random()*1000 < -1) {
                resultOfExecution.cancel(true);
                System.out.println();
            } else {

            }
        }
        System.out.println();

        if (!resultOfExecution.isCancelled()) {
            System.out.println("New array is: " + resultOfExecution.get());
        } else {
            System.out.println("Task was canceled!!!");
        }


    }
}
