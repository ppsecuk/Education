package com.sda.tallinn6.foundamentals.loops;

import java.sql.SQLOutput;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            System.out.println("Count is:" + i );
        }
        for(int i=10; i>0; i--){
            System.out.println("Count is:" + i );
        }
        int ctr = 12;
        for(int j=10,k=4;j>k && ctr > 10;++j,k=k-1,ctr--){
            System.out.println("j: " + j + "k: " + k + "ctr: " + ctr);
        }

        int num = 10;
        for (int i = 0 ; i < num ; i++ )
        {
            if (i > 5)
                continue ;
            System.out.println("i: " + i);
        }

        for (int i = 0; i < 10; i++){
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        for(int outer=0;outer<10;outer++){
            for(int inner=0;inner<10; inner++){
                System.out.println("inner: " + inner + " outer: " + outer);
            }
        }

        for(int hours=0;hours<12;hours++){
            for(int minutes=0;minutes<60;minutes++){
                System.out.println(hours + " h " + minutes + " m");
            }
        }
    }
}
