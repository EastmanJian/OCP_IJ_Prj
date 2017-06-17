package edu.exam.ocp.se6.sg.chapter1.callbyvalue;

/**
 * If the argument passed into a method parameter is a reference type, the same rule applies: it is impossible for a
 * method to alter the original reference. However, because the method now has a reference to the same object that
 * the argument points to, the method can change the object.
 *
 * However, in the example, firstName and lastName could not change the objects is because the example uses String
 * types and String objects are immutable. the parameters lastName and firstName are assigned to other String objects
 * in the method. The original argument object "Albert", "Einstein" are not changed.
 */
public class PassStringReference {
    public static int findByName(String lastName, String firstName) {
        lastName = "Doe";
        firstName = "Jane";
        return -1;
    }

    public static void main(String[] args){
        String first = "Albert";
        String last = "Einstein";
        int result = findByName(last, first);
        System.out.println(first + " " + last);
    }
}

/* ->
Albert Einstein
*/