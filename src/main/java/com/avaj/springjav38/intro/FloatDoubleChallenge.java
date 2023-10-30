package com.avaj.springjav38.intro;

public class FloatDoubleChallenge {
    public static void main(String[] args) {
        int intVal = 5/2;
        float floatVal = 5f/2f;
        double doubleVal = 5/2d;

        System.out.println(intVal);
        System.out.println(floatVal);
        System.out.println(doubleVal);

        intVal = 5/3;
        floatVal = 5/3f;
        doubleVal = 5d/3;

        System.out.println(intVal);
        System.out.println(floatVal);
        System.out.println(doubleVal);

        double pounds = 200;
        double kilograms = .45359237;
        double conversion;

        conversion = pounds*kilograms;
        System.out.println(conversion);

    }
}
