package edu.exam.ocp.se6.pe.pe1.q35;

/**
 * valueOf() method will always cache values in the range -128 to 127
 */
public class Stealth {
    public static void main(String[] args) {
        Integer i = 420;
        Integer i2;
        Integer i3;
        i2 = i.intValue();
        i3 = i.valueOf(420);
        System.out.println((i == i2) + " " + (i == i3));

        i = 42;  //Integer(42) is cached.
        i2 = i.intValue();
        i3 = i.valueOf(42);  //not creating a new instance but find it from the cache.
        System.out.println((i == i2) + " " + (i == i3));
    }
}

/*
false false
true true
*/