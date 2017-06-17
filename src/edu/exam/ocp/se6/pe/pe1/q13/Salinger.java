package edu.exam.ocp.se6.pe.pe1.q13;

import java.io.FileNotFoundException;

public class Salinger extends Author {
    private void write(int x) { }
    protected void write(long x) throws FileNotFoundException { }
    protected void write(boolean x) throws Exception { }
    protected int write(short x) { return 7; }
    public void write() {  }
}

