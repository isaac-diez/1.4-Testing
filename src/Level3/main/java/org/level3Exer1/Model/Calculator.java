package org.level3Exer1.Model;

public class Calculator {

    public void calculator() {

    }

    public Double add(Double num1, Double num2) {

        return num1 + num2;

    }

    public Double subtract(Double num1, Double num2) {

        return num1 - num2;

    }

    public Double multiply(Double num1, Double num2) {

        return num1 * num2;

    }

    public Double divide(Double num1, Double num2) {

        if (num2 == 0) {
            throw new ArithmeticException("Can't divide by 0");
        }
        return num1 / num2;

    }

}
