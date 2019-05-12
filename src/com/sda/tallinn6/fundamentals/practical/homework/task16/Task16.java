//package com.sda.tallinn6.fundamentals.practical.homework.task16;
//
//import java.util.Scanner;
//
//public class Task16 {
//    public static void main(String[] args) {
//        System.out.println("Welcome to school.");
//        StudentsUtilities studentsUtilities = new StudentsUtilities();
//        Task16 task16 = new Task16();
//
//        while(true){
//            System.out.println("What action you want to do? add/remove/done/search/view");
//            Scanner scanner = new Scanner(System.in);
//            String action = scanner.nextLine();
//
//            if(action.equalsIgnoreCase("done")){
//                System.out.println("OK. You are done, bye.");
//                break;
//            }else if (action.equals("add")) {
//                System.out.println("OK. Let's add. Please provide student name:");
//                String newStudentName = scanner.nextLine();
//               // if (studentsUtilities.getIndexOfStudent(newStudentName) == -1) {
//                    //Students addStudent = new Students(newStudentName);
//                    //studentsUtilities.insertStudent(addStudent);
//                    System.out.println("OK. Student has been inserted successfully.");
//                } else {
//                    System.out.println("Error. Failed to add student.");
//                }
//            }else if(action.equals("view")){
//                studentsUtilities.printAllStudents();
//            }else if(action.equals("remove")){
//                System.out.println("OK. Let's remove. Please enter students name:");
//                String existingStudentName = scanner.nextLine();
//
//                if(studentsUtilities.getIndexOfStudent(existingStudentName)==-1){
//                    System.out.println("ERROR. This student doesn't exist");
//                }else {
//                    studentsUtilities.removeStudent(studentsUtilities.getIndexOfStudent(existingStudentName));
//                    System.out.println("OK. Student has been deleted.");
//                }
//            }
//        }
//    }
//}
