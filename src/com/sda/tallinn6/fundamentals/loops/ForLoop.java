package com.sda.tallinn6.fundamentals.loops;

public class ForLoop {

    public static void main(String[] args) {
       // The for statement provides a compact way to iterate over a range of values.
       //

        // The initialization expression initializes the loop; it's executed once, as the loop begins.
        // When the termination expression evaluates to false, the loop terminates.
        // The increment expression is invoked after each iteration through the loop;
        // it is perfectly acceptable for this expression to increment or decrement a value.
        /**
         * for (initialization; termination; increment) {
                statement(s)
        }
        */
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }
        /**
        // infinite loop
        for ( ; ; ) {

            // your code goes here
        }
        **/

        // not only increment also decrement possible
        for(int i=10; i>0; i--){
            System.out.println("Count is: " + i);
        }


        int ctr = 12;
        for(int j=10,k=4;j>k && ctr > 10;++j,k=k-1,ctr--){
            System.out.println("j:"+ j + "-k:" + k
                    + "-ctr:" + ctr);
        }


        // let's see how break and continue in for loop
        int num = 10;
        for (int i = 0 ; i < num ; i++ )
        {
            if ( i > 5 )
                continue ; // Jumps to update, i++
            System.out.println( "i:"+ i ) ;
        }

        // break
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; // exit the loop
            }
            System.out.println(i);
        }

        // Nested for loop

        for(int outer=0;outer<10;outer++){
            for (int inner=0;inner<10; inner++){
                System.out.println("inner: " + inner +
                        " outer: " + outer);
            }
        }

        // Let's do a real example : print out each minute(from 00 to 60) for ours from 1 to 6

        for(int hour=0;hour<=12;hour++){
            for (int minute=0;minute<60;minute++){
                System.out.println(hour+":"+minute);
            }
        }



    }
}
