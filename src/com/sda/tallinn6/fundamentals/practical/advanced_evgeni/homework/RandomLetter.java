package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.homework;

public class RandomLetter {
    public static void main(String[] args) {
        System.out.println(rndChar());
    }

    private static char rndChar () {
        int rnd = (int) (Math.random() * 52);
        char base = (rnd < 26) ? 'A' : 'A';
        return (char) (base + rnd % 26);

    }
}
