package ua.com.alevel.nix.pavlohnatenko.module1.level1task1.level1task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Task2Test {

    @Test
    void isMoveAllowed() {
        assertTrue(Level1Task2.isMoveAllowed(1, 1, 2,3));
        assertFalse(Level1Task2.isMoveAllowed(100, 100, 2,3));
    }
}