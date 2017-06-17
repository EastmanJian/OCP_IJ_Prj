package edu.exam.ocp.se6.sg.chapter3.forloop;

/**
 * The scope of the iterator is the body of the loop.
 */
public class ScopeForEach {
    public static void main(String[] args) {
        String [] replies = {"Hello", "Hi", "How are you?"};
        String s = "Bye";
        for(String reply : replies) {
            s = reply;
        }
        System.out.println(s);
//        System.out.println(reply); //compile error
    }
}

/* if comment the compile error line ->
How are you?
*/
