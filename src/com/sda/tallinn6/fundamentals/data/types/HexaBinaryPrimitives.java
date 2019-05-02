package com.sda.tallinn6.fundamentals.data.types;

public class HexaBinaryPrimitives {

    public static void main(String[] args) {
        int hexa = 0X0001;
        short hexa1 = 0X0001;
        byte hexa2 = 0X0001;
        long hexa3 = 0X0001;

        //short range -128 127
        // -0x0101 : -257
        short hexaShort = -0x0101;

        // 0x7fffff - 2147483647
        int hexaInt = 0x7fffff;

        long hexaLong = 0x7fff_ffff_ffff_ffffl;
        long hexBytes = 0xFFECDE5E;
        int deadCode = 0XDEAD_C0DE;


        int binaryFirst = 0b10101010;
        int binaryThree = 0B00000011;
        int binaryUnderscore = 0B1100_0000;
        short binaryShort = 0b11111111; //255
        // byte binaryByte = 0b11111111; does not allow

    }
}
