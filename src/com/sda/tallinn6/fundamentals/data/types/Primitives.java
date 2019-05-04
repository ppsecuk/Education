package com.sda.tallinn6.fundamentals.data.types;

public class Primitives {

    public static void main(String[] args) {

        boolean isStudent = false;

        if(isStudent) {
            System.out.println("I am a student");
        } else{
            System.out.println("I am not a student");
        }

        double tomatoKg = 3.2;

        System.out.println("I bought " + tomatoKg+ " kg tomato");

        double tomatoPrice = 0.45;

        System.out.println("One kg tomato is : " +  tomatoPrice);

        double lastPrice = tomatoKg*tomatoPrice;

        System.out.println("I paid : " + lastPrice + " in total");

        char currency = '\u20AC';

        System.out.println("Our currency is: " + currency);

        System.out.println("I paid " + lastPrice + " " + currency);


        // 1.4400000
        // hw - print money like below:
        // you have to pay 1 euro 44 cent


        long money = 30901839048888l;

        if(money> 1000000){
            System.out.println("You are rich");
        } else if(money > 1000){
            System.out.println("You are middle");
        }else{
            System.out.println("You are not rich");
        }


        int d;
        int x3 = 2;

        d = 5;
        System.out.println("what is my variable: " + d);

    }


}
