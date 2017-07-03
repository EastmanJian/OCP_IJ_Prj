package edu.exam.ocp.se6.sg.chapter5.review.q15;

public class Calendar {
    private static int FIRST_DAY = 1;

    public static synchronized void setFirstDay(int value) { //the monitor lock is Calendar.class for this static synchronized method.
        FIRST_DAY = value;
    }

    public static int getFirstDay() {
        return FIRST_DAY;
    }
}