/*package com.sda.tallinn6.fundamentals.practical;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        while (true) {
            //New solution from trainer:
            /*
        }
            System.out.println("Please enter sentence");
            Scanner scanner = new Scanner(System.in);
            String sentence = scanner.nextLine();
            //String done = new String("done");
            // String[] word = sentence.trim().replaceAll("\\s+", " ").split(" ");
            System.out.println("Please enter a word number you want to see");
            int x = scanner.nextInt();
            if (sentence.equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Which order you want?");
                String numberOfNumber = scanner.nextLine();

                if (Integer.parseInt(numberOfNumber) <= 0) {
                    System.out.println("cannot accept 0 or negative number");
                } else {
                    String[] splitteWords = sentence.split(" ");

                    int counter = 1;
                    boolean found = false;

                    for (String word : splitteWords) {
                        if (!word.isEmpty() && !word.equalsIgnoreCase(" ")) {
                            if (counter == Integer.parseInt(numberOfNumber)) {
                                System.out.println("Result word: " + word);
                                found = true;
                                break;
                            } else {
                                counter++;
                            }
                        }
                    }
                /*System.out.println("Sentence doesn't contain that much words.");
            }else if(x <= 0) {
                System.out.println("Error message");
            }else{
                System.out.println("You entered " + x + " , so result is: " + word[x - 1]);
            }
                }
            }*/


            //Old solution is:
           /* System.out.println("Please enter sentence");
            Scanner scanner = new Scanner(System.in);
            String sentence = scanner.nextLine();
            //String done = new String("done");
            String[] word = sentence.trim().replaceAll("\\s+", " ").split(" ");
            System.out.println("Please enter a word number you want to see");
            int x = scanner.nextInt();

            if (sentence.equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Please enter a word number you want to see");
            }
            if(x <= 0){
                System.out.println("Error message");
            }if (x > word.length) {
                System.out.println("Sentence doesn't contain that much words.");
            } else {
                System.out.println("You entered " + x + " , so result is: " + word[x - 1]);
            }
        }
    }
}
*/