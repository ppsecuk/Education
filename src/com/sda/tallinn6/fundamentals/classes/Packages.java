package com.sda.tallinn6.fundamentals.classes;

import java.io.File;

public class Packages {
    /**
     * What is package ?
     * We can use packages to group together a related set of classes.
     * com.sda.tallinn6.fundamentals.classes.Packages also provide access protection and namespace management.
     * Think about we have an application and we have different aspects - like:
     * ui, database access,networking...
     *
     * In real life we never work unpacked projects.
     * We always start with creating our packages
     *
     * Naming is so important!
     *
     * first package name: com/gov/org
     * second : name of the organization
     * third : categorization
     * forth: sub categorization
     *
     * com.sda.tallinn6.java.fundamentals
     *
     *      - operators
     *      - conditions
     *      - loops
     *      - primitives
     *      - classes
     *      - ...
     */


    public static void main(String[] args) {
        File file = new File("anything");
        Bicycle b = new Bicycle();
    }


}
