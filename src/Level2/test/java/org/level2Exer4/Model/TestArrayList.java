package org.level2Exer4.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.assertj.core.api.Assertions.assertThat;

public class TestArrayList {

    private ArrayList<Object> listOfObjects;
    private String string;
    private int integer;
    private Double decimal;
    private boolean yesNo;
    private Book book;


    @BeforeEach
    public void setup() {

        listOfObjects = new ArrayList<>();

        string = "person";
        integer = 20;
        decimal = 3.14;
        yesNo = true;
        book = new Book("The Great Gatsby", 1925);

        listOfObjects.add(string);
        listOfObjects.add(integer);
        listOfObjects.add(decimal);
        listOfObjects.add(yesNo);
        listOfObjects.add(book);

    }

    @Test
    public void testArrayListElementsInAnyOrder() {

        assertThat(listOfObjects).containsExactlyInAnyOrder(integer,string,yesNo,book,decimal);

    }

    @Test
    public void testArrayListElementsInCreationOrder() {

        assertThat(listOfObjects).containsExactly(string,integer,decimal,yesNo,book);

    }

    @Test
    public void testArrayListElementsOfInAnyOrder() {

        ArrayList<Object> expectedElementsOfList = new ArrayList<>();

        expectedElementsOfList.add(book);
        expectedElementsOfList.add(string);
        expectedElementsOfList.add(integer);
        expectedElementsOfList.add(yesNo);
        expectedElementsOfList.add(decimal);

        assertThat(listOfObjects).containsExactlyInAnyOrderElementsOf(expectedElementsOfList);


    }

    @Test
    public void testArrayListElementIsOnlyFoundOnce() {

        assertThat(listOfObjects).containsOnlyOnce(book);
        assertThat(listOfObjects).containsOnlyOnce(string);

    }

    @Test
    public void testArrayListElementNotFound() {

        ArrayList<Object> listOfOtherElements = new ArrayList<>();

        listOfOtherElements.add(book);
        listOfOtherElements.add(string);
        listOfOtherElements.add(integer);
        listOfOtherElements.add(yesNo);

        assertThat(listOfOtherElements).doesNotContain(decimal);

    }



}
