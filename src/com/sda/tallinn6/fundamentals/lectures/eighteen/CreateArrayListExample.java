package com.tallinn.four.lectures.eighteen;

import java.util.ArrayList;
import java.util.List;

/**
 * Add animals
 * dog, cat, tiger, bear, monkey
 * print
 *
 * Does donkey exist = print error.
 * print
 *
 * add the eagle on the 4th index.
 * print
 *
 * create a new list
 * put all the items of the animal list to this new list.
 *
 */
public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> listOfAnimals = new ArrayList<>();
        listOfAnimals.add("dog");
        listOfAnimals.add("cat");
        listOfAnimals.add("tiger");
        listOfAnimals.add("bear");
        listOfAnimals.add("monkey");

        System.out.println(listOfAnimals);

        if(listOfAnimals.contains("monkey")){
            System.out.println("Why donkey is here?");
        }

        listOfAnimals.add(4,"eagle");
        System.out.println(listOfAnimals);

       List<String> newAnimalList = new ArrayList<>();
        newAnimalList.addAll(listOfAnimals);
        System.out.println(newAnimalList);

        List<String> newList;
        newList=listOfAnimals;
        System.out.println(newList);

        listOfAnimals.remove(0);
        System.out.println(newList);
        newList.remove(0);
        System.out.println(listOfAnimals);
    }
}
