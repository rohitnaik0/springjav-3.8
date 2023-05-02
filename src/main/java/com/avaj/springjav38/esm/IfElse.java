package com.avaj.springjav38.esm;

public class IfElse {
    public static void main(String[] args) {
        boolean gameOver = true;
//        int score = 800;
        int score = 10000;
//        int levelCompleted = 5;
        int levelCompleted = 8;
//        int bonus = 100;
        int bonus = 200;

//        if(score <= 5000){
//            System.out.println("score was less than or equal to 5000");
//        }else{
//            System.out.println("more");
//        }

//        int finalScore = score;
//        if(gameOver == true){
//            finalScore += (levelCompleted*bonus);
//            System.out.println("Your final score was "+finalScore);
//        }

//        int finalScore = score;
//        if (gameOver == true) {
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        beshterr();

        Methods obj1 = new Methods();
        obj1.calculateScore(true,1,2,3);


//        Methods obj = new Methods();
//        obj.calculateScore();
    }
    public static void beshterr(){
        Methods obj = new Methods();
        obj.calculateScore(true,1,2,3);

    }
//    Methods obj = new Methods();
//    obj.calculateScore();

}
