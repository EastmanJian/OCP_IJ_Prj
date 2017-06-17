package edu.exam.ocp.se6.sg.chapter3.exception;

/**
 * Example of NoClassDefFoundError
 * Delete NoClassDefFoundE.class and run this
 */
public class NoClassDefFoundExceptionTest {
    public static void main(String[] args) {
        new NoClassDefFoundE().doNothing();
    }
}

/* ->
Exception in thread "main" java.lang.NoClassDefFoundError: edu/exam/ocp/se6/sg/chapter3/exception/NoClassDefFoundE
        at edu.exam.ocp.se6.sg.chapter3.exception.NoClassDefFoundExceptionTest.main(NoClassDefFoundExceptionTest.java:9)
Caused by: java.lang.ClassNotFoundException: edu.exam.ocp.se6.sg.chapter3.exception.NoClassDefFoundE
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        ... 1 more
*/