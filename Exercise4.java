package com.company;
class Library1{
    String[]  books;
    int no_of_books;
    Library1(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBooks(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added");
    }
    void showAvailableBooks(){
        System.out.println("The available books are:");
        for (String book:this.books) {
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBooks(String book){
        for(int i=0;i<=this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book doesn't exist");
    }
}
public class Exercise4 {
    public static void main(String[] args) {
        Library1 centralLibrary=new Library1();
        centralLibrary.addBooks("C++");
        centralLibrary.addBooks("Python for everyone");
        centralLibrary.addBooks("Java language");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBooks("C++");
        centralLibrary.showAvailableBooks();

    }
}
