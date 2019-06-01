package com.sda.tallinn6.fundamentals.practical.advanced;

import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str1 = in.nextLine();

        System.out.print("Number of  Vowels in the string: " + JavaProgramUtilities.countVowels(str1)+"\n");
    }
}
