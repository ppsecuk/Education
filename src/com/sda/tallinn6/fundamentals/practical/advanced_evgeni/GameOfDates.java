package com.sda.tallinn6.fundamentals.practical.advanced_evgeni;

import java.time.YearMonth;
import java.util.Scanner;
import java.text.DateFormatSymbols;

public class GameOfDates {

    public static String getMonth(int month) {
        return new DateFormatSymbols().getMonths()[month-1];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of month (1-12): ");
        int numberOfMonth = input.nextInt();
        System.out.println("and now year (yyyy): ");
        int year = input.nextInt();

        YearMonth ym = YearMonth.of(year, numberOfMonth);
        System.out.println(getMonth(numberOfMonth) + " " + year + " had " + ym.lengthOfMonth() + " day(s).");
    }
}
