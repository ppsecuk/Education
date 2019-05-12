package com.tallinn.four.lectures.twentythree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> daysOfWeek = new HashSet<>();

        // Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Adding duplicate elements will be ignored
        daysOfWeek.add("Monday");

        System.out.println(daysOfWeek);
        //----------------------------------------------------------
        Set<String> anotherSet = new HashSet<>();
        anotherSet.addAll(daysOfWeek);
        System.out.println(anotherSet);
        //----------------------------------------------------------
        if(anotherSet.contains("Monday")) {
            System.out.println("Monday is in the popular cities set.");
        } else {
            System.out.println("Monday is not in the popular cities set.");
        }
        //----------------------------------------------------------
        for(String days: anotherSet) {
            System.out.println(days);
        }
        //----------------------------------------------------------
        anotherSet.remove("Monday");
        System.out.println(anotherSet);

        List<String> moreDays = new ArrayList<>();
        moreDays.add("Friday");
        moreDays.add("Sunday");
        anotherSet.removeAll(moreDays);
        System.out.println(anotherSet);
        //----------------------------------------------------------


    }
}
