package org.Exercise2.Model;

import org.Level1.Exercise2.Model.CalculateDNI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDNITest {

    private CalculateDNI testCalculator;

    @BeforeEach
    public void setup() {

        testCalculator = new CalculateDNI();

    }

    @Test
    public void testDNILetterCalculator() {

        String idLetter;

        System.out.println("ID number :" + 84974791);
        String idNumber = testCalculator.calculateLetter(84974791);
        idLetter = String.valueOf(idNumber.charAt(8));
        System.out.println("Letter: " + idLetter);

        assertEquals("A", idLetter);

        System.out.println("ID number :" + 15972124);
        idNumber = testCalculator.calculateLetter(15972124);
        idLetter = String.valueOf(idNumber.charAt(8));
        System.out.println("Letter: " + idLetter);

        assertEquals("G", idLetter);

        System.out.println("ID number :" + 9799379);
        idNumber = testCalculator.calculateLetter(9799379);
        idLetter = String.valueOf(idNumber.charAt(7));
        System.out.println("Letter: " + idLetter);

        assertEquals("E", idLetter);

        System.out.println("ID number :" + 5097219);
        idNumber = testCalculator.calculateLetter(5097219);
        idLetter = String.valueOf(idNumber.charAt(7));
        System.out.println("Letter: " + idLetter);

        assertEquals("M", idLetter);


        System.out.println("ID number :" + 49244717);
        idNumber = testCalculator.calculateLetter(49244717);
        idLetter = String.valueOf(idNumber.charAt(8));
        System.out.println("Letter: " + idLetter);

        assertEquals("S", idLetter);


        System.out.println("ID number :" + 93993488);
        idNumber = testCalculator.calculateLetter(93993488);
        idLetter = String.valueOf(idNumber.charAt(8));
        System.out.println("Letter: " + idLetter);

        assertEquals("D", idLetter);


        System.out.println("ID number :" + 30095799);
        idNumber = testCalculator.calculateLetter(30095799);
        idLetter = String.valueOf(idNumber.charAt(8));
        System.out.println("Letter: " + idLetter);

        assertEquals("T", idLetter);


        System.out.println("ID number :" + 89286935);
        idNumber = testCalculator.calculateLetter(89286935);
        idLetter = String.valueOf(idNumber.charAt(8));
        System.out.println("Letter: " + idLetter);

        assertEquals("S", idLetter);


        System.out.println("ID number :" + 88201312);
        idNumber = testCalculator.calculateLetter(88201312);
        idLetter = String.valueOf(idNumber.charAt(8));
        System.out.println("Letter: " + idLetter);

        assertEquals("S", idLetter);


        System.out.println("ID number :" + 79577630);
        idNumber = testCalculator.calculateLetter(79577630);
        idLetter = String.valueOf(idNumber.charAt(8));
        System.out.println("Letter: " + idLetter);

        assertEquals("E", idLetter);




    }

}