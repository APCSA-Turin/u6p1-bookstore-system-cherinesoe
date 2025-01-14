package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    //returns title of book
    public String getTitle() {return title;}

    //sets title of book to new title
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    //returns author of book
    public String getAuthor() {return author;}

    //sets author of book to new author
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    //returns year book was published
    public int getYearPublished() {return yearPublished;}

    //sets year book was published to new year
    public void setYearPublished(int newYear) {
        yearPublished = newYear;
    }

    //returns isbn of book
    public String getIsbn() {return isbn;}

    //sets isbn of book to new isbn
    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    //returns quantity of book
    public int getQuantity() {return quantity;}

    //sets quantity of book to new quantity
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    //returns information on book
    public String bookInfo() {
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    }
}