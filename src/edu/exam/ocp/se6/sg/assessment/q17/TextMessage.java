package edu.exam.ocp.se6.sg.assessment.q17;

class TextMessage extends Message {
    public final void sendMessage() {
        System.out.println("TextMessage to " + recipient);
    }
}