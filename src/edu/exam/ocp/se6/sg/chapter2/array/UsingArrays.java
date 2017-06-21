package edu.exam.ocp.se6.sg.chapter2.array;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UsingArrays {
    public static void main(String[] args) {
        GregorianCalendar [] july;
        july = new GregorianCalendar[31];
        int year = 2010, month = 7;
        for(int i = 0; i < july.length; i++) {
            july[i] = new GregorianCalendar(year, month, i+1);
        }
        for(GregorianCalendar day : july) {
            System.out.print(day.get(Calendar.MONTH) + "/"
            + day.get(Calendar.DAY_OF_MONTH) + "/"
            + day.get(Calendar.YEAR) + " ");
        }
    }
}

/* ->
7/1/2010 7/2/2010 7/3/2010 ... 7/31/2010
*/