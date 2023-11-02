package com.avaj.springjav38.esm;

public class MethodChallenge {
    public static void main(String[] args) {

        int result = calculateHighSchoolPosition(42);
        displayHighScorePostion("terabyte", result);

    }

    public static void displayHighScorePostion(String name, int listPos) {
        System.out.println(name + " managed to get into position " + listPos + " on the high score list");
    }

    public static int calculateHighSchoolPosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
