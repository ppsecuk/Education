package com.sda.tallinn6.foundamentals.datatypes;

public class Primitives {

    public static void main(String[] args) {
        boolean isStudent = false;

        if (isStudent) {
            System.out.println("Im a student");
        } else{
            System.out.println("Not a student");

        }
        char currency = '\u20AC';
        System.out.println("Our currency is " +currency);

        double tomatoKg = 1.2;
        System.out.println("I bought " +tomatoKg + " kg of tomatos");

        double tomatoPrice = 0.45;
        System.out.println("It costs " + tomatoPrice + currency + " per KG");

        double finalPrice = tomatoKg*tomatoPrice;
        System.out.println("So I paid " + finalPrice +currency + " for it");

        long money = 999;
        if(money > 1000000){
            System.out.println("You are rich, wow!");
        } else if (money > 1000){
            System.out.println("You have some money");
        } else{
            System.out.println("You are poor");
        }

        int d;
        d = 5;
        System.out.println("The value of 'd' is: " + d );


    }
}
