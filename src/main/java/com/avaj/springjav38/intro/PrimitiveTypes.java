package com.avaj.springjav38.intro;

import java.util.Scanner;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte byteVal;
        char charVal;
        short shortVal;
        int intVal ;
        Long longVal = 25L;
        float floatVal;
        double douvleVal;
        String stringVal = "qwertyuiop";

        System.out.println(Byte.BYTES);
        System.out.println(Character.BYTES);
        System.out.println(Short.BYTES);
        System.out.println(Integer.BYTES);
        System.out.println(Float.BYTES);
        System.out.println(Double.BYTES);
        System.out.println(Long.BYTES);
        System.out.println(Byte.toString(Byte.MIN_VALUE) +" to " +Byte.toString(Byte.MAX_VALUE));

        Scanner sc = new Scanner(System.in);
        intVal = sc.nextInt();
        sc.close();

        if (longVal instanceof Long){
            System.out.println(stringVal.getClass().getSimpleName());
//            System.out.println((Object)intVal).getClass();
        }

        System.out.println(stringVal instanceof String);

    }
}
