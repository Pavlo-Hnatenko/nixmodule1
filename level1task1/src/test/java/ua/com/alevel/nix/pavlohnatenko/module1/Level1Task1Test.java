package ua.com.alevel.nix.pavlohnatenko.module1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Task1Test {

    @Test
    void countInts() {
        assertEquals(4, Level1Task1.countInts(1, 2, 3, 3, 3, 4, 4, 4));
    }
}