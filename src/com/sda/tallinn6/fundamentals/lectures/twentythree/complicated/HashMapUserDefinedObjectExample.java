package com.tallinn.four.lectures.twentythree.complicated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedObjectExample {
    public static void main(String[] args) {
        Map<Integer, Customer> employeesMap = new HashMap<>();
        Customer insertingObject = new Customer(1,"Basaran");
        employeesMap.put(1,insertingObject);
        employeesMap.put(5,insertingObject);

        employeesMap.put(2,new Customer(2,"Asli"));
        employeesMap.put(3,new Customer(3,"Baris"));
        System.out.println(employeesMap);

        //Find basaran and print his information
        for(Map.Entry<Integer, Customer> entry: employeesMap.entrySet()) {
            Customer iteratedCustomer = entry.getValue();
            if(iteratedCustomer.getName().equalsIgnoreCase("bAsaran")){
                System.out.println(iteratedCustomer);
            }
        }
        //remove basaran......
        ArrayList<Integer> basaransTobeRemoved = new ArrayList<>();
        for(Map.Entry<Integer, Customer> entry: employeesMap.entrySet()) {
            Customer iteratedCustomer = entry.getValue();
            if(iteratedCustomer.getName().equalsIgnoreCase("bAsaran")){
              // employeesMap.remove(entry.getKey());
                basaransTobeRemoved.add(entry.getKey());
            }
        }
        for (Integer key: basaransTobeRemoved){
            employeesMap.remove(key);
        }

        System.out.println(employeesMap);




    }
}
