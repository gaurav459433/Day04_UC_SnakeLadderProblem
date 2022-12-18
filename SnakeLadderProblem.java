package com.bridgelabz.day04.snakeladder;

import java.util.Random;

public class SnakeLadderProblem {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Welcome To Snake & Ladder Simulator");
        System.out.println();
        int singlePlayer = 0;
        System.out.println("Starting Position of Single Player is :" +singlePlayer);
        int die = random.nextInt(6)+1;
        System.out.println("Player Rolls The Die & Get a Number :" +die);
    }
}
