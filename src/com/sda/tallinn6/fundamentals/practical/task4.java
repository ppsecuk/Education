package com.sda.tallinn6.fundamentals.practical;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("welcome stranger, please enter password:");
        Scanner scanner = new Scanner(System.in);
        String password1 = "password1";
        String password2 = "Password2";

        //1st password part
        if(password1.equals(scanner.nextLine())){
            System.out.println("Ok. Please enter next password");
        }else{
            System.out.println("Wrong password, bye");
            return;
        }

        // 2nd password part
        if(password2.equals(scanner.nextLine())){
            System.out.println("Ok.");
        }else{
            System.out.println("Wrong password, bye");
            System.exit(0); // same as return
        }

    }
}
