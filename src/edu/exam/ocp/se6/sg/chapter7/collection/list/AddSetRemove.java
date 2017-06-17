package edu.exam.ocp.se6.sg.chapter7.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List operation example using ArrayList
 */
public class AddSetRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SD");                   //[0]SD
        list.add(0, "NY"); //[0]NY [1]SD
        list.set(1, "FL");                //[0]NY [1]FL
        list.remove("NY");             //[0]FL
        list.remove(0);             //(empty)
    }
}
