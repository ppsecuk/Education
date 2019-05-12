package com.tallinn.four.lectures.twentytwo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int numberArrays[] = {6, 5, 3, 1, 8, 7, 2, 4};

        System.out.println("Array Before Insertion Sort");
        System.out.println(Arrays.toString(numberArrays));
        System.out.println();

        insertionSort(numberArrays);//sorting array elements using bubble sort

        System.out.println("Array After Insertion Sort");
        System.out.println(Arrays.toString(numberArrays));

    }
    static void insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
