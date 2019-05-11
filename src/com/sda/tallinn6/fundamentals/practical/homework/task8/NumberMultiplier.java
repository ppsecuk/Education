package com.sda.tallinn6.fundamentals.practical.homework.task8;

import java.util.Scanner;

public class NumberMultiplier {

    public static void main(String[] args) {
        System.out.println("Welcome stranger.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number 1");
        double number1 = scanner.nextDouble();
        System.out.println("Write number 2");
        double number2 = scanner.nextDouble();

        double result = number1 * number2;

        double threshold = .0001;
        if(  (Math.abs(result - 1000) < threshold  || result>1000)
                &&  (Math.abs(result - 2000) < threshold  || result<2000) ){
            System.out.println("Between 1000-2000 (included)");
        }else if ( result<1000) {
            System.out.println("Below 1000");
        } else{
            System.out.println("Above 2000");
        }




    }
}
