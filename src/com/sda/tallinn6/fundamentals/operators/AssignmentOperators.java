package com.sda.tallinn6.fundamentals.operators;

public class AssignmentOperators {

    public static void main(String[] args) {
        // ASSIGNMENT OPERATORS
        // =, +=, -=, *=, /=
        System.out.println("Assignment com.sda.tallinn6.fundamentals.operators.Operators");
        // = : simple assignment operator
        int speed = 0;
        System.out.println("speed:" + speed);
        boolean b = true;
        char c = 'a';
        int another = speed;
        System.out.println("another:" + speed);

        // += : Add and assignment operator.
        // It adds right operand to the left operand and assign the result to left operand.
        speed += 100;
        System.out.println("Speed value now: " + speed);

        // -= : Subtract and assignment operator. It subtracts right operand from the left operand and assign the result to left operand.
        speed -= 50;
        System.out.println("Speed value now: " + speed);

        // *= : Multiply and assignment operator. It multiplies right operand with the left operand and assign the result to left operand.
        speed *= 5;
        System.out.println("Speed value now: " + speed);

        // /= : Divide and assignment operator. It divides left operand with the right operand and assign the result to left operand.
        speed /= 10;
        System.out.println("Speed value now: " + speed);

        // %= : Modulus/remainder and assignment operator. It takes modulus using two operands and assign the result to left operand.
        speed %= 5;
        System.out.println("Remainder when we divide speed to 5: " + speed);
        System.out.println("Speed value now: " + speed);
        speed %= 2;
        System.out.println("Remainder when we divide speed to 2: " + speed);


        // ASSIGNMENT OPERATORS
    }
}
