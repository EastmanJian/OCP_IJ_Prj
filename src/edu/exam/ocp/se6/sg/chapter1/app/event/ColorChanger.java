package edu.exam.ocp.se6.sg.chapter1.app.event;

import java.awt.Component;
import java.awt.Color;
import java.awt.event.*;

public class ColorChanger implements ActionListener {
    private Component container;

    public ColorChanger(Component c) {
        container = c;
    }

    public void actionPerformed(ActionEvent e) {
        String color = e.getActionCommand();
        if (color.equals("red")) {
            container.setBackground(Color.RED);
        } else if (color.equals("blue")) {
            container.setBackground(Color.BLUE);
        } else {
            container.setBackground(Color.WHITE);
        }
    }
}