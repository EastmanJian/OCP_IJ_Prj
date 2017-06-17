package edu.exam.ocp.se6.sg.chapter2.methods.overload;

/**
 * Example of autoboxing when invoking overloaded methods
 */
public class Email {
    public void send(float f) {
        System.out.println("float parameter");
    }
//    public void send(double d) {
//        System.out.println("double parameter");
//    }
    public void send(Object x) {
        System.out.println("Object parameter");
    }
    public void send(String s) {
        System.out.println("String parameter");
    }
    public void send(int id) {
        System.out.println("int parameter");
    }
    public static void main(String [] args) {
        Email email = new Email();
        email.send(12.5);  //12.5 is double, autobox into Double, it's a child object of Object, hence send(Object x) is invoked. If there is a method send(double d), it will be invoked instead of send(Object x)
        email.send(23.6f); //if there is send(double d) instead of send(float f), send(double d) will be invoked instead of send(Object x), because widening has higher priority of autoboxing.
        email.send(123456);
        email.send(new String("Hello"));
        email.send(new java.util.Date());
    }
}

/* ->
Object parameter
float parameter
int parameter
String parameter
Object parameter
*/