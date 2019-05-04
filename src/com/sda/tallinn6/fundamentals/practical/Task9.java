package com.sda.tallinn6.fundamentals.practical;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter sentence:");
            String sentence = scanner.nextLine();
            System.out.println("Please provide some letter");
            char providedChar = scanner.next().charAt(0);



        /*int count=0;
        for(char x=scanner.next().charAt(0);x<='z';x++)
        {
            count=0;
            //char x=a;
            for(int i=0;i<sentence.length();i++)
            {
                if(x==sentence.charAt(i))
                {
                    count=count+1;
                }
            }
            if(count>0)
            {
                System.out.println(x+":"+count);
            }
        }*/
    }
}
