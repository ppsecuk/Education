package com.sda.tallinn6.fundamentals.practical.advanced;

public enum DaysOfTheWeek {
    MONDAY("First"),
    TUESDAY("Second"),
    WEDNESDAY("Third"),
    THURSDAY("Forth"),
    FRIDAY("Fifth"),
    SATURDAY("Sixth"),
    SUNDAY("Seventh");

    String description;

    DaysOfTheWeek(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
