package com.avaj.springjav38.intro;

public class PrimitiveChallenge {
    public static void main(String[] args) {
        byte byteVal = 10;
        short shortVal = 20;
        int intVal = 50;
        long longVal = 50000 +  (10L *(byteVal + shortVal + intVal));
        short shortTotal = (short)(1000 +  (10 *(byteVal + shortVal + intVal)));
        System.out.println(longVal);
        System.out.println(shortTotal);
    }
}
