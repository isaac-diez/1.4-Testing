package org.level2Exer4.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class TestArrayList {

    @BeforeEach
    public void setup() {



    }

    @Test
    public void testArrayListElementsInAnyOrder() {

        ArrayList<Book> listOfBooks = new ArrayList<>();

        Book book1 = new Book("To Kill a Mockingbird", 1960);
        Book book2 = new Book("1984", 1949);
        Book book3 = new Book("The Great Gatsby", 1925);
        Book book4 = new Book("Pride and Prejudice", 1813);
        Book book5 = new Book("The Catcher in the Rye", 1951);

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);




    }

    @Test
    public void testArrayListElementsOneIsMissing() {

        Book book1 = new Book("To Kill a Mockingbird", 1960);
        Book book2 = new Book("1984", 1949);
        Book book3 = new Book("The Great Gatsby", 1925);
        Book book4 = new Book("Pride and Prejudice", 1813);
        Book book5 = new Book("The Catcher in the Rye", 1951);

    }



}
