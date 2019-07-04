package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.homework;

/*        HOMEWORK:
        (Display four patterns using loops) Use nested loops that display the following patterns in program:
        Pattern name: A
        Number: 7
        Pattern A
        1
        12
        12 3
        123 4
        1234 5
        12345 6
        Pattern D
        1234 5 6
        123 4 5
        12 3 4
        12 3
        1 2
        1*/


public class FourPatternsUsingLoops {
    public static void main(String[] args) {
        printPatternA();
        printPatternARight();
    }

    private static void printPatternA(){
        String str;
        int lastChar;
        System.out.println("Pattern A");
        for (int counter = 1; counter <= 6; counter++) {
            str = "";
            for (int counter2 = 1; counter2 <= counter; counter2++) {
                str += counter2;
            }
            lastChar = str.length() - 1;
            if (str.length() > 2) str = str.replaceAll("[0-9]$", " " + str.charAt(lastChar));
            System.out.print(str);
            System.out.println();
        }
    }

    private static void printPatternARight(){
        String str;
        int lastChar;
        System.out.println("Pattern A - right aligned");
        for (int counter = 1; counter <= 6; counter++) {
            str = "";
            for (int counter2 = 1; counter2 <= counter; counter2++) {
                str += counter2;
                System.out.print(" ");
            }
            for(int counter2 = 1; counter2 < 6 - counter; counter2++) {
                lastChar = str.length() - 1;
                if (str.length() > 2) str = str.replaceAll("[0-9]$", " " + str.charAt(lastChar));
                System.out.print(str);
                System.out.println();
            }
        }
    }
}
