package sda.java.util;

import sda.java.model.Employee;

public class Util {

        public static String[] parseNameSurname(String text){
            return text.split("\\s");
        }
        public static void printArray(Employee[] lists){
            for (Employee employee:lists) {
                System.out.println(employee);
            }
        }
}
