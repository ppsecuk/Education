package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.homework;

import java.util.Scanner;

public class StringAndItsFirstChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write any sentence: ");
        String usersInput = scanner.nextLine();

        System.out.println("Length: " + usersInput.length());
        System.out.println("First character is: " + usersInput.charAt(0));
    }
}
