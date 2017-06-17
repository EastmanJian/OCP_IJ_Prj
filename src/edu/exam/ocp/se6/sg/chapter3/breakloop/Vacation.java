package edu.exam.ocp.se6.sg.chapter3.breakloop;

public class Vacation {
    public enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public void workUntil(Days dayOff) {
        for (Days day : Days.values()) {
            if (day != dayOff) {
                System.out.println("Working on " + day);
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Vacation v = new Vacation();
        v.workUntil(Days.THURSDAY);
    }
}

/* ->
Working on SUNDAY
Working on MONDAY
Working on TUESDAY
Working on WEDNESDAY
*/