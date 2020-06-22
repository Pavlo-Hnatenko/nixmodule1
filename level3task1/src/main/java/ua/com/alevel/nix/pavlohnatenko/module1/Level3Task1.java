package ua.com.alevel.nix.pavlohnatenko.module1;

import java.util.Random;

public class Level3Task1 {

    public static void processedBoard(int[][] board) {

        int[][] boardSum = new int[board.length][board[0].length];
        int sum;

        //    Конструкция if else вычисляет сумму очок в соседних клетках: первые 4 - для угловых клетках прямоугольной матрицы
//     (у каждой три соседа), следующие 4 для клеток вдоль угловых линий (у каждой по 5 соседей); наконец,
//     else срабатывает для всей клеток внутри нашей матрицы (у каждой 8 соседей)
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
                boardSum[i][j] = sum;
            }
        }

//        в данном цикле, исходя из значения суммы для каждой клетки, мы присваиваем соответственно 0 либо 1 для
//        соответствующей клетки нашего массива массивов (доски)
        for (int i = 0; i < boardSum.length; i++) {
            for (int j = 0; j < boardSum[i].length; j++) {
                if (boardSum[i][j] < 2 || boardSum[i][j] > 3) {
                    board[i][j] = 0;
                } else if (boardSum[i][j] == 3) {
                    board[i][j] = 1;
                } else if (boardSum[i][j] == 2) {
                    if (board[i][j] == 0) {
                        board[i][j] = 0;
                    } else if (board[i][j] == 1) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }

//    метод для начального заполнения нашей доски случайными значениями 0 либо 1
        public static int[][] fillBoard ( int n, int m){
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
