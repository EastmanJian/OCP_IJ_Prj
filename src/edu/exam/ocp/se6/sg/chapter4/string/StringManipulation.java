package edu.exam.ocp.se6.sg.chapter4.string;

public class StringManipulation {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("cet").insert(2,"ntra").insert(0,"con").append("ing");
        System.out.println(sb); // -> concentrating

        StringBuffer numbers = new StringBuffer(" * 5.0 = ");
        numbers.insert(0, 100).append(500.0);
        System.out.println(numbers); // -> 100 * 5.0 = 500.0

        StringBuilder x = new StringBuilder("starter");
        x.deleteCharAt(6).reverse().replace(0,2,"d");
        System.out.println(x); // -> drats

    }
}
