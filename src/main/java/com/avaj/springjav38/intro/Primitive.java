package com.avaj.springjav38.intro;

public class Primitive {
    public static void main(String[] args) {

        int primeValue = 10000;
        int minIntegerVaue = Integer.MIN_VALUE;
        int maxIntegerValue = Integer.MAX_VALUE;

        System.out.println("Integer min value is : " + minIntegerVaue + " & Integer max value is : "+maxIntegerValue);
        System.out.println("min value is : " + Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.toString(10,16));
        //System.out.println(Long.toString(34526,16));
        //System.out.println(Short.toString());
        System.out.println(primeValue + " toString check with Integer at the beginning");
    }
}
