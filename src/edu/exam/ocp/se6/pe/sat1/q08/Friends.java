package edu.exam.ocp.se6.pe.sat1.q08;

class Friends extends Object{
    String name;

    Friends(String n) {
        name = n;
    }


    /* Observe HashMap.Get(...), it uses hashcode() and equals() to match the key.
     * like String.hashCode(), it overrides Object.hashCode().  String.hashCode()'s value is determined by the string value.
     * here in Friends class, if we override the equals() and hashCode() similar to String,
     * let the hashCode() value be determined by the Friends.name, and check if equal by Friends.name's value,
     * when we run 'java Birthdays Draumur', it returns 'Spring 2002'
    */


    public boolean equals(Object f) {
        boolean result = false;
        if (((Friends)f).name.equals(this.name))
            result = true;
        return result;
    }


    public int hashCode() {
        int h = 0;
        if (h == 0 && name.length() > 0) {
            char val[] = name.toCharArray();

            for (int i = 0; i < name.length(); i++) {
                h = 31 * h + val[i];
            }
        }
        return h;
    }


}