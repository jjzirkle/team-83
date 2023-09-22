package com.levelup.forestsandmonsters;

public class GameSummary {
    int score = 0;
    int moveCount = 0;

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score=score;
    }

    public int getMoveCount() {
        return this.moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount=moveCount;
    }

    public void printSummary() {
        System.out.println("----------GAME SUMMARY----------");
        System.out.println("Congratulations!  You have found the key and escaped!");
        System.out.println("Total moves:"+moveCount);
    }
}