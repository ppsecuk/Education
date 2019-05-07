package com.tallinn.four.lectures.seventeen;

import java.util.Arrays;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println(stackOfCards.toString());
        //Jack, Queen, Ace, King
        int[] s = new int[7];
        System.out.println(s.toString());
        System.out.println(Arrays.toString(s));

        String theLastInfo = stackOfCards.pop();
        System.out.println(theLastInfo.toString());

        System.out.println(stackOfCards);

        String cardAtTop = stackOfCards.peek();//s[s.length-1]
        System.out.println(cardAtTop);
        System.out.println(stackOfCards);

    }

}
