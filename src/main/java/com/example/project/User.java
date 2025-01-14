package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name;
    private String id;
    private Book[] books = new Book[5];

    //requires 1 contructor with two parameters that will initialize the name and id
    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }
 
    //returns name of user
    public String getName() {return name;}

    //sets name of user to new name
    public void setName(String newName) {
        name = newName;
    }

    //returns id of user
    public String getId() {return id;}

    //sets id of user to new id
    public void setId(String newId) {
        id = newId;
    }

    //returns books of user
    public Book[] getBooks() {return books;}

    //sets books of user to new books
    public void setBooks(Book[] newBooks) {
        for (int i = 0; i < 5; i++) {
            books[i] = newBooks[i];
        }
    }

    //returns a booklist for the user, if empty, output "empty"
    public String bookListInfo() {
        String info = "";
        for (Book book: books) {
            if (book == null) {
                info += "empty\n";
            } else {
                info += book.bookInfo() + "\n";
            }
        }
        return info;
    } 

    //returns users info
    public String userInfo() {
        String info = "";
        info += "Name: " + name + "\n";
        info += "Id: " + id + "\n";
        info += "Books: \n";
        info += bookListInfo();
        return info;
    } 
       
}