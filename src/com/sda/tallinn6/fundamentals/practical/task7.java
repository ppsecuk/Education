package com.sda.tallinn6.fundamentals.practical;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Please enter sentence");
            Scanner scanner = new Scanner(System.in);
            String sentence = scanner.nextLine();
            String done = new String("done");
            String[] word = sentence.trim().replaceAll("\\s+", " ").split(" ");
            System.out.println("Please enter a word number you want to see");
            int x = scanner.nextInt();
            if (x <= 0) {
                System.out.println("Error message");
            } else if (x > word.length) {
                System.out.println("Sentence doesn't contain that much words.");
            //}else if(x=done.equals("done")){
                System.exit(0);
            } else {
                System.out.println("You entered " + x + " , so result is: " + word[x - 1]);
            }
        }
    }
}
