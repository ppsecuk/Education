package com.sda.tallinn6.fundamentals.practical;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Welcome, please enter first number");
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter second number");
        int y = Integer.parseInt(scanner.nextLine());

        if(x==y){
            System.out.println("Numbers are same");
        }else{
            System.out.println("Numbers are not correct");
        }
    }
}
