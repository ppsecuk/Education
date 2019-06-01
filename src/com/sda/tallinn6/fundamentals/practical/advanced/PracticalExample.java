package com.sda.tallinn6.fundamentals.practical.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticalExample {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(0, 10);
        integerList.add(1, 2);
        integerList.add(2, 87);
        integerList.add(3, 21);

        int smallest = Collections.min(integerList);
        int first = integerList.indexOf(0);


//
//        System.out.println(integerList);
//
//        int temp = smallest;
//        smallest = biggest;
//        biggest = temp;
//
//        System.out.println(smallest + " " + biggest);
//        System.out.println(integerList);
//
//
//        Collections.swap(<integerList>, int  );
//    }

    }
}
