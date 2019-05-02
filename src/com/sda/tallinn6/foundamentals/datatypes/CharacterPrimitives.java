package com.sda.tallinn6.foundamentals.datatypes;

public class CharacterPrimitives {
    public static void main(String[] args) {
        char myChar = 'c';
        char upperCase = 'C';
        char unicode = '\u004E';

        char smallest = '\u0000';

        System.out.println("Smallest: " + smallest);

        char braceSign = '\u500D';
        System.out.println("Brace: " + braceSign);
    }
}
