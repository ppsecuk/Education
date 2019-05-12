package com.tallinn.four.lectures.twentytwo;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {

        int numberArrays[] = {6, 5, 3, 1, 8, 7, 2, 4};

        System.out.println("Array Before Bubble Sort");
        System.out.println(Arrays.toString(numberArrays));
        System.out.println();

        bubbleSort(numberArrays);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        System.out.println(Arrays.toString(numberArrays));

    }






    static void bubbleSort(int[] numberArrays) {
        int totalSize = numberArrays.length;
        int temp = 0;
        for (int counter = 0; counter <  numberArrays.length-1; counter++) {
            for (int j = 1; j < (totalSize - counter); j++) {
                if (numberArrays[j - 1] > numberArrays[j]) {
                    //swap elements
                    temp = numberArrays[j - 1];
                    numberArrays[j - 1] = numberArrays[j];
                    numberArrays[j] = temp;
                }
            }
        }
    }
}
