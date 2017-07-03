package edu.exam.ocp.se6.sg.chapter6.review.q19;

/*
class NonFictionBook extends Book { //Compile Error: NonFictionBook is not abstract and does not override abstract method read() in Book
    public void read(int time) {
        System.out.println("Reading a NonFictionBook");
    }
}
*/

class NonFictionBook extends Book {
    public void read() {
        System.out.println("Reading a NonFictionBook");
    }
}
