package edu.exam.ocp.se6.sg.chapter1.datatype.primitive;

public class PrimitiveTest {
    public static void main(String[] args) {
        byte b;     //8 bits
        short s;    //16 bits
        int i;      //32 bits
        long l;     //64 bits
        float f;    //32 bits
        double d;   //64 bits
        char c;     //16 bits
        boolean bl; //unspecified

        b = 123;
        s = 1234;
        i = 123456;
        l = 1223456789012l;
        f = 3.4e12f;
        d = 2.7e45;
        c = 0xAE5F;
        bl = true;

        //widening and conversion
        i = b;
        i = s;
        i = c;
        f = b;
        f = s;
        f = i;
        f = l; //note this: Though long is 64 bits and float is 32 bit, long can be widen to float because the range of float is larger.
        l = i;
        l = b;
        l = c;
        d = s;
        d = l;
        d = c;

//incompatible types conversion
//        i = f;  //Compile Error: incompatible types: possible lossy conversion from float to int
//        l = f;  //Compile Error: incompatible types: possible lossy conversion from float to long
//        i = l;  //Compile Error: incompatible types: possible lossy conversion from long to int
//        f = d;  //Compile Error: incompatible types: possible lossy conversion from double to float
//        c = s;  //Compile Error: incompatible types: possible lossy conversion from short to char
//        s = c;  //Compile Error: incompatible types: possible lossy conversion from char to short
//        c = b;  //Compile Error: incompatible types: possible lossy conversion from byte to char
//        b = c;  //Compile Error: incompatible types: possible lossy conversion from char to byte
//        c = bl; // Compile Error: incompatible types: boolean cannot be converted to char
//        d = bl; // Compile Error: incompatible types: boolean cannot be converted to double
//        bl = s; // Compile Error: incompatible types: short cannot be converted to boolean
//        bl = c; // Compile Error: incompatible types: char cannot be converted to boolean
//        c = bl; // Compile Error: incompatible types: boolean cannot be converted to char
//        d = bl; // Compile Error: incompatible types: boolean cannot be converted to double

        //casting
        i = (int)d;
        i = (int)f;
        c = (char)s;
        s = (short)c;

    }
}
