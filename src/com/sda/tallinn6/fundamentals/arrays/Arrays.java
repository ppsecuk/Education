package com.sda.tallinn6.fundamentals.arrays;

public class Arrays {

    public static void main(String[] args) {
        int[] array1 = new int[]{4,89,400};
        String[] array2 = new String[]{"John, Patrick"};
        int[] array3 = new int[2];

        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }//a
        for (int i=0;i<array2.length;i++) {
            System.out.println(array2[i]);
        }
    }
}
