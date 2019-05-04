package com.sda.tallinn6.fundamentals.practical.stack;


import java.util.Arrays;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stackofCards = new Stack<>();
        stackofCards.push("Jack");
        stackofCards.push("Queen");
        stackofCards.push("King");
        stackofCards.push("Ace");

        System.out.println(stackofCards.toString());

        int[] s = new int[7];
        System.out.println(s.toString());
        System.out.println(Arrays.toString(s));

        String theLastInfo = stackofCards.pop();
        System.out.println(theLastInfo.toString());

        System.out.println(stackofCards);

        String cardAtTop = stackofCards.peek();
        System.out.println(cardAtTop);
        System.out.println(stackofCards);
    }
}
