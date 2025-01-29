package org.level3Exer1.Main;

import org.level3Exer1.Model.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator hp = new Calculator();

        System.out.println(hp.add(2.2,3.3));

        System.out.println(hp.subtract(10.2,6.7));

        System.out.println(hp.multiply(4.3,8.6));

        System.out.println(hp.divide(20.11,10.3));

    }
}