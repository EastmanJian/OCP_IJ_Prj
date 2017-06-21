package edu.exam.ocp.se6.sg.chapter2.variables.scope;

/**
 * Example of local variable scope
 */
public class Mouse {
    public boolean hasWheel; //initializes to false
    private int clickCount;

    public int rightClick(double d) {
        int response = (int) d; //local variable d and response. When the rightClick method is invoked, d and response get allocated in memory.
        return response; //When response is returned, a copy of response is sent to the calling method and both d and response go out of scope.
    }

    public String wheelClick() {
        if (hasWheel) {
            double pi = 3.14159;
            String greeting = "The mouse ate the " + pi;
            return greeting; //The String object "The mouse ate the 3.14159" is on the heap, so it is not destroyed when the method returns.
        } else {
            String error = "No wheel found";
            return error; //The String object "No wheel found" is on the heap, so it is not destroyed when the method returns.
        }
    }

    public void leftClick(int clickCount) {
        System.out.println("Left click " + clickCount + " times");
        this.clickCount = clickCount; //use this.clickCount to refer to the field.
    }

    public static void main(String[] args) {
        Mouse m = new Mouse();
        m.clickCount = 2;
        System.out.println(m.wheelClick()); // -> No wheel found
        m.leftClick(1); // -> Left click 1 times
        System.out.println(m.clickCount); // -> 1
    }
}