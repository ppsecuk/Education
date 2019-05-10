package random_tasks.homework.extra;

import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int input = scanner.nextInt();
            boolean flag = false;

            for(int counter=2; counter<=input/2; counter++){
                if(input % counter == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(input + " is a prime number");
            }else if (input <= 0) {
                System.out.println("Negative values and 0 are not prime values.");
            }else{
                System.out.println(input + " is not a prime number");
            }
        }
    }
}
