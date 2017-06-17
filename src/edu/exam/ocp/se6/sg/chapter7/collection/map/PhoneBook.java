package edu.exam.ocp.se6.sg.chapter7.collection.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Example of TreeMap
 * TreeMap is a good choice for a phone book because elements are retrieved and inserted in log(n) time
 */
public class PhoneBook {
    public static void main(String[] args) {
        TreeMap<String, Long> phoneBook = new TreeMap<>();
        phoneBook.put("Nguyen, Scott", 2015551111L);
//        phoneBook.put(null, 114L); //Runtime Exception: NullPointerException
        phoneBook.put("Negreanu, Dan", 2015552222L);
        phoneBook.put("Ivey, Phil", 2015553333L);
        phoneBook.put("Rosario, Shirley", 2015554444L);
        phoneBook.put("Boyd, Russ", 2015555555L);

        Long number = phoneBook.get("Ivey, Phil"); //a value from a key
        Set<String> keys = phoneBook.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + phoneBook.get(key));
        }
        Map.Entry<String, Long> last = phoneBook.lastEntry();

        System.out.println("Last entry = " + last.getKey() + " " + last.getValue());
        String firstKey = phoneBook.firstKey();
        System.out.println("First key = " + firstKey);
    }
}

/* ->
Boyd, Russ: 2015555555
Ivey, Phil: 2015553333
Negreanu, Dan: 2015552222
Nguyen, Scott: 2015551111
Rosario, Shirley: 2015554444
Last entry = Rosario, Shirley 2015554444
First key = Boyd, Russ
*/