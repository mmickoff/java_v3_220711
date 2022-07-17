package ru.gb.java_v3.java_1.lesson_3;


import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final char DOT_HUMAN = 'X';
    private static final char DOI_AI = 'O';
    private static final char DOI_EMPTY = '-';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;

    // ...
    // print field
    // humanTurn (ask, check and set X to field)
    // aiTurn (random and set O to field)
    // checkValidCell
    // check empty cell
    // ...
    // chek Win

    private static void initField() {
        fieldSizeY = 3;
        fieldSizeX = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[x][y] = DOI_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print('#');
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print((i % 2 == 0) ? " " : i / 2 + 1);
        }
        System.out.println();

        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < fieldSizeX; j++)
                System.out.print(field[i][j] + "|");
            System.out.println();
        }

       /* for (int i = 0; i < fieldSizeX * 2 + 2; i++) {
            System.out.print("-");
        }
        System.out.println();*/
    }

       /* for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.printf("%c ", field[y][x]);
            }
            System.out.println();
        }*/

    public static void main(String[] args) {
        // start a game!
        initField();
        printField();

        // end game and grats
        // ask if player wants to repeat

    }


}
