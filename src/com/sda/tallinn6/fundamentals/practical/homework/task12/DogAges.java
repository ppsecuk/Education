package com.sda.tallinn6.fundamentals.practical.homework.task12;

import java.util.ArrayList;
import java.util.List;

public class DogAges {
    public void printAgeDecisionForBeagle(Dog dog){
        if(dog.age<3){
            System.out.println("This dog is young.");
        }else if(dog.age<6){
            System.out.println("This dog is adult.");
        }else if(dog.age>6){
            System.out.println("This dog is old.");
        }else{
            System.out.println("Incorrect value, please enter positive number.");
        }
    }

    public void printAgeDecisionForHusky(Dog dog){
        if(dog.age<4){
            System.out.println("This dog is young.");
        }else if(dog.age<7){
            System.out.println("This dog is adult.");
        }else if(dog.age>7){
            System.out.println("This dog is old.");
        }else{
            System.out.println("Incorrect value, please enter positive number.");
        }
    }

    public void printAgeDecisionForChihuahua(Dog dog){
        if(dog.age<3){
            System.out.println("This dog is young.");
        }else if(dog.age<7){
            System.out.println("This dog is adult.");
        }else if(dog.age>7){
            System.out.println("This dog is old.");
        }else{
            System.out.println("Incorrect value, please enter positive number.");
        }
    }

    private List<Dog> listOfDogs = new ArrayList<>();

    public void printAllDogInfo(String name, String species, int age){
        for (int i = 0; i < listOfDogs.size(); i++) {
            Dog existingDogs = listOfDogs.get(i);
            System.out.println(listOfDogs.get(i).getName() + " " + listOfDogs.get(i).getSpecies() + " " + listOfDogs.get(i).getAge());
        }
    }
}
