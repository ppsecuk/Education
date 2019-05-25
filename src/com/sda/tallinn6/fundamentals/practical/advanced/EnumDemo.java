package com.sda.tallinn6.fundamentals.practical.advanced;

public class EnumDemo {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.FRIDAY;
        System.out.println(day);

        DaysOfTheWeek[] daysOfTheWeeksArr = DaysOfTheWeek.values();
        for (int i = 0; i < daysOfTheWeeksArr.length; i++)
            System.out.println(daysOfTheWeeksArr[i]);
    }

    public void printDayDescription(String day){
        if(day.equalsIgnoreCase("monday")){
            System.out.println("First day of the week");
        }else if(day.equalsIgnoreCase("tuesday")){
            System.out.println("Second day of the week");
        }else if(day.equalsIgnoreCase("friday")){
            System.out.println("Party time");
        }else{
            System.out.println("ERROR!!");
        }
    }

}
