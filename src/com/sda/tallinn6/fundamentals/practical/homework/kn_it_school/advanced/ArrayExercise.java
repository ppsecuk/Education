package com.sda.tallinn6.fundamentals.practical.homework.kn_it_school.advanced;

import java.util.*;

import static java.util.stream.Collectors.toSet;

public class ArrayExercise {
    public static void main(String[] args) {
        int array1[] = {1, 1, 2, 3, 4, 5};
        int array2[] = {6, 5, 4, 3, 2, 1};

        if(Arrays.equals(array1, array2)){
            System.out.println("Arrays 1 and 2 are equal.");
        }else{
            System.out.println("Arrays 1 and 2 are different.");
        }
        Arrays.sort(array1);

        int[] array3 = new int[6];
        System.arraycopy( array1, 0, array3, 0, array1.length );
        int length = array3.length;
        length = removeDuplicateElements(array3, length);
        System.out.println("Array3 values are: ");
        for (int i=0; i<length; i++)
            System.out.print(array3[i]+" ");

        int[] array4 = new int[ array1.length + array2.length ];
        System.arraycopy( array1, 0, array4, 0, array1.length );
        System.arraycopy( array2, 0, array4, array1.length, array2.length );
        int length2 = array4.length;
        length2 = removeDuplicateElements(array4, length2);
        System.out.println("\nArray4 values are: ");
        for (int i=0; i<length2; i++)
            System.out.print(array4[i]+" ");

        ArrayExercise arrayExercise = new ArrayExercise();
        System.out.println("\n Common data between array 1 and array 2 is:  " + arrayExercise.findCommonElement(array1, array2));

        //System.out.println("Uncommon data is: " + getDifferenceBetweenTwoArray(array1, array2));
        //non working code
        int arr1[] = { 10, 20, 30, 6 };
        int arr2[] = { 20, 25, 30, 40, 50 };

        int n1 = arr1.length;
        int n2 = array2.length;

        printUncommon(arr1, array2, n1, n2);

    }

    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    public List<Integer> findCommonElement(int[] a, int[] b) {

        List<Integer> commonElements = new ArrayList<Integer>();

        for(int i = 0; i < a.length ;i++) {
            for(int j = 0; j< b.length ; j++) {
                if(a[i] == b[j]) {
                    if(!commonElements.contains(a[i])) {
                        commonElements.add(a[i]);
                    }
                }
            }
        }
        return commonElements;
    }

    static void printUncommon(int arr1[], int arr2[], int n1, int n2){
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {

            // If not common, print smaller
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                k++;
            }
            else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                k++;
                j++;
            }

            // Skip common element
            else {
                i++;
                j++;
            }
        }

        // printing remaining elements
        while (i < n1) {
            System.out.print(arr1[i] + " ");
            i++;
            k++;
        }
        while (j < n2) {
            System.out.print(arr2[j] + " ");
            j++;
            k++;
        }
    }
}
