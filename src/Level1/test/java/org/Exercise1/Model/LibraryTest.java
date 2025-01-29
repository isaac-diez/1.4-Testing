package org.Exercise1.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library libraryTest;

    @BeforeEach
    void setup() {
        libraryTest = new Library();

        libraryTest.addBook(new Book("1984", "George Orwell", 1949));
        libraryTest.addBook(new Book("Brave New World", "Aldous Huxley", 1932));
        libraryTest.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        libraryTest.addBook(new Book("Moby-Dick", "Herman Melville", 1851));
        libraryTest.addBook(new Book("War and Peace", "Leo Tolstoy", 1869));
        libraryTest.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 1937));

    }

    @Test
    void testLibraryNotNull() {
        assertNotNull(this.libraryTest.getLibrary(), "The ArrayList should be not null upon adding one book");
    }

    @Test
    void testSizeOfLibrary() {
        assertEquals(3, this.libraryTest.getLibrary().size(), "Size of the library should be 3");
    }

    @Test
    void testDuplicatesInLibraryNotAllowed() {
        libraryTest.addBook(new Book("Brave New World", "Aldous Huxley", 1932));

        int timesBookFound = 0;
        for (Book book : this.libraryTest.getLibrary() ) {
            if (book.getTitle().equals("Brave New World")) {
                timesBookFound++;
            }
        }

        assertEquals(1,timesBookFound, "One book should only be once in the catalog. No duplicates allowed." );

    }

    @Test
    void testGetBookByPosition() {

        libraryTest.getBookByPosition(0);
        assertEquals("1984", libraryTest.getBookByPosition(0), "Name of the book should be \"1984\"");

        libraryTest.getBookByPosition(2);
        assertEquals("The Great Gatsby", libraryTest.getBookByPosition(2), "Name of the book should be \"Pride and Prejudice\"");
    }

    @Test
    void testLibraryModifiedAfterAddingBook(){

        assertEquals(3, this.libraryTest.getLibrary().size());

        libraryTest.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));

        assertEquals(4, this.libraryTest.getLibrary().size(),"List size should increase after adding a book.");

    }

    @Test
    void testLibraryDecreasesAfterRemovingBook() {

        libraryTest.deleteBookByTitle("1984");

        assertEquals(2, libraryTest.getLibrary().size(), "List size should decrease after removing a book");

    }

    @Test
    void testLibraryStaysAlphabeticallySortedAfterAddingBook() {

        libraryTest.addBook(new Book("Pride and Prejudice", "Jane Austen", 1813));


        Collections.sort(libraryTest.getLibrary(), new Comparator<>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareTo(book2.getTitle());
            }
        });

        assertEquals("1984", libraryTest.getBookByPosition(0), "book title should be 1984");
        assertEquals("Brave New World", libraryTest.getBookByPosition(1), "book title should be Brave New World");
        assertEquals("Moby-Dick", libraryTest.getBookByPosition(2), "book title should be Moby-Dick");
        assertEquals("Pride and Prejudice", libraryTest.getBookByPosition(3), "book title should be Pride and Prejudice");
        assertEquals("The Great Gatsby", libraryTest.getBookByPosition(4), "book title should be The Great Gatsby");
        assertEquals("The Hobbit", libraryTest.getBookByPosition(5), "book title should be The Hobbit");
        assertEquals("War and Peace", libraryTest.getBookByPosition(6), "book title should be War and Peace");
    }

    @Test
    void testLibraryStaysAlphabeticallySortedAfterDeletingBook() {

        libraryTest.deleteBookByTitle("Moby-Dick");

        Collections.sort(libraryTest.getLibrary(), new Comparator<>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareTo(book2.getTitle());
            }
        });

        assertEquals("1984", libraryTest.getBookByPosition(0), "book title should be 1984");
        assertEquals("Brave New World", libraryTest.getBookByPosition(1), "book title should be Brave New World");
        assertEquals("The Great Gatsby", libraryTest.getBookByPosition(2), "book title should be The Great Gatsby");
        assertEquals("The Hobbit", libraryTest.getBookByPosition(3), "book title should be The Hobbit");
        assertEquals("War and Peace", libraryTest.getBookByPosition(4), "book title should be War and Peace");

    }
}