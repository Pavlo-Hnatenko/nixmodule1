package ua.com.alevel.nix.pavlohnatenko.module1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level3Task1Test {

    @Test
    void processedBoard() {

        int[][] array = Level3Task1.fillBoard(5, 6);

//        тестирование угловой точки
        array[0][1] = 1;
        array[1][0] = 1;
        array[1][1] = 1;
        Level3Task1.processedBoard(array);
        assertEquals(1, array[0][0]);

        array[0][1] = 0;
        array[1][0] = 0;
        array[1][1] = 1;
        Level3Task1.processedBoard(array);
        assertEquals(0, array[0][0]);

        array[0][1] = 1;
        array[1][0] = 1;
        array[1][1] = 0;

        array[0][0] = 1;
        Level3Task1.processedBoard(array);
        assertEquals(1, array[0][0]);

        array[0][1] = 1;
        array[1][0] = 1;
        array[1][1] = 0;

        array[0][0] = 0;
        Level3Task1.processedBoard(array);
        assertEquals(0, array[0][0]);

//        тестирование точки, находящейся на угловой линии
        array[3][1] = 1;
        array[4][1] = 1;
        array[4][0] = 1;
        array[2][0] = 1;
        array[2][1] = 0;
        Level3Task1.processedBoard(array);
        assertEquals(0, array[3][0]);

        array[3][1] = 1;
        array[4][1] = 1;
        array[4][0] = 1;
        array[2][0] = 0;
        array[2][1] = 0;
        Level3Task1.processedBoard(array);
        assertEquals(1, array[3][0]);

        array[3][1] = 1;
        array[4][1] = 0;
        array[4][0] = 0;
        array[2][0] = 0;
        array[2][1] = 0;
        Level3Task1.processedBoard(array);
        assertEquals(0, array[3][0]);

        array[3][1] = 0;
        array[4][1] = 0;
        array[4][0] = 0;
        array[2][0] = 0;
        array[2][1] = 0;
        Level3Task1.processedBoard(array);
        assertEquals(0, array[3][0]);

        array[3][1] = 1;
        array[4][1] = 1;
        array[4][0] = 0;
        array[2][0] = 0;
        array[2][1] = 0;

        array[3][0] = 0;
        Level3Task1.processedBoard(array);
        assertEquals(0, array[3][0]);

        array[3][1] = 1;
        array[4][1] = 1;
        array[4][0] = 0;
        array[2][0] = 0;
        array[2][1] = 0;

        array[3][0] = 1;
        Level3Task1.processedBoard(array);
        assertEquals(1, array[3][0]);

//        тестирование точки внутри доски
        array[2][3] = 1;
        array[3][3] = 1;
        array[3][2] = 1;
        array[3][1] = 1;
        array[2][1] = 0;
        array[1][1] = 0;
        array[1][2] = 0;
        array[1][3] = 0;
        Level3Task1.processedBoard(array);
        assertEquals(0, array[2][2]);

        array[2][3] = 1;
        array[3][3] = 1;
        array[3][2] = 1;
        array[3][1] = 0;
        array[2][1] = 0;
        array[1][1] = 0;
        array[1][2] = 0;
        array[1][3] = 0;
        Level3Task1.processedBoard(array);
        assertEquals(1, array[2][2]);

        array[2][3] = 1;
        array[3][3] = 0;
        array[3][2] = 0;
        array[3][1] = 0;
        array[2][1] = 0;
        array[1][1] = 0;
        array[1][2] = 0;
        array[1][3] = 0;
        Level3Task1.processedBoard(array);
        assertEquals(0, array[2][2]);

        array[2][3] = 0;
        array[3][3] = 0;
        array[3][2] = 0;
        array[3][1] = 0;
        array[2][1] = 0;
        array[1][1] = 0;
        array[1][2] = 0;
        array[1][3] = 0;
        Level3Task1.processedBoard(array);
        assertEquals(0, array[2][2]);

        array[2][3] = 1;
        array[3][3] = 1;
        array[3][2] = 0;
        array[3][1] = 0;
        array[2][1] = 0;
        array[1][1] = 0;
        array[1][2] = 0;
        array[1][3] = 0;

        array[2][2] = 0;
        Level3Task1.processedBoard(array);
        assertEquals(0, array[2][2]);

        array[2][3] = 1;
        array[3][3] = 1;
        array[3][2] = 0;
        array[3][1] = 0;
        array[2][1] = 0;
        array[1][1] = 0;
        array[1][2] = 0;
        array[1][3] = 0;

        array[2][2] = 1;
        Level3Task1.processedBoard(array);
        assertEquals(1, array[2][2]);

    }
}