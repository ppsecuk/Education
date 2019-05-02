package com.sda.tallinn6.fundamentals.control.flows;

public class ControlStatements {


    /**
     * decision-making statements
     * if-else
     * if-else-if-else
     */
    public static void main(String[] args) {

        boolean isMoving = true;
        int currentSpeed = 10;
        // the "if" clause: bicycle must be moving
        if (isMoving){
            // the "then" clause: decrease current speed
            currentSpeed--;
        }

        if(isMoving)
            currentSpeed--;

        if (isMoving) {
            currentSpeed--;
        } else {
            System.out.println("The bicycle has already stopped!");
        }

        if (isMoving)
            currentSpeed--;
        else
            System.out.println("The bicycle has already stopped!");
        currentSpeed++;


        // what if we have more than two case ?

        int testscore = 76;
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

        char nextGrade='X';
        testscore = 40;
        if(testscore<50)
            nextGrade = 'D';
        else
            System.out.println("any");
        nextGrade = 'B';



        System.out.println("Next grade:" + nextGrade);

        // Nested conditional statements

        int score = 110;
        if(score > 200) {
            if (score < 400) {
                if (score > 350) {
                    System.out.println(1);
                } else {
                    if (score < 350) {
                        System.out.println(2);
                    } else if (score == 350) {
                        System.out.println("350");
                    }
                }
            }
        }
        ////////////////
        int temp = 40;

        if (30 < temp)
            System.out.println("hot");
        else if (20 < temp)
            System.out.println("warm");
        else if (10 < temp)
            System.out.println("fine");
        else
            System.out.println("cold");
        //////////////////////
        int x = 3;
        int y = 6;
        int z = 10;
        if ((x < y) && (y < z) || (x>z))
            System.out.println("y is between x and z and ");
        else
            System.out.println("y is not between x and z");


        ///////////////////////////
        // Find the largest
        double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;
        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }



        System.out.println("Largest number is " + largestNumber);
    }
}
