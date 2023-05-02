package com.avaj.springjav38.esm;

public class MethodOverloading {

    public static void main(String[] args) {
        calculateScore("Tim",500);
        int newScore = calculateScore("Tim",500);
        System.out.println(newScore);
        calculateScore(75);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " scored "+score+ " points");
        return score*1000;
    }

    public static void calculateScore( int score){
        System.out.println("Player  scored "+score+ " points");
//        return score*1000;
    }

//    public static void calculateScore(String playerName, int score){
//        System.out.println("Player "+ playerName + " scored "+score+ " points");
//        return score*1000;
//    }




}
