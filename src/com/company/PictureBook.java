package com.company;

public class PictureBook extends Book {

    private String illustrator;

    public PictureBook(String i, String a, String t){
        super(t,a);
        illustrator = i;
    }

    public void printBookInfo(){
        super.printBookInfo();
        System.out.print("and illustrated by"+illustrator);
    }
}
