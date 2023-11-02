package com.avaj.springjav38.intro;

public class Casting {
    public static void main(String[] args) {
        short shortVal = Short.MIN_VALUE;
        int intval = Integer.MAX_VALUE;

        short shortVal2 = (short)(shortVal/2);
        System.out.println(shortVal2);

        byte newByteVal = (128/2);
        System.out.println(newByteVal);

        int intValue = Integer.MIN_VALUE;
        int testIntVal = (intValue/2);

    }
}
