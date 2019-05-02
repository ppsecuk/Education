package com.sda.tallinn6.fundamentals.data.types;

public class ValidInvalid {

    public static void main(String[] args) {
        // Invalid: cannot put underscores
        // adjacent to a decimal point
        // float pi1 = 3._1415F;
        // float pi1 = 3_.1415F;

        // invalid cannot put underscores
        //// prior to an L suffix
        // long socialSecurityNumber1 = 999_99_9999_L;

        int x1 = 5_2;
        //Invalid: cannot put underscores
        //// At the end of a literal
       // int x2 = 5_2_;

        // Invalid: cannot put underscores
        // in the 0x radix prefix
         //   int x4 = 0_x_52;
        int x6 = 0x5_2;

        // invalid
        // int x7 = 0x52_;
        // int x7 = 0x52_;
    }
}
