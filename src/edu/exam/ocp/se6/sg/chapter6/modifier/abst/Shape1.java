package edu.exam.ocp.se6.sg.chapter6.modifier.abst;

/**
 * An abstract method cannot be declared private because a private method is not visible
 * in a child class and therefore cannot be overridden.
 */
public abstract class Shape1 {
//    private abstract double computeArea(); //Compile Error: illegal combination of modifiers: abstract and private
}