package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        final int numberOfPlayers = 5;
        int[] chosenNumbers = new int[5];

        for (int x=0; x < numberOfPlayers; x++){

            count = count + 1;
            System.out.println("Enter number for player " + count + " >> ");
            chosenNumbers[x] = scanner.nextInt();

        }

        System.out.println();
        count = 0;

        System.out.println("Numbers in Asterisk");
        for (int chosenNumber : chosenNumbers) {
            count = count + 1;
            System.out.print("Player " + count + ": ");
            for (int k = 0; k < chosenNumber; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}