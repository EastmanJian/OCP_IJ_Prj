package edu.exam.ocp.se6.sg.chapter2.enumeration;

public class EnumFieldMethod {
    public enum Season {
        winter, spring, summer, fall;
        private final static String location = "Phoenix";
        public static Season getBest() {
            if (location.equals("Phoenix"))
                return winter;
            else
                return summer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Season.getBest()); // -> winter
    }
}