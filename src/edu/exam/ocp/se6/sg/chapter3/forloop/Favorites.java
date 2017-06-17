package edu.exam.ocp.se6.sg.chapter3.forloop;

import java.util.ArrayList;
public class Favorites {
    private ArrayList<String> urls = new ArrayList<String>();

    public void showFavorites() {
        for (String url : urls) {
            if (url.startsWith("http://")) {
                System.out.println(url);
            } else {
                System.out.println("http://" + url);
            }
        }
    }

    public void addFavorite(String url) {
        urls.add(url);
    }

    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.addFavorite("sybex.com");
        f.addFavorite("wiley.com");
        f.addFavorite("http://google.com");
        f.addFavorite("yahoo.com");
        f.showFavorites();
    }
}

/* ->
http://sybex.com
http://wiley.com
http://google.com
http://yahoo.com
*/
