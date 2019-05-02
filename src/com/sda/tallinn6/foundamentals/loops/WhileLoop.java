package com.sda.tallinn6.foundamentals.loops;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
            System.out.println("Count after ++ is: " + count);
        }
        int num = 9;
        boolean divisibleBy7 = false;
        while(!divisibleBy7) {
            System.out.println(num);
            if(num%7 == 0) divisibleBy7 = true;
            --num;
        }

        count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

        int cnt = 1;
        cnt = 1;
        while (cnt < 11){
            System.out.println("Count is:" + cnt);
            cnt++;
            if(cnt == 4)
                continue;
        }
        System.out.println("Count after ++ operation is: " + cnt);

        int z = 0;

        while (z < 10) {
            System.out.println();
            z += 1;
            while (z > 10) {
                System.out.println("z: " + z);
                --z;
            }
            System.out.println("z: " + z);
        }

    }
}
