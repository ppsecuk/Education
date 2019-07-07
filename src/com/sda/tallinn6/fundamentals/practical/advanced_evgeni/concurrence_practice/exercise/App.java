package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.concurrence_practice.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        Thread bubbleSortThread = new BubbleSort();
        bubbleSortThread.setName("Bubble sorting thread");
        bubbleSortThread.start();

        //Runnable bubbleNewSort = new BubbleRunnableSort();
        //Thread secondThread = new Thread(bubbleNewSort);
        //secondThread.setName("Bubble sorting 2 thread");
        //secondThread.start();

        Thread thirdThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("I am from " + Thread.currentThread().getName());

        });
        thirdThread.start();

        //Please create pool of 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Callable<List<Integer>> myCallableThread = new BubbleSortCallable();

        final Future<List<Integer>> resultOfExecution = executorService.submit(myCallableThread);
        List<Integer> resultList = new ArrayList<>();
        try {
            resultList = resultOfExecution.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        final List<Integer> integers = executorService.invokeAny(Arrays.asList(myCallableThread), 5000, TimeUnit.MILLISECONDS);
        integers.stream().forEach(el -> System.out.println(el));

        System.out.println(resultList.size());

//        Thread callableThread = new Thread(myCallableThread);

    }
}
