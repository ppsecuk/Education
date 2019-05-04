package com.sda.tallinn6.fundamentals.practical;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence. Use 'done' for exit");
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String done = "done";
        if(sentence.contains(" ")){
            sentence= sentence.substring(0, sentence.indexOf(" "));
            System.out.println(sentence);
        }
        if(sentence==done){
            System.out.println("Thanks you, bye.");
            return;
        }



        // String[] words=sentence.split("\\s");
        //for(String w:words){
            //System.out.print(w);
        //}


        //if(sentence==done){
            //System.out.println("Exiting...Bye");
            //System.exit(0);
       // }else if(){
            //System.out.println(sentence);
        //}
    }
}
