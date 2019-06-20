package com.dsimon;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Doug", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(5, 2));
        System.out.println(calcFeetAndInchesToCentimeters(6));
        System.out.println(calcFeetAndInchesToCentimeters(16));

        System.out.println(calcFeetAndInchesToCentimeters(100));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        inches = inches + (feet * 12);
        return inches * 2.54;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        return calcFeetAndInchesToCentimeters((int) inches/12, (int) inches % 12);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
