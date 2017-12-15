package edu.exam.ocp.se6.sg.chapter4.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * (some are out of SG Book)
 */
public class DateTimeCalendarDemo {
    public static void main(String[] args) throws ParseException {
        /**
         * using Date constructor Date(long), where long is milliseconds since the epoch (1970-1-1 00:00 GMT).
         */
        Date d = new Date(444444444000L);
        System.out.println(d); // -> Wed Feb 01 08:47:24 CST 1984


        /**
         * using Date constructor public Date() { this(System.currentTimeMillis()); }
         * Date.getTime() - get the milliseconds since the epoch (1970-1-1 00:00 GMT).
         * Date.setTime(long)
         */
        Date d1 = new Date(); //current timestamp
        Date d2 = d1;
        System.out.println(d1); // sample output -> Sun Jun 25 16:05:46 CST 2017
        System.out.println(d1.getTime()); // sample output -> 1513246350761
        d2.setTime(d1.getTime() + (7 * 24 * 60 * 60 * 1000));
        System.out.println(d2); // sample output -> Sun Jul 02 16:05:46 CST 2017


        /**
         * Calendar.getInstance(), Calendar.set(int y, int m, int d), Calendar.getTime()
         */
        Calendar cal = Calendar.getInstance();
        cal.set(2017, Calendar.JUNE, 24); //month starts from 0 (Jan)
        Date date = cal.getTime();

        /**
         * Calendar.roll(...), Calendar.add(...)
         */
        Calendar c = Calendar.getInstance();
        c.set(1999, 11, 25); //month starts from 0 (Jan)
        System.out.println(c.getTime()); // -> Sat Dec 25 13:42:22 CST 1999
        c.roll(Calendar.MONTH, 3); // roll() will not change larger fields
        c.add(Calendar.DATE, 10); // add() add time base on calendar's rule
        System.out.println(c.getTime()); // -> Sun Apr 04 13:42:22 CST 1999

        /**
         * Using DateFormat.parse() to create a Date.
         */
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        Date d3 = df.parse("Dec 1, 2017");

        /**
         * Using GregorianCalendar to create a Date.
         */
        GregorianCalendar july = new GregorianCalendar(2010, 7,  1);
        Date d4 = july.getTime();

    }
}
