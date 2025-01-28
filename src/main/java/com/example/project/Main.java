package com.example.project;
import java.util.Scanner;
// System.out.println("✩₊˚.⋆☾⋆`✦ ˑ ִֶ 𓂃⊹  ⊹ִֶ 𓂃 ˑ ✦`⋆☾⋆⁺₊✧");

public class Main{
    public static void main(String[] args) {
        boolean end = false;
        int option;
        Scanner scan = new Scanner(System.in);
        BookStore store = new BookStore();
        System.out.println("✩₊˚.⋆☾⋆⁺₊✧`✦ ˑ ִֶ 𓂃  welcome to the BTHS library! 𓂃 ˑ ✦`✩₊˚.⋆☾⋆⁺₊✧");
        while (!end) {
            System.out.println("               select one of the following options:                  ");
            System.out.println();
            System.out.println("0: exit application");
            System.out.println("1: add book");
            System.out.println("2: upgrade quantity of a book");
            System.out.println("3: search a book");
            System.out.println("4: show all books");
            System.out.println("5: register student");
            System.out.println("6: show all registered students");
            System.out.println("7: check out book");
            System.out.println("8: check in book");
            System.out.print("what would you like to do?: ");
            option = scan.nextInt();
            scan.nextLine();
            System.out.println();
            if (option == 1) {
                System.out.print("enter title of book: ");
                String title = scan.nextLine();
                
                System.out.print("enter author of book: ");
                String author = scan.nextLine();
        
                System.out.print("enter year book was published: ");
                int year = scan.nextInt();
                scan.nextLine();
        
                System.out.print("enter serial # of book: ");
                int serialNum = scan.nextInt();
                scan.nextLine();
                String serial = "" + serialNum + "";
        
                System.out.print("enter quantity of book: ");
                int quantity = scan.nextInt();
                scan.nextLine();
                
                Book book = new Book (title, author, year, serial, quantity);
                store.addBook(book);
                System.out.println();
            } else if (option == 2) {
                System.out.println("which book do you want to update quantity for?: ");
                System.out.print(store.bookStoreBookInfo());

                int index = scan.nextInt() - 1;
                scan.nextLine();

                System.out.print("enter number of books to add: ");
                int newQuantity = scan.nextInt();
                scan.nextLine();

                store.getBooks()[index].setQuantity(store.getBooks()[index].getQuantity() + newQuantity);
                System.out.println();
            } else if (option == 3) {
                System.out.println("what book would you like to find?: ");
                String bookSearch = scan.nextLine();

                for (int i = 0; i < store.getBooks().length; i++) {
                    if (bookSearch.equals(store.getBooks()[i].getTitle())) {
                        System.out.println(store.getBooks()[i].bookInfo());
                    }
                }
                System.out.println();
            } else if (option == 4) {
                System.out.println(store.bookStoreBookInfo());
            } else if (option == 5) {
                System.out.print("enter username: ");
                String name = scan.nextLine();

                IdGenerate.generateID();
                User user = new User(name, IdGenerate.getCurrentId());
                store.addUser(user);
                System.out.println();
            } else if (option == 6) {
                System.out.println(store.bookStoreUserInfo());
            } else if (option == 7) {
                System.out.println("which book would you like to check out?: ");
                System.out.println(store.bookStoreBookInfo());

                int index = scan.nextInt() - 1;
                scan.nextLine();

                store.removeBook(store.getBooks()[index]);
                System.out.println();
            } else if (option == 8) {
                System.out.println("which book would you like to check in?: ");
                String title = scan.nextLine();

                for (int i = 0; i < store.getBooks().length; i++) {
                    if (title.equals(store.getBooks()[i].getTitle())) {
                        store.getBooks()[i].setQuantity(store.getBooks()[i].getQuantity() + 1);
                        System.out.println("successful check in");
                    }
                }
                System.out.println();
            } else if (option == 0) {
                end = true;
            } else {
                System.out.println("0: exit application");
                System.out.println("1: add book");
                System.out.println("2: upgrade quantity of a book");
                System.out.println("3: search a book");
                System.out.println("4: show all books");
                System.out.println("5: register student");
                System.out.println("6: show all registered students");
                System.out.println("7: check out book");
                System.out.println("8: check in book");
                System.out.print("what would you like to do?: ");
                option = scan.nextInt();
                scan.nextLine();
                System.out.println();
            }
        }
    }
}