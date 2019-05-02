package com.sda.tallinn6.fundamentals.practical;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Please Enter String");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name.replace("", " ").trim());

        char[] array1 = name.toCharArray();
        for (int i=0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }

    }
}
