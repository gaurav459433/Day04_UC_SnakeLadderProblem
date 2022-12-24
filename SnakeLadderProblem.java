package com.bridgelabz.day04.snakeladder;

import java.util.Random;

public class SnakeLadderProblem {

    static int SnakeLadderP1P2(int playerPosition, int count) {
        Random random = new Random();
        while (playerPosition != 100) {
            count++;
            int die = random.nextInt(6) + 1;
            int a = random.nextInt(3);
            System.out.println();
            System.out.println("Player Rolls The Die & Get a Number :" + die);
            if (a == 1) {
                playerPosition += die;
                System.out.println("Gets a Ladder & Player Moves ahead By Number Of Position :" + playerPosition);
                if (playerPosition == 100)
                    break;

                if (playerPosition > 100) {
                    playerPosition -= die;
                    System.out.println();
                    System.out.println("The Number Goes Beyond 100");
                    System.out.println("Therefore Player Current Position: " + playerPosition);
                    System.out.println("The Number Required By Player is: " + (100 - playerPosition));
                }
                {
                    die = random.nextInt(6)+1;
                    playerPosition += die;
                    System.out.println("Gets Ladder So Playing Again and Moves Ahead by Number of position: "+die);
                    System.out.println("Player current position: "+playerPosition);
                }
            } else if (a == 2) {
                playerPosition -= die;
                System.out.println("Bites By Snake & Player Moves Behind By Number Of Position :" + playerPosition);

                if (playerPosition < 0) {
                    playerPosition = 0;
                    System.out.println("Player Current Position :" + playerPosition);
                }
            } else {
                System.out.println("No Play - Player Stay At Same Position");
                System.out.println("Player Current Position :" + playerPosition);
        }
        if (playerPosition > 100) {
            playerPosition -= die;
            System.out.println();
            System.out.println("The Number Goes Beyond 100");
            System.out.println("Therefore Player Current Position: " + playerPosition);
            System.out.println("The Number Required By Player is: " + (100 - playerPosition));
        }
            System.out.println();
            System.out.println("Number of times player played: " + count);
            System.out.println();
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Snake & Ladder Simulator");
        System.out.println();
        System.out.println("Starting Position of Single Player is : 0");
        System.out.println();

        int player1 = SnakeLadderP1P2(0, 0); {
            System.out.println("Number of Times player1 played: " +player1);
        }

        int player2 = SnakeLadderP1P2(0, 0); {
            System.out.println("Number of Times player2 Played: "+player2);
        }
        if (player1 > player2) {
            System.out.println("Player2 Won  The Game");
        }
        else {
            System.out.println("Player1 Won The Game");
        }


    }
}