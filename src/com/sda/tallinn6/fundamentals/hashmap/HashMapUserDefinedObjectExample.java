package com.sda.tallinn6.fundamentals.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedObjectExample {
    public static void main(String[] args) {
        Map<Integer, Customer> employeesMap = new HashMap<>();
        Customer insertingObject = new Customer("Pavel", 1); // way1. insert like this
        employeesMap.put(1, insertingObject); // way1. insert like this
        employeesMap.put(2, new Customer("Tomas", 2)); // way2. or like this, this way is faster
        employeesMap.put(3, new Customer("Boris", 3));// way2. or like this, this way is faster
        System.out.println(employeesMap);

        //find Pavel and print his info
        for (Map.Entry<Integer, Customer> entry : employeesMap.entrySet()) {
            Customer iteratedCustomer = entry.getValue();
            if (iteratedCustomer.getName().equalsIgnoreCase("Pavel")) {
                System.out.println(iteratedCustomer);
            }
        }
        //remove Pavel
        ArrayList<Integer> pavelToBeRemoved = new ArrayList<>();
        for(Map.Entry<Integer, Customer> entry: employeesMap.entrySet()){
            Customer iteratedCustomer = entry.getValue();
            if(iteratedCustomer.getName().equalsIgnoreCase("pavel")){
                pavelToBeRemoved.add(entry.getKey());
            }
        }
        for(Integer key: pavelToBeRemoved){
            employeesMap.remove(key);
        }
    }
}
