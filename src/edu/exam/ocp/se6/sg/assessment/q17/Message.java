package edu.exam.ocp.se6.sg.assessment.q17;

public abstract class Message {
    public String recipient;
//    public abstract final void sendMessage(); //Compile Error: illegal combination of modifiers: abstract and final
    public abstract void sendMessage();
    public static void main(String [] args) {
        Message m = new TextMessage();
        m.recipient = "6055551212";
        m.sendMessage();
    }
}