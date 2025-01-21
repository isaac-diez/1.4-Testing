package org.Exercise1.Model;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {

    private ArrayList<Book> library;

    public Library() {
        this.library = new ArrayList<>();
    }

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }

    public boolean addBook(Book book) {

        if (!this.library.isEmpty()) {

            boolean exists = false;

            for (Book b : this.library) {
                if (b.equals(book)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                this.library.add(book);
                System.out.println("The book " + book.getTitle() + " was successfully added to the catalog.");
                return true;
            } else {
                System.out.println("The book " + book.getTitle() + " is already in the catalog. Failed to add.");
            }

        } else {
            this.library.add(book);
            System.out.println("The book " + book.getTitle() + " was successfully added to the catalog.");
            return true;
        }

        return false;
    }

    public void fullCatalog() {
        if (!this.library.isEmpty()) {

            for (Book book : this.library) {
                System.out.println(book);
                }
        } else {
            System.out.println("Library's catalog is EMPTY!");
        }
    }

    public String getBookByPosition(int position) {

        System.out.println("The book at the position " + position + " is " + this.library.get(position).getTitle());

        return this.library.get(position).getTitle();
    }

    public void addBookByPosition(Book book, int position) {

        if (!this.library.isEmpty()) {

            boolean exists = false;

            for (Book b : this.library) {
                if (b.equals(book)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                this.library.add(position, book);
                System.out.println("The book " + book.getTitle() + " was successfully added to the catalog in position " + position);
            } else {
                System.out.println("The book " + book.getTitle() + " is already in the catalog. Failed to add.");
            }

        } else {
            this.library.add(position, book);
            System.out.println("The book " + book.getTitle() + " was successfully added to the catalog in position " + position);

        }
    }

    public void deleteBookByTitle(String title) {

        if (!this.library.isEmpty()) {

            boolean found = false;

            Iterator<Book> libraryIterator = this.library.iterator();

            while (libraryIterator.hasNext()) {
                Book bookInList = libraryIterator.next();

                if (bookInList.getTitle().equals(title)) {
                    libraryIterator.remove();
                    System.out.println("The book " + title + " was successfully deleted from the catalog.");
                    found = true;
                }
            }

            if (!found) {
                System.out.println("The book " + title + " is not in the library's catalog!");
            }

        } else {
            System.out.println("Library's catalog is EMPTY!");
        }
    }
}
