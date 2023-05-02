package com.avaj.springjav38.intellijBase;

public class LogicalOperator {
    public static void main(String[] args) {
        int highscore = 100;
        if (highscore != 100){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        int lowscore = 50;
        if (highscore > lowscore && highscore<= 100){
            System.out.println("Neutral");
        }

        if((highscore > 90) || (lowscore <= 60)){
            System.out.println("Neutral");
        }
    }
}
