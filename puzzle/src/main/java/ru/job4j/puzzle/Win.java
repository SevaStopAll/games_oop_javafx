package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < 5; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                return true;
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int i) {
        boolean result = true;
        for (int index = 0; index < board[i].length; index++) {
            if (board[i][index] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int i) {
        boolean result = true;
        for (int index = 0; index < board[i].length; index++) {
            if (board[index][i]  != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
