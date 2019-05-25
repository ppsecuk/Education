package com.sda.tallinn6.fundamentals.practical.advanced;

public class StudentDemo {
    public static void main(String[] args) {

        Student student1 = new Student("John", "Johnson", 20, true);

        student1.printDetails();

        Student student2 = new Student("Jack", "Jackson", 21, true);

        student2.printDetails();
    }
}
