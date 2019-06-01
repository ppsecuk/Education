package com.sda.tallinn6.fundamentals.practical.advanced;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> miniDictionary = new HashMap<>();

        miniDictionary.put("Student", "A student is a person...");
        miniDictionary.put("Market", "A market is a place...");
        miniDictionary.put("Class", "A class is an environment...");

        System.out.println(miniDictionary.get("Student"));

        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student("Tom", "Tomsom", 14, true));
        studentMap.put(2, new Student("Toma", "Tomsom", 13, false));

        System.out.println(studentMap.get(1));

    }
}
