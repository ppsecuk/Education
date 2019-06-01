package com.sda.tallinn6.fundamentals.practical.advanced;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMale;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Student(String firstName, String lastName, int age, boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }

    public void printDetails(){
        System.out.println("Students name is: " + this.firstName);
        System.out.println("Students surname is: " + this.lastName);
        System.out.println("Students age is: " + this.age);
        System.out.println("Students is male? " + this.isMale);
    }

    @Override // annotation to compiler
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }
}
