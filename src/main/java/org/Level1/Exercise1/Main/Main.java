package org.Level1.Exercise1.Main;

import org.Level1.Exercise1.Model.Book;
import org.Level1.Exercise1.Model.Library;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("1984", "George Orwell", 1949);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book book5 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book6 = new Book("Moby-Dick", "Herman Melville", 1851);
        Book book7 = new Book("War and Peace", "Leo Tolstoy", 1869);
        Book book8 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book book9 = new Book("Brave New World", "Aldous Huxley", 1932);
        Book book10 = new Book("The Road", "Cormac McCarthy", 2006);

        Library lesseps = new Library();

        lesseps.addBook(book1);
        lesseps.addBook(book3);
        lesseps.addBook(book5);
        lesseps.addBook(book7);
        lesseps.addBook(book9);
        System.out.println();

        lesseps.fullCatalog();
        System.out.println();

        lesseps.getBookByPosition(2); // Expected "The Catcher in the Rye"
        System.out.println();

        lesseps.addBookByPosition(book2, 3);
        System.out.println();

        lesseps.fullCatalog();
        System.out.println();

        lesseps.deleteBookByTitle("1984");
        System.out.println();

        lesseps.fullCatalog();
        System.out.println();

        lesseps.addBook(book2); // Expected book not added due to duplicity
    }
}