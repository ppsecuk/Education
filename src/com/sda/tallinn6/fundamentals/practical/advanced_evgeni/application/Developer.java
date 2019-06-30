package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.application;

public class Developer extends Person{
    private int expInMonths;

    public Developer() {
    }

    public Developer(int expInMonths) {

        this.expInMonths = expInMonths;
    }

    public int getExpInMonths() {

        return expInMonths;
    }

    public void setExpInMonths(int expInMonths) {

        this.expInMonths = expInMonths;
    }
}
