package org.Exercise3.Main;

import org.Exercise3.Model.Array;

public class Main {
    public static void main(String[] args) {

        Array numbers = new Array();

        try {
            numbers.getArrayElementByIndex(3);
            numbers.getArrayElementByIndex(4);
            numbers.getArrayElementByIndex(5);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Index Out of Bounds: " + e.getMessage());
        }



    }
}