package com.sda.tallinn6.foundamentals.controlflows;

public class ControlStatements {
    public static void main(String[] args) {
        boolean isMoving = true;
        int currentSpeed = 10;
        if (isMoving) {
            currentSpeed--;
        }
        if (isMoving)
            currentSpeed--;
        if (isMoving) {
            currentSpeed--;
        } else {
            System.out.println("com.sda.tallinn6.foundamentals.classes.Bicycle is stopped" + isMoving);
        }

        int testscore = 100;
        char grade;
        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        int x = 3;
        int y = 6;
        int z = 10;
        if ((x < y) && (y < z) || (x > z))
            System.out.println("blablslabalba");
         else System.out.println("blablablabl");

         double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;
         if (n1 > n2) {
             if (n1 >= n3) {
                 largestNumber = n1;
             } else {
                 largestNumber = n3;
             }
         } else {
             if (n2 >= n3){
                 largestNumber = n2;
             } else {
                 largestNumber = n3;
             }
         }



        System.out.println("Largest number is: " + largestNumber);
    }
}
