package com.sda.tallinn6.fundamentals.practical;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        List<String> listOfAnimals = new ArrayList<>();
        listOfAnimals.add("Cat");
        listOfAnimals.add("Tiger");
        listOfAnimals.add("Monkey");
        listOfAnimals.add("Koala");
        listOfAnimals.add("Dog");

        System.out.println(listOfAnimals);

        if(listOfAnimals.contains("donkey")){
            System.out.println("Error!");
        }else{
            System.out.println("Donkey doesn't exist");
        }

        listOfAnimals.add(4, "Eagle");
        System.out.println(listOfAnimals);

        List<String> newList = new ArrayList<>();
        newList.addAll(listOfAnimals);
        System.out.println(newList);
    }
}
