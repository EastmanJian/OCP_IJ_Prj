package edu.exam.ocp.se6.sg.chapter3.breakloop;

public class MustLabel {
    static void test1() {
        int x = 1;
        while(x <= 10) {
            System.out.print(x++ + " ");
            for(int y = 10; y >= 1; y--) {
                System.out.print(y + " ");
                if(y == 8)
                    break;
            }
        }        
    }

    static void test2() {
        int x = 1, y = 10;
        loopx : while(x <= 10) {
            System.out.print(x++ + " ");
            for( ; y >= 1; y--) {
                System.out.print(y + " ");
                if(y == 8)
                    break loopx;
            }
        }    }

    public static void main(String[] args) {
        System.out.println("---test1---");
        test1();
        System.out.println("\n---test2---");
        test2();
    }
}

/* ->
---test1---
1 10 9 8 2 10 9 8 3 10 9 8 4 10 9 8 5 10 9 8 6 10 9 8 7 10 9 8 8 10 9 8 9 10 9 8 10 10 9 8
---test2---
1 10 9 8
*/