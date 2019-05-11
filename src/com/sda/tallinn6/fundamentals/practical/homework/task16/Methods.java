package com.sda.tallinn6.fundamentals.practical.homework.task16;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    List<Students> listOfStudents = new ArrayList<>();

    public List<Students> getListOfStudents() {
        return listOfStudents;
    }

    public void printAllStudents(){
        for (int i = 0; i < listOfStudents.size(); i++) {
            Students existingStudent = listOfStudents.get(i);
            System.out.println(listOfStudents.get(i).getName());
        }
    }

    public void insertStudent(Students students){
        listOfStudents.add(students);
    }

    public void removeStudent(int index){
        listOfStudents.remove(index);
    }

    public int getIndexOfStudent(String name) {

        for (int i = 0; i < listOfStudents.size(); i++) {
            Students students = listOfStudents.get(i);
            String nameOfThisStudent = students.getName();
            if (nameOfThisStudent.equalsIgnoreCase(name)) {
                return i;
            }
        }return -1;
    }
}
