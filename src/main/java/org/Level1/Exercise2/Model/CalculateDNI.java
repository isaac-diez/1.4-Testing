package org.Level1.Exercise2.Model;

public class CalculateDNI {

    public String calculateLetter(int idNumber) {

        String fullIdNumber;

        int remainder = idNumber % 23;
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";

        String letter = String.valueOf(letters.charAt(remainder));

        fullIdNumber = idNumber + letter;

        return fullIdNumber;

    }
}