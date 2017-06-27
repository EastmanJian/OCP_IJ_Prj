package edu.exam.ocp.se6.pe.pe3.q33;

import java.util.ArrayList;
import java.util.List;

public class CollieDog extends Dog {
    public static void main(String[] args) {
        List<CollieDog> c = new ArrayList<CollieDog>();
        c.add(new CollieDog());
        do1(c);
    }
    static void do1(List<? extends Dog> d2) {
//        d2.add(new CollieDog()); //Compile Error: no suitable method found for add(CollieDog)
                                 //method java.util.Collection.add(capture#1 of ? extends Dog) is not applicable
                                 //        (argument mismatch; CollieDog cannot be converted to capture#1 of ? extends Dog)
                                 //method java.util.List.add(capture#1 of ? extends Dog) is not applicable
                                 //        (argument mismatch; CollieDog cannot be converted to capture#1 of ? extends Dog)
        System.out.print(d2.size());
    }
}