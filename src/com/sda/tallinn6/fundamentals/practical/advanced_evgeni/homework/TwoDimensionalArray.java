package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.homework;

/*        HOMEWORK:
        (Sort two-dimensional array) Write a method to sort a two-dimensional array using the following header:
        public static void sort(int m[][])
        The method performs a primary sort on rows and a secondary sort on columns.
        For example, the following array
        {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}} will be sorted to
        {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
        Exercise: (Locate the largest element) Write the following method that returns the location of the
        largest element in a two-dimensional array.
        public static int[] locateLargest(double[][] a)
        The return value is a one-dimensional array that contains two elements. These two elements indicate the
        row and column indices of the largest element in the two-dimensional array. Write a test program that prompts
        the user to enter a two- dimensional array and displays the location of the largest element in the array.*/

import java.util.Arrays;
import java.util.Comparator;

public class TwoDimensionalArray {
    static Integer[][] arrayOfInts = new Integer[5][2];

    public static void main(String[] args) {
        arrayOfInts[0][0] = 1234;
        arrayOfInts[0][1] = 46;
        arrayOfInts[1][0] = 5443;
        arrayOfInts[1][1] = 564;
        arrayOfInts[2][0] = 347;
        arrayOfInts[2][1] = 1500;
        arrayOfInts[3][0] = 6742;
        arrayOfInts[3][1] = 825;
        arrayOfInts[4][0] = 348;
        arrayOfInts[4][1] = 549;

        System.out.println("Before sorting: ");
        displayArray();
        Arrays.sort(arrayOfInts, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                Integer item1OfArray1 = o1[0];
                Integer item2OfArray1 = o2[0];
                return item1OfArray1.compareTo(item2OfArray1);
            }
        });
        System.out.println("After sorting: ");
        displayArray();
        Arrays.sort(arrayOfInts, Comparator.comparingInt(arrayOfInts -> arrayOfInts[0]));
        /*Arrays.sort(arrayOfInts, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                Integer item1OfArray2 = o1[1];
                Integer item2OfArray2 = o2[1];
                //return item1OfArray2.compareTo(item2OfArray2);
                return Integer.compare(item1OfArray2[1], item2OfArray2[1]);
            }
        });*/
        //System.out.println(locateLargest(arrayOfInts));

        System.out.println("The largest value of 2d arrays is : " + locateLargest(arrayOfInts));
    }

    private static void displayArray() {
        System.out.println("Array1\t\tArray2");
        for (int i = 0; i < arrayOfInts.length; i++) {
            Integer[] itemRecord = arrayOfInts[i];
            System.out.println(itemRecord[0] + "\t\t" + itemRecord[1]);
        }
    }

    public static Integer locateLargest(Integer[][] a){
        Integer currentHighestValue = Integer.MIN_VALUE;
        for (int row = 0; row < arrayOfInts.length; row++) {
            for (int col = 0; col < arrayOfInts[row].length; col++) {
                Integer value = arrayOfInts[row][col];
                if (value > currentHighestValue) {
                    currentHighestValue = value;
                }
            }
        }
        return currentHighestValue.intValue();
    }
}