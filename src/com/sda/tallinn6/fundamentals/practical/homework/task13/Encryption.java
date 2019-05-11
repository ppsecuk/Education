package com.sda.tallinn6.fundamentals.practical.homework.task13;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        System.out.println("Hello stranger.");

        while(true) {
            System.out.println("Which word you want to encrypt?");
            Scanner scanner = new Scanner(System.in); //creating scanner
            String encryptedWord = scanner.nextLine();

            System.out.println("Which word you want to change the word to?");
            String replacementWord = scanner.nextLine();

            System.out.println("Provide full sentence:");
            String sentence = scanner.nextLine();

            String replaceString = sentence.replaceAll(encryptedWord, replacementWord);
            System.out.println(replaceString);
            }
        }
}
