package com.sda.tallinn6.fundamentals.practical.homework.task12;

public class Dog {
    public String name;
    public String species;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }
}
