package edu.exam.ocp.se6.pe.pe4.q24;

class MyStuff implements Comparable<MyStuff> {
    String name;
    int value;

    MyStuff(String n, int v) {
        name = n;
        value = v;
    }

    public int compareTo(MyStuff m) {
        return name.compareTo(m.name); // sort alphabetically
//        return value - m.value; // 2nd answer, to sort ascending
    }
}