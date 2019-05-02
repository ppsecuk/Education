package com.sda.tallinn6.fundamentals.data.types;

public class CharPrimitives {

    public static void main(String[] args) {
    // Range    \u0000 to \uFFFF
        char myChar = 'c';
        char upperCase = 'C';
        char unicode = '\u004E';

        char smallest = '\u0000';

        System.out.println("Smallest char : " + smallest);

        char braceSign = '\u005D';

        System.out.println("brace sign :" + braceSign);

        char backSlash = '\u004E';

        System.out.println("back slash : " + backSlash);
    }
}
