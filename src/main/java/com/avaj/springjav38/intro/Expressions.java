package com.avaj.springjav38.intro;

public class Expressions {
    public static void main(String[] args) {
        int myFirst = (10+5) + (2*10);
        int mysecond = 12;
        int myThird = 6;

        System.out.println(myFirst);

        int total = myFirst+mysecond+myThird;
        System.out.println(total);

        myThird = myFirst*2;
        total = myFirst+mysecond+myThird;
        System.out.println(total);

        int last1 = 1000 - total;
        System.out.println(last1);

    }
}
