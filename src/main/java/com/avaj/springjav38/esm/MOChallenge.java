package com.avaj.springjav38.esm;

public class MOChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5,8));

    }

    public static double convertToCentimeters(int inches){
        double centimeters = inches*2.54;
        return centimeters;
    }

    public static double convertToCentimeters(int feet,int inches){
        double inchesConversion= 12*feet;
        double totalCentimeter = convertToCentimeters((int)inchesConversion) + convertToCentimeters(inches);
        return totalCentimeter;
    }

}
