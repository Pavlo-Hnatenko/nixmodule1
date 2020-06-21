package ua.com.alevel.nix.pavlohnatenko.module1;

import java.util.Arrays;
import java.util.Random;

public class Level3Task1 {

    public static void main(String[] args) {
        int[][] array = fillBoard(6, 7);

    }

//    Следующий метод вычисляет сумму очок в соседних клетках: сначала в 4 угловых клетках прямоугольной матрицы (у каждой
//    три соседа), затем для клеток вдоль угловых линий (у каждой по 5 соседей); наконец, else срабатывает для всей
//    случаев внутри нашей матрицы (доски)
    public static int[][] getProcessedBoard(int[][] board) {

        int sum;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i == board.length - 1 && j == board[i].length - 1)) {
                    sum = board[i - 2][j - 1] + board[i - 2][j - 2] + board[i - 1][j - 2];
                } else if ((i == board.length - 1 && j == 0)) {
                    sum = board[i - 1][j + 1] + board[i - 2][j + 1] + board[i - 2][j + 1];
                } else if (i == 0 && j == board[i].length - 1) {
                    sum = board[i][j - 2] + board[i + 1][j - 1] + board[i + 1][j - 2];
                } else if ((i == 0 && j == 0)) {
                    sum = board[i][j + 1] + board[i + 1][j + 1] + board[i + 1][j];
                } else if (i == 0) {
                    sum = board[i][j - 1] + board[i][j + 1] + board[i + 1][j + 1] +
                            board[i + 1][j] + board[i + 1][j - 1];
                } else if (i == board.length - 1) {
                    sum = board[i][j - 1] + board[i][j + 1] + board[i - 1][j + 1] +
                            board[i - 1][j] + board[i - 1][j - 1];
                } else if (j == 0) {
                    sum = board[i - 1][j] + board[i + 1][j] + board[i - 1][j + 1] +
                            board[i][j + 1] + board[i + 1][j + 1];
                } else if (j == board[i].length - 1) {
                    sum = board[i - 1][j] + board[i + 1][j] + board[i - 1][j - 1] +
                            board[i][j - 1] + board[i + 1][j - 1];
                } else {
                    sum = board[i][j + 1] + board[i + 1][j + 1] + board[i + 1][j] +
                            board[i + 1][j - 1] + board[i][j - 1] + board[i - 1][j - 1] +
                            board[i - 1][j] + board[i - 1][j + 1];
                }
            }
        }

        return null;
    }



    private static int[][] fillBoard(int n, int m) {
        int[][] board = new int[n][m];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = random.nextInt(2);
            }
        }
        return board;
    }
}
