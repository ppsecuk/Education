package com.sda.tallinn6.fundamentals.arrays;

public class ArrayHomework {
    public static void findCommonElements(int[] firstArray, int[] secondArray){
        for(int i=0; i<firstArray.length;i++){
            for(int j=0;j<secondArray.length;j++){
                if(firstArray[i] == secondArray[j]){
                    System.out.println(firstArray[i]);
                }
        }
    }

    }


    /**
     * 1. I have an array like this :
     *          int[] firstArray = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
     *          int[] secondArray = { 0, 11, 13, 6}
     *
     *  Your duty is to find common elements in these two arrays and print them :)
     *
     *
     */
}
