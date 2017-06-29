package edu.exam.ocp.se6.sg.chapter2.interfaces;

import java.io.FileNotFoundException;

/**
 * Example of overriding a method when extends an interface.
 * (out of SG Book)
 */
interface Keyboard extends Clickable {
    Integer click() throws FileNotFoundException; //Override
    void doClick();
}