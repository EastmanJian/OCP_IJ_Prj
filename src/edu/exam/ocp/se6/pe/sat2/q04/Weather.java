package edu.exam.ocp.se6.pe.sat2.q04;

enum Weather {
    RAINY, Sunny;
    int count = 0;
    public void aMethod() {
        System.out.print("m ");
    }
    Weather() {
        System.out.print("c ");
        count++;
    }
}