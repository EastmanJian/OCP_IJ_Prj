package edu.exam.ocp.se6.pe.pe1.q36;

import java.io.IOException;

class Bungee implements Risky {
    public String doStuff() throws IOException {
        throw new IOException();
    }

    public Bungee doCrazy() {
        return new Bungee();
    }

    public void doInsane() throws NullPointerException {
        throw new NullPointerException();
    }
}