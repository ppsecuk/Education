package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.concurrence_practice.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class BubbleSortCallable implements Callable<List<Integer>> {

    public BubbleSortCallable(List<Integer> asList) {

    }

    public BubbleSortCallable() {

    }

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(44);
        myList.add(55);
        myList.add(66);
        myList.add(77);
        myList.add(88);
        Thread.sleep(3000);
        return myList;
    }
}
