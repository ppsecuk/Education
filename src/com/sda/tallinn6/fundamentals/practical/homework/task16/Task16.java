package com.sda.tallinn6.fundamentals.practical.homework.task16;

import java.util.List;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("Welcome to school.");
        Methods methods = new Methods();
        Task16 task16 = new Task16();

        while(true){
            System.out.println("What action you want to do? add/remove/done/search/view");
            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();

            if(action.equalsIgnoreCase("done")){
                System.out.println("OK. You are done, bye.");
                break;
            }else if (action.equals("add")) {
                System.out.println("OK. Let's add. Please provide student name:");
                String newStudentName = scanner.nextLine();
                if (methods.getIndexOfStudent(newStudentName) == -1) {
                    Students addStudent = new Students(newStudentName);
                    methods.insertStudent(addStudent);
                    System.out.println("OK. Student has been inserted successfully.");
                } else {
                    System.out.println("Error. Failed to add student.");
                }
            }else if(action.equals("view")){
                methods.printAllStudents();
            }else if(action.equals("remove")){
                System.out.println("OK. Let's remove. Please enter students name:");
                String existingStudentName = scanner.nextLine();

                if(methods.getIndexOfStudent(existingStudentName)==-1){
                    System.out.println("ERROR. This student doesn't exist");
                }else {
                    methods.removeStudent(methods.getIndexOfStudent(existingStudentName));
                    System.out.println("OK. Student has been deleted.");
                }
            }
        }
    }
}
