package com.tallinn.four.lectures.eighteen;

import java.util.ArrayList;
import java.util.List;

public class PersonHomework {

    public static void main(String[] args) {
        //I create an arraylist. It will consist Persons
        List<Person> personList = new ArrayList<>();
        //I am creating 5 objects (They are 5 people)
        Person person = new Person();
        person.setAge(1);
        person.setName("Murat");
        Person person1 = new Person("Roman",56);
        Person person2 = new Person("Asli",18);
        Person person3 = new Person("Mohsen",24);
        Person person4 = new Person("Baris",20);

        //I am adding 5 people to the list.
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        Person firstPerson = personList.get(0);

        System.out.println(firstPerson.getName()+" "+
                firstPerson.getAge());
        //I will print all information
        for (Person someone:personList) {
            System.out.println(someone.getName()+" "+
                    someone.getAge());
        }
        for(int counter=0;counter<personList.size();
            counter++){
            System.out.println(personList.get(counter).getName()+" "+personList.get(counter).getAge());
        }

        System.out.println(personList);





    }
}
