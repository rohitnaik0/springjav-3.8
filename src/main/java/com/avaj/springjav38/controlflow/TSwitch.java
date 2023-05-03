package com.avaj.springjav38.controlflow;

public class TSwitch {
    public static void main(String[] args) {
        char char1='Z';

        switch(char1){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Not found");
        }

        String natoMethodResult = Natophonetics('Z');
        System.out.println(natoMethodResult);

    }

    public static String Natophonetics(char char1){
        return switch (char1) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> {
                String badresponse = "Invalid Value";
                yield badresponse;
            }
        };
    }

}
