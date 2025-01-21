package org.Exercise1.Model;

import org.Level1.Exercise1.Model.Book;
import org.Level1.Exercise1.Model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library libraryTest;

    @BeforeEach
    void setup() {
        libraryTest = new Library();

        libraryTest.addBook(new Book("1984", "George Orwell", 1949));
        libraryTest.addBook(new Book("Brave New World", "Aldous Huxley", 1932));
        libraryTest.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));

        System.out.println(libraryTest);
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
    void deleteBookByTitle() {
    }
}