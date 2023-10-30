package com.avaj.springjav38.intellijBase;

public class LOChallenge {
    public static void main(String[] args) {
        int value = 50;
        if (value == 50) {
            System.out.println("Error");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("Erroe");
        }

        boolean isBike = false;
        if (isBike != true) {
            System.out.println("Car");
        }

        double value1 = 20;
        double value2 = 80;
        System.out.println(value1);
        System.out.println(value2);

        double result = value1 + value2 * 100;
        System.out.println(result);

        double remainder = result % 40;
        System.out.println(remainder);

        boolean isBool = remainder == 0 ? true : false;
        System.out.println(isBool);

        if (!isBool) {
            System.out.println("Remainder");
        }

    }
}
