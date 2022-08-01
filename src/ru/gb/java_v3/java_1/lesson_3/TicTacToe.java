package ru.gb.java_v3.java_1.lesson_3;


import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final char DOT_HUMAN = 'X'; // players symbol
    private static final char DOT_AI = 'O'; // AI symbol
    private static final char DOT_EMPTY = '·'; // empty cell symbol
    private static final Scanner SCANNER = new Scanner(System.in); // scanner for players turn
    private static final Random RANDOM = new Random(); // random for AI-turn
    private static int fieldSizeX; // number of columns
    private static int fieldSizeY; // number of strings
    private static char[][] field; // array of field cells
    private static final int winLine = 3; // line length

    // check draw
    // check Win

    // Game field initialization
    private static void initField() {
        fieldSizeY = 3;
        fieldSizeX = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[x][y] = DOT_EMPTY;
            }
        }
    }

    // print full field = playing field and numbering
    private static void printField() {
        System.out.print('#');
        for (int x = 0; x < fieldSizeX * 2 + 1; x++) {
            System.out.print((x % 2 == 0) ? " " : x / 2 + 1);
        }
        System.out.println();
        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print((y + 1) + "|");
            for (int x = 0; x < fieldSizeX; x++)
                System.out.print(field[y][x] + "|");
            System.out.println();
        }

        for (int x = 0; x < fieldSizeX * 2 + 2; x++) {
            System.out.print("-");
        }
        System.out.println();
    }

    /* for (int y = 0; y < fieldSizeY; y++) {
         for (int x = 0; x < fieldSizeX; x++) {
             System.out.printf("%c ", field[y][x]);
         }
         System.out.println();
     }*/
    // ход игрока
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты хода по X и по Y в пределах от 1-го до 3-х через пробел >>>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[x][y] = DOT_HUMAN;
    }

    // проверка пустоты ячейки
    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    // попал-ли ход в поле?
    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[x][y] = DOT_AI;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isEmptyCell(x, y)) return false;
            }
        }
        return true;
    }

    /*private static boolean checkLine(char c) {
        if (checkDiagLTtoRB() || checkDiagLBtoRT() || checkVertical() || chekHorizont) {
            return true;
        }
        return false;
    }

    private static boolean checkDiagLTtoRB() {
int x--;
int
        return false;
    }

    private static boolean checkWin(checkLine) {
        int x;
        int y;
        while (!checkLine(field[x][y])) {
            return false;
        }
        return true;
    }*/
    private static boolean checkWin(char c) {

        // hor
        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;

        // ver
        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

        // dia
        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
        return false;
    }

    public static void main(String[] args) {
        // start a game!
        initField();
        printField();
        String answer;
        do {
            while (true) {
                humanTurn();
                if (checkEndGame(DOT_HUMAN, "Human win!")) break;
                aiTurn();
                if (checkEndGame(DOT_AI, "Computer win!")) break;
            }
            System.out.println("Wanna play again? (y/n)");
            answer = SCANNER.next();
        } while (answer.equals("y"));
        SCANNER.close();
    }
//        aiTurn();
//        checkDraw();
//        checkWin();
    // end game and grats
    // ask if player wants to repeat

    private static boolean checkEndGame(char dot, String winMessage) {
        printField();
        if (checkWin(dot)) {
            System.out.println(winMessage);
            return true;
        }
        if (checkDraw()) {
            System.out.println("Draw!");
            return true;
        }
        return false;

    }
}
