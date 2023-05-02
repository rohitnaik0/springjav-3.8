package com.avaj.springjav38.esm;

public class SecondsMinutes {
    public static void main(String[] args) {
        System.out.println(takeTime(3945));;
        System.out.println(takeTime(65,45));;

    }

    public static String takeTime(int seconds){
        if(seconds >= 0){
            int result = seconds/3600;
            return " "+result;
        }
        return "Invalid data";
    }

    public static String takeTime(int minutes, int seconds){
        if(seconds >= 0 ){
            int result = minutes*60  + seconds;
            return ""+takeTime(result);
        }
        return "Invalid data";

    }



}
