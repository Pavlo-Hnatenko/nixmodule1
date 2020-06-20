package ua.com.alevel.nix.pavlohnatenko.module1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Task3Test {

    @Test
    void countTriangleArea() {
        assertEquals(7, Level1Task3.countTriangleArea(1, 1, 2, 5, 5, 3));
    }
}