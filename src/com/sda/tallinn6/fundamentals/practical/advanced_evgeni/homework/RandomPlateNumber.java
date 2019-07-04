package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.homework;

/*        HOMEWORK:
        Generate Estonian vehicle plate numbers Assume a vehicle plate number consists
        of three digits followed by three uppercase letters. Write a program to generate a random plate number.*/

import java.util.Random;

public class RandomPlateNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(9); // random int 0-9
        int number2 = random.nextInt(9); // random int 0-9
        int number3 = random.nextInt(9); // random int 0-9

        System.out.println("Your Estonian car number will be: ");
        System.out.print(number1 + "" + number2 + "" + number3 + "" + rndChar() + "" + rndChar() + "" + rndChar());
    }

    public static char rndChar() {
        int rnd = (int) (Math.random() * 52);
        char base = (rnd < 26) ? 'A' : 'A';
        return (char) (base + rnd % 26);
    }
}
