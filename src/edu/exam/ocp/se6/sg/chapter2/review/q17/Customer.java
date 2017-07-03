package edu.exam.ocp.se6.sg.chapter2.review.q17;

public class Customer {
    public static void main(String[] args) {
        Flavors f = Flavors.STRAWBERRY;
        switch(f) {
/*
            case 0: //Compile Error: an enum switch case label must be the unqualified name of an enumeration constant.
                System.out.println("vanilla");
            case 1: //Compile Error: an enum switch case label must be the unqualified name of an enumeration constant.
                System.out.println("chocolate");
            case 2: //Compile Error: an enum switch case label must be the unqualified name of an enumeration constant.
                System.out.println("strawberry");
                break;
            case OTHERS: //Compile Error: an enum switch case label must be the unqualified name of an enumeration constant.
                System.out.println("others");
*/
            case STRAWBERRY:
                System.out.println("strawberry");
            default:
                System.out.println("missing flavor");
        }
    }
}
