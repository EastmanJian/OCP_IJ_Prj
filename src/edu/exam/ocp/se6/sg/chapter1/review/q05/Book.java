package edu.exam.ocp.se6.sg.chapter1.review.q05;

public class Book {
    private int ISBN;
    private String title, author;
    private int pageCount;

    private String getAuthor() {
        return author;
    }

    public int hashCode() {
        return ISBN;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.ISBN == other.ISBN;
    }

    public String toString() {
        return (ISBN + getAuthor()); //accessing private fields and methods of this instance.
    }

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.ISBN + book.getAuthor()); //Compile ok for accessing the private field and method of a new Book instance..
    }
}