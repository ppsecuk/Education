package com.sda.tallinn6.foundamentals.datatypes;

public class HexaBinaryPrimitives {
    public static void main(String[] args) {
        int hexa = 0X0001;
        short hexa1 = 0X0001;
        byte hexa2 = 0X0001;
        byte hexa3 = 0X0001;

        short hexaShort = -0x0101;
        int hexaInt = 0x7fffff;

        long hexaLong = 0x7fff_ffff_ffff_ffffl;
        long hexBytes = 0xFFECDE5E;
        int deadCode = 0xDEAD_C0DE;

        int binaryFirst = 0b10101010;
        int binaryThree = 0B0000011;
        int binaryUnderscore = 0B1100_0000;
        short binaryShort = 0b11111111;
    }
}
