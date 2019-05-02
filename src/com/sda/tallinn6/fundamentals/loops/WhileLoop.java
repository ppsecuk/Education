package com.sda.tallinn6.fundamentals.loops;

public class WhileLoop {

    // a while loop is used to repeatedly execute a set of statements
    // as long as its conditions evaluates to true
    public static void main(String[] args) {

        // Example 1
        System.out.println("Example 1");
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
            System.out.println("Count after ++ operator is: " + count);
        }
        System.out.println("End of while loop");
        System.out.println("count: " + count);

         // Example 2
        System.out.println("Example 2");
        int num = 9;
        boolean divisibleBy7 = false;
        while(!divisibleBy7){
            System.out.println(num);
            if(num%7 == 0) divisibleBy7 = true;
            --num;
        }

        // do - while
        // do-while loop is used to repeatedly execute set of statements until the condition
        // that is uses evaluate to false

        System.out.println("First do-while example");
        count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

        // The difference between do-while and while is that :
        // do-while checks the condition after it completes the execution of all the statements
        // in its loop body


        // Example 4

        int x = 11;
        while (x <= 10) {
            System.out.println("x = " + x);
            x=x-1;
        }

        do {
            System.out.println("The value of x (in do while) = " + x);
            x=x+1;
        }
        while (x <= 10);


        // break statement in while loop
        // break says don't go on anymore - exit the loop
        System.out.println("Break statement");
        int cnt = 1;
        while (cnt < 11) {
            System.out.println("Count is: " + cnt);
            cnt++;
            if(cnt == 4)
                break;
            System.out.println("Count after ++ operator is: " + cnt);
        }


        // continue statement in while loop
        // continue says "go to the next iteration of the loop". It must appear in a loop body!

        cnt = 1;
        while (cnt < 11) {
            System.out.println("Count is: " + cnt);
            cnt++;
            if(cnt == 4){
                continue;
            }
            System.out.println("Count after ++ operator is: " + cnt);
        }


        // Nested while loop
        // If a loop encloses other loop they are called nested loop

        int z = 0;

        while(z < 10){
            System.out.println("z:" + z);
            z += 1;
            while (z> 10){
                System.out.println("z:" + z);
                --z;
            }
            System.out.println("z:" + z);
        }

    }
}
