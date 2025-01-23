package org.level2Exer4.Model;

import java.util.Objects;

public class Book {

    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && year == (book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }

}
