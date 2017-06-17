package edu.exam.ocp.se6.sg.chapter7.collection.map;

import java.util.HashMap;

/**
 * Using a Map to Count Keywords
 */
public class KeywordCounter {
    public HashMap<String, Integer> keywords = new HashMap<String, Integer>();

    public void keywordFound(String keyword) {
        Integer count = keywords.get(keyword);
        if (count == null) {
            keywords.put(keyword, 1);
        } else {
            keywords.put(keyword, count + 1);
        }
    }

    public static void main(String[] args) {
        KeywordCounter webpage = new KeywordCounter();
        webpage.keywordFound("java");
        webpage.keywordFound("ejb");
        webpage.keywordFound("java");
        webpage.keywordFound("jsp");
        for (String keyword : webpage.keywords.keySet()) {
            System.out.println(keyword + " = " +
                    webpage.keywords.get(keyword));
        }
    }
}

/*
java = 2
jsp = 1
ejb = 1
*/