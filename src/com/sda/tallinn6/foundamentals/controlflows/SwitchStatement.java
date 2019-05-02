package com.sda.tallinn6.foundamentals.controlflows;

public class SwitchStatement {
    public static void main(String[] args) {
        int week = 4;
        String day;

        switch (week) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
        }
        System.out.println(day);

        int month = 2;
        int year = 2000;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
            numDays = 31;
            break;
            case 4: case 6:
            case 9: case 11:
            numDays = 30;
            break;
            case 2:
            if (((year % 4 == 0) &&
            !(year % 100 == 0))
                || (year % 400 == 0))
                numDays = 29;
            else
                numDays = 28;
            break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}