package com.sda.tallinn6.fundamentals.practical;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Please provide some letter");
        Character providedChar = scanner.nextLine().charAt(0);


        int count = 0;
        char[] totalChars = sentence.toCharArray();
       /* for(providedChar : totalChars){
            if(sentence == providedChar) {
            count++;
                }
            }
            if(count>0)
            {
                System.out.println(x+":"+count);
            }
        }
    }*/
    }
}
