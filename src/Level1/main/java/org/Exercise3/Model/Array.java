package org.Exercise3.Model;

public class Array {

    private int[] numbers;

    public Array() {

        this.numbers = new int[]{1, 2, 3, 4, 5};

    }

    public void getArrayElementByIndex(int index) {

        System.out.println(this.numbers[index]);

    }

}
