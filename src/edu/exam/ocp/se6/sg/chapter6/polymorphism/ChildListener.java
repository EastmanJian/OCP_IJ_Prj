package edu.exam.ocp.se6.sg.chapter6.polymorphism;

/**
 * The following ChildListener class extends ButtonListener and overrides the buttonClicked method.
 */
public class ChildListener extends ButtonListener {
    public void buttonClicked() {
        System.out.println("Inside ChildListener");
    }

    public static void main(String[] args) {
        /*
        Using polymorphism, the following statements are valid.
        The listener reference is of type ButtonListener, but it points to a ChildListener object.
        The compiler looks for a buttonClicked method in ButtonListener and finds one, so the code compiles file.
        However, at runtime, the buttonClicked method in ChildListener is invoked.
         */
        ButtonListener listener = new ChildListener();
        listener.buttonClicked();
    }
}