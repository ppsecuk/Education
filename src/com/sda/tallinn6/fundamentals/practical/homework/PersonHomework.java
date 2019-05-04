package com.sda.tallinn6.fundamentals.practical.homework;

import java.util.ArrayList;
import java.util.List;

public class PersonHomework {
    public static void main(String[] args) {

        Person person1 = new Person("Roman", 56);
        Person person2 = new Person("Pavel", 13);
        Person person3 = new Person("Murat", 16);
        Person person4 = new Person("Name", 17);
        Person person5 = new Person("Namess", 20);

        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(person3);
        listOfPersons.add(person4);
        listOfPersons.add(person5);

        Person firstPerson = listOfPersons.get(0);

        System.out.println(firstPerson.getName() + " " + firstPerson.getAge());

        for (int i = 0; i < listOfPersons.size(); i++) {
            System.out.println(listOfPersons.get(i).getName() + " " + listOfPersons.get(i).getAge());
        }

        System.out.println(listOfPersons);
    }
}
