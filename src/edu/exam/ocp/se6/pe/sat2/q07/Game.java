package edu.exam.ocp.se6.pe.sat2.q07;

class Game {
    static String s = "-";
    String s2 = "s2 ";
    Game(String arg) { s += arg;  s+=s2; s+=getName(); } //you can even call a non-static field/method in a constructor of the same class
    public String getName () { return "YYS "; }
}