package com.sda.tallinn6.fundamentals.practical.homework.task16;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {


    public static void main(String[] args) throws IOException {
        List<String> listOfStudents = new ArrayList<>();
        System.out.println("Welcome to School");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do ? Add/Remove/Search/View/Done");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("Done")) {
                break;
            } else if (command.equalsIgnoreCase("Add")) {
                System.out.println("Enter student name");
                String studentName = scanner.nextLine();
                listOfStudents.add(studentName);
                System.out.println(studentName + " is added.");
            } else if (command.equalsIgnoreCase("Remove")) {
                System.out.println("Enter student name");
                String studentName = scanner.nextLine();

                boolean isRemoved = listOfStudents.remove(studentName);
                if (isRemoved) {
                    System.out.println(studentName + " is removed.");
                } else {
                    System.out.println(studentName + " does not exist.");
                }

            } else if (command.equalsIgnoreCase("Search")) {
                System.out.println("Enter student name");
                String studentName = scanner.nextLine();

                int count = 0;
                for (String student : listOfStudents) {
                    if (studentName.equalsIgnoreCase(student)) {
                        count++;
                    }
                }

                if (count!=0) {
                    System.out.println("Total occurrence " + count);
                } else {
                    System.out.println(studentName + " does not exist.");
                }
            } else if (command.equalsIgnoreCase("View")) {
                System.out.println(listOfStudents);
            } else {
                System.out.println("Invalid command");
            }

            System.out.println("---------------------------");
        }
    }

}
