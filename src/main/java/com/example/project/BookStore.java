package com.example.project;

public class BookStore{
    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users)
    private Book[] books = new Book[5];
    private User[] users = new User[10];

    //requires 1 empty constructor
    public BookStore() {}

    //returns users at bookstore
    public User[] getUsers() {return users;}

    //sets users at bookstore to new users
    public void setUsers(User[] newUsers) {
        users = newUsers;
    }

    //returns books at bookstore
    public Book[] getBooks() {return books;}

    //adds user by replacing first null found
    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                i = users.length;
            }
        }
    } 

    //removes user by checking id of users
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (user.getId() == users[i].getId()) {
                users[i] = null;
                i = users.length;
            }
        }
        consolidateUsers();
    }

    //pushes all null values behind users in array
    public void consolidateUsers() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                for (int j = i; j < users.length; j++) {
                    if (users[j] != null) {
                        users[i] = users[j];
                        users[j] = null;
                        j = users.length;
                    }
                }
            }
        }
    }

    //adds book to books array 
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                i = books.length;
            }
        }
    }

    //inserts book at given index in books array
    public void insertBook(Book book, int index) {
        books[index] = book;
    }

    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (book == null) {

            } else {
                (book.getIsbn() == books[i].getIsbn()) {
                    books[i] = null;
                    i = books.length;
            } 
        }
        // for (int i = 0; i < books.length; i++) {
        //     if (books[i] == null) {
        //         for (int j = i; j < books.length; j++) {
        //             if (books[j] != null) {
        //                 books[i] = books[j];
        //                 books[j] = null;
        //                 j = books.length;
        //             }
        //         }
        //     }
        // }
    }
       
    public String bookStoreBookInfo() {
        String info = "";
        for (Book book: books) {
            info += book.bookInfo() + "\n";
        }
        return info;
    } 

    // public String bookStoreUserInfo() {} //you are not tested on this method but use it for debugging purposes

}