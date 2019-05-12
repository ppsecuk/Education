package com.sda.tallinn6.fundamentals.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);
        numberMapping.put("Four", 4);
        numberMapping.put("Twelve", 12);
        System.out.println(numberMapping);

        String input = "One";
        if(numberMapping.containsKey(input)){
            int value = numberMapping.get(input);
            System.out.println(input + " is " + value);
        }else{
            System.out.println("No value for " + numberMapping);
        }
        if(numberMapping.containsValue(1)){
            System.out.println("There is a key for value 1");
        }else{
            System.out.println("There is no value for 1");
        }

        for(Map.Entry<String, Integer> entry: numberMapping.entrySet()) {
            System.out.println(entry.getKey() + " >= " + entry.getValue());
        }
        Integer retrievedValue = numberMapping.remove("One");
        System.out.println(numberMapping);
        boolean isRemoved = numberMapping.remove("Two", 3);

        if(isRemoved){
            System.out.println("It is removed");
        }else{
            System.out.println("It is not removed");
        }
    }
}
