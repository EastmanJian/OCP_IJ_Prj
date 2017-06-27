package edu.exam.ocp.se6.pe.pe2.q59;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Collection classes have constructor which accepts a collection.
 */
public class Q59 {
    public static void main(String[] args) {
        List<String> x = new LinkedList<String>();
        Set<String> hs = new HashSet<String>();
        String[] v = {"a", "b", "c", "b", "a"};
        for (String s : v) {
            x.add(s);
            hs.add(s);
        }
        System.out.print(hs.size() + " " + x.size() + " ");
        HashSet hs2 = new HashSet(x); //When the Collection (LinkedList x) is passed into hs2’s constructor, the Collection is trimmed so that no duplicates are created.
        LinkedList x2 = new LinkedList(hs);
        System.out.println(hs2.size() + " " + x2.size());
    }
}
/*->
3 5 3 3
*/