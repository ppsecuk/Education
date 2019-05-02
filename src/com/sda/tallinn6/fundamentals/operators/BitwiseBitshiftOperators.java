package com.sda.tallinn6.fundamentals.operators;

public class BitwiseBitshiftOperators {

    public static void main(String[] args) {
        // BITWISE OPERATORS
        System.out.println("Bitwise com.sda.tallinn6.fundamentals.operators.Operators");
        // &, |, ^, ~
        // Java defines several bitwise bitshift operators,
        // which can be applied to the integer types, long, int, short, char, and byte.
        // The operators discussed in this section are less commonly used.
        // Therefore, their coverage is brief; the intent is to simply
        // make you aware that these operators exist.


        // a = 60 b = 13
        // binary representations
        // a = 0011 1100 b = 0000 1101
        int a = 0b0111100;
        System.out.println(a);
        int b = 0b0001101;
        System.out.println(b);

        // & (bitwise and) : Binary AND Operator copies a bit to the result if it exists in both operands.
        // (a & b) will give 12 which is 0000 1100
        System.out.println("a&b :" + (a&b));

        // | (bitwise or) : Binary OR Operator copies a bit if it exists in either operand.
        // (a | b) will give 61 which is 0011 1101
        System.out.println("a | b :" + (a | b));


        // ^ (bitwise xor) : Binary XOR Operator copies the bit if it is set in one operand but not both.
        //  a bitwise operator compares each bit in a number
        //  and returns 0 if the numbers are the same,
        //  and returns 1 if they aren’t the same.
        // (a ^ b) will give 49 which is 0011 0001
        System.out.println("a ^ b :" + (a ^ b));

        // ~ (bitwise complement) : Binary Ones Complement Operator
        // is unary and has the effect of 'flipping' bits.
        // (~a ) will give -61 which is 1100 0011
        // in 2's complement form due to a signed binary number.
        System.out.println("~a :" + ~a);


        // BITWISE OPERATORS

        // BIT-SHIFTING OPERATORS
        // <<, >>, >>>

        // << (left shift)
        // Binary Left Shift Operator. The left operands value is moved left by the number of bits
        // specified by the right operand.
        // a << 2 will give 240 which is 1111 0000

        System.out.println("a << 2 : " + (a << 2));

        // >> (right shift)
        // Binary Right Shift Operator. The left operands value is moved right by the number of bits
        // specified by the right operand.
        // a >> 2 will give 15 which is 1111
        System.out.println("a >> 2 : " + (a >> 2));

        // >>> (zero fill right shift)
        // The left operands value is moved right by the number of bits specified by the right operand
        // and shifted values are filled up with zeros.
        // a >>>2 will give 15 which is 0000 1111
        System.out.println("a >>>2 : " + (a >>>2));

        // the reason we have two shift operators is
        // because in 2's complement form negative numbers have a bit value of 1 in the left-most bit position
        // The right shift operator >> will add the sign bit (1 in case of negative numbers,
        // and 0 in case of positive numbers or zero) on the left side while the other (>>>) will always add zeros.

        // BIT-SHIFTING OPERATORS
    }
}
