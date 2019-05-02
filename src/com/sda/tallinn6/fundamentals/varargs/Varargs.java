package com.sda.tallinn6.fundamentals.varargs;

public class Varargs {
    public static void main(String[] args) {
        printWhatYouGot(args);
        System.out.println(sum(1));
        System.out.println(sum(1,2,3));
        System.out.println(sum(2,5,6,2,8));

        int[] arr = new int[]{1,3,4,2};
        System.out.println(sum(arr));
    }

    private static int sum(int...elements) {
        int result = 0;
        for (int i : elements) {
            result += 1;
        }
        return result;
    }
    private static void printWhatYouGot(String... input){
        for (String elem:input) {
            System.out.println(elem);
        }
    }
}