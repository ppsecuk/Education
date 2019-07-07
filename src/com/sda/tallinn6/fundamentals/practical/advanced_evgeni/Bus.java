package com.sda.tallinn6.fundamentals.practical.advanced_evgeni;

public interface Bus {

    void fillTank(Double liter);

    void drive(Double kms);

    default void setDriverName(String name){
        System.out.println("nobody");
    }
}
