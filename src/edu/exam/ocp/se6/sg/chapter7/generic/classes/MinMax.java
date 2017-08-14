package edu.exam.ocp.se6.sg.chapter7.generic.classes;

public class MinMax<N extends Number> {
    public N max, min;
    public void setValue(N x) {
        if (x.doubleValue() < min.doubleValue()) min = x;
        if (x.doubleValue() > max.doubleValue()) max = x;
    }
}
