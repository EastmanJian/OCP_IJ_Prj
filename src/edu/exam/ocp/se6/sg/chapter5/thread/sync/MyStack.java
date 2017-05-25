package edu.exam.ocp.se6.sg.chapter5.thread.sync;

public class MyStack {
    private int[] values = new int[10];
    private int index = 0;

    public void push(int x) {
        if (index <= 9) {
            values[index] = x;
            Thread.yield();
            index++;
        }
    }

    public int pop() {
        if (index > 0) {
            index--;
            return values[index];
        } else {
            return -1;
        }
    }

    public String toString() {
        String reply = "";
        for (int i = 0; i < values.length; i++) {
            reply += values[i] + " ";
        }
        return reply;
    }
}