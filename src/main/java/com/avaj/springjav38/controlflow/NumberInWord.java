package com.avaj.springjav38.controlflow;

//Write a method called printNumberInWord.
//        The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers.
//        You can use if-else statement or switch statement whatever is easier for you.

public class NumberInWord {
    public static void main(String[] args) {
        System.out.println(prinitNumberInWord(99));
    }

    public static String prinitNumberInWord(int number){
        return switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> {
                String badResponse = "Invalid Data";
                yield badResponse;
            }
        };
    }

}
