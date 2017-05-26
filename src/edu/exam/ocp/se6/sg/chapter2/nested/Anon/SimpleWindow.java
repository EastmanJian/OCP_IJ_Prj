package edu.exam.ocp.se6.sg.chapter2.nested.Anon;

import java.awt.*;
import java.awt.event.*;


/**
 * Example of using Anonymous Inner Class as Event Handlers
 *
 * The following SimpleWindow class defines two inner classes: an anonymous WindowAdapter that terminates the JVM when
 * a user closes the window, and an ActionListener that changes the background color of the window to red.
 */
public class SimpleWindow {
    private Frame frame;

    public SimpleWindow() {
        frame = new Frame("Click the button");
        frame.setSize(250, 200);
        frame.setLayout(new FlowLayout());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Button red = new Button("Red");
        red.addActionListener(new RedHandler());
        frame.add(red);
        frame.setVisible(true);
    }

    private class RedHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            frame.setBackground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new SimpleWindow();
    }
}