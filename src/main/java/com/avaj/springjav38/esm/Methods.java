package com.avaj.springjav38.esm;

public class Methods {
    public static void main(String[] args) {
        int highscore = calculateScore(true,800,5,100);
        System.out.println(highscore);
        System.out.println("high score is "+ calculateScore(true,1000,8,200));
    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
//        boolean gameOver = true;
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;

        int finalScore = score;
        if(gameOver == true){
            finalScore += (levelCompleted*bonus);
//            System.out.println("Your final score was "+finalScore);
        }
        return finalScore;
    }
}
