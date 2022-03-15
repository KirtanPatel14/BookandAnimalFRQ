package com.company;


import java.util.ArrayList;

public class BookTester{

    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book("Frankenstein", "Mary Shelly");
        PictureBook book2 = new PictureBook(" W.W Denslow", "L. Frank Baum", "The Wonderful Wizard of Oz");
        BookListing listing1 = new BookListing(book1, 10.99);
        listing1.printDescription();
        System.out.println();
        BookListing listing2 = new BookListing(book2, 12.99);
        listing2.printDescription();
        System.out.println();
        myLibrary.add(book1);
        myLibrary.add(book2);
        book1.printBookInfo();
        System.out.println();
        book2.printBookInfo();

    }
}
