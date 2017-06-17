package edu.exam.ocp.se6.sg.chapter1.app.demos;

import edu.exam.ocp.se6.sg.chapter1.app.event.ColorChanger;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class TestColors {
    public static void main(String[] args) {
        Button b = new Button("Testing...");
        b.setBackground(Color.GREEN);
        System.out.println("Color is " + b.getBackground());
        ColorChanger cc = new ColorChanger(b);
        ActionEvent action = new ActionEvent(b, ActionEvent.ACTION_PERFORMED, "blue");
        cc.actionPerformed(action);
        System.out.println("Now the color is " + b.getBackground());
    }
}