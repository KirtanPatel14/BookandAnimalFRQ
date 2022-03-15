package com.company;

public class BookListing {

    private Book book1;
    private double price;

    public BookListing(Book a, double p){
        book1=a;
        price=p;
    }
    public void printDescription(){
        book1.printBookInfo();
        System.out.println(", $"+price);

    }
}
