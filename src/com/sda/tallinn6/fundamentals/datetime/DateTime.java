package com.sda.tallinn6.fundamentals.datetime;

import java.io.StringReader;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current date: " + calendar.getTime());

        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Day: " + calendar.get(Calendar.DATE));

        calendar.add(Calendar.DATE, -10);
        System.out.println("10 days before: " + calendar.getTime());

        Date currentDate = new Date();
        System.out.println("Current date is: " + currentDate);
        SimpleDateFormat format = new SimpleDateFormat("");
        SimpleDateFormat firstFormatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String formattedDate = firstFormatter.format(currentDate);
        System.out.println("New date: " + formattedDate);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + now);
        int hour = now.getHour();
        int minutes = now.getMinute();

        System.out.println("hours:minutes: " + hour + ":" + minutes);

        Duration oneHour = Duration.ofHours(1);
        System.out.println(oneHour.getSeconds() + " seconds in one hour");

        LocalDateTime startDate = LocalDateTime.of(2019, Month.JANUARY, 1, 10, 20, 00);

        Period fiveDays = Period.ofDays(5);
        System.out.println("days..." + fiveDays.getDays());
        Period twoYearsFourMonthsThreeDays = Period.of(2,4,3);
        System.out.println(twoYearsFourMonthsThreeDays.getYears());

        LocalDate birtDate = LocalDate.of(1990, Month.OCTOBER, 7);
        LocalDate todayDate = LocalDate.of(2019, Month.APRIL, 14);
        Period period = Period.between(birtDate, todayDate);
        System.out.println(period.getYears() + " years");
        System.out.println(period.getMonths() + " months");
        System.out.println(period.getDays() + " days");

    }
    private static void convertDateTimeObjects(){
        Date date = new Date();
        System.out.println("today: " + date);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(),
                ZoneId.systemDefault());
        System.out.println("local date time: " + localDateTime);

        Date sameDate = Date.from(localDateTime.toInstant(ZoneOffset.UTC));
        System.out.println(" " + sameDate);
    }
}
