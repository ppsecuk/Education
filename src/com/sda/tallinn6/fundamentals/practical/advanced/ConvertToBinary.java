package com.sda.tallinn6.fundamentals.practical.advanced;

import java.util.Scanner;

public class ConvertToBinary {
    public static void main(String[] args) {
        System.out.println("Please provide some number:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String binary = Integer.toBinaryString(input);
        System.out.println(binary);

    }
}
