package com.sda.tallinn6.fundamentals.practical;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Hi, please enter factorial (<=25). -1 is special command for exit");
        Scanner scanner = new Scanner(System.in);
        long i, fact = 1l;
        long number= Integer.parseInt(scanner.nextLine());
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        if(number==0){
            System.out.println("1");
        }else if(number<-1){
            System.out.println("Error message");
        }else if(number==-1){
            System.out.println("exiting...");
        }else {
            System.out.println("Factorial of " + number + " is: " + fact);
        }
    }
}
