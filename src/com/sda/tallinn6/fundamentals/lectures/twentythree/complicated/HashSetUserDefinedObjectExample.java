package com.tallinn.four.lectures.twentythree.complicated;

import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefinedObjectExample {
    public static void main(String[] args) {
        Set<Customer> customers = new HashSet<>();
        customers.add(new Customer(101, "Baris"));
        customers.add(new Customer(102, "Mohsen"));
        customers.add(new Customer(103, "Baris"));



        /*
          HashSet will use the `equals()` & `hashCode()` implementations
          of the Customer class to check for duplicates and ignore them
        */
        customers.add(new Customer(101, "Baris"));
        customers.add(new Customer(101, "baris"));
        customers.remove(new Customer(101, "Baris"));
        System.out.println(customers);
    }
}
