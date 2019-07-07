package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.concurrence_practice.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SorterExecutorApp {
    public static void main(String[] args) {
        final List<Integer> unsortedList = new ArrayList<>();
        int countOfNumbers = 1000;
        for (int i = 0; i < countOfNumbers; i++) {
            unsortedList.add((int)(Math.random()*50000));
        }

        for (int i = 0; i < countOfNumbers; i++) {
            System.out.println(unsortedList.get(i));
        }
        Callable<List<Integer>> bubbleSort = new BubbleSortCallable(unsortedList);
        Callable<List<Integer>> simpleSort = new SimpleSortCallable(unsortedList);
        ExecutorService ex = Executors.newFixedThreadPool(2);
        //ex.submit(simpleSort).get();

    }
}
