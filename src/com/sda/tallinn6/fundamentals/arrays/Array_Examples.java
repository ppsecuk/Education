package com.sda.tallinn6.fundamentals.arrays;

import java.util.Arrays;


public class Array_Examples {


    //What's an array?
    // It is aan object that stores collection of values.
    // Can be primitive or object
    // Declare,instantiate,initialize and use
    // One dimentional and two dimentional arrays
    public static void main(String[] args) {

        int[] array1 = new int[]{4,89,400};
        String[] array2 = new String[]{"John, Anny, Patrick,Harry"};
        int[] array3 = new int[2];


        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
    }

        for (int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }



        array3[0] = 4;
        array3[1] = 6;

        System.out.println(array3[1]);
        //System.out.println(array3[5]);

        // enhanced for loop with array
        System.out.println("array1 elements with enhanced for loop");
        for (int num : array1) {
            System.out.println(num);
        }
        System.out.println("array2 elements with enhanced for loop");
        for (String s : array2){
            System.out.println(s);
        }

        // array with an object we created for ex : com.sda.tallinn6.fundamentals.classes.Bicycle

        //13.04.2019
        // multi dimentional arrays
        int multiArray[][] = { {6, 9}, {3, 4, 5} };

        String multiStrArr[][] = new String[][]{
                {"A", "B"},
                null,
                {"Jan", "Feb", "Mar"},
        };

        for (int i=0;i<multiArray.length;i++){
            for (int j=0;j<multiArray[i].length; j++){
                System.out.println("i : " + i + " j : "
                        + j + " ["+i+"]["+j+"]: "
                        + multiArray[i][j]);
            }
        }

        int[] numbers = new int[] { -8, 7, 5, 9, 10, -2, 3};
        System.out.println("before sorting");
        for (int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        Arrays.sort(numbers);
        System.out.println();

    }
}
