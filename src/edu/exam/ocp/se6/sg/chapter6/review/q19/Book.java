package edu.exam.ocp.se6.sg.chapter6.review.q19;

public abstract class Book {
    public abstract void read();
    public static void main(String [] args) {
        Book book = new NonFictionBook();
        book.read();
    }
}