package edu.exam.ocp.se6.pe.pe1.q09;

public class Q09 {
    static String s = "";
    public static void main(String[] args) {
        try { doStuff(args); }
        catch (Error e) { s += "e "; }
        s += "x ";
        System.out.println(s);
    }
    static void doStuff(String[] args) {
        if(args.length == 0)
            throw new IllegalArgumentException();
        s += "d ";
    }
}

/* ->
Exception in thread "main" java.lang.IllegalArgumentException
	at edu.exam.ocp.se6.pe.pe1.q09.Q09.doStuff(Q09.java:13)
	at edu.exam.ocp.se6.pe.pe1.q09.Q09.main(Q09.java:6) <5 internal calls>
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
 */