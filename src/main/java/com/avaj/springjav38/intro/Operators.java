package com.avaj.springjav38.intro;

public class Operators {
    public static void main(String[] args) {
        int result1 = 20 +50;
        System.out.println(result1);

        char firstchar = 'A';
        char secondChar = 'B';
        System.out.println(firstchar + secondChar);
        System.out.println(" " + firstchar + secondChar);
        System.out.println(firstchar + secondChar + " ");
        System.out.println(firstchar + " " + secondChar );

        float floatvalue = 50/17f;
        float remainderVal = 50%17f;
        System.out.println(floatvalue);
        System.out.println(remainderVal);

        int result = 20;
        result++;
        result+=19;
        System.out.println(result);

        int tluser = 10;
//        tluser-=5;
        tluser = (int)(tluser -5.5);
        System.out.println(tluser);
    }
}
