package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (monoHorizontal(board, i) || monoVertical(board, i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean monoHorizontal(int[][] board, int i) {
        for (int index = 0; index < board[i].length; index++) {
            if (board[i][index] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(int[][] board, int i) {

        for (int index = 0; index < board[i].length; index++) {
            if (board[index][i]  != 1) {
                return false;
            }
        }
        return true;
    }
}
