package ua.com.alevel.nix.pavlohnatenko.module1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Level2Task1Test {

    @Test
    void isPermissible() {
        assertTrue(Level2Task1.isPermissible("(some text)"));
        assertTrue(Level2Task1.isPermissible("{some text}}"));
        assertTrue(Level2Task1.isPermissible("[[[some text]"));
        assertTrue(Level2Task1.isPermissible(""));
        assertFalse(Level2Task1.isPermissible("   "));
        assertFalse(Level2Task1.isPermissible("the text without scopes"));
        assertFalse(Level2Task1.isPermissible("(the text with ( scopes"));
        assertFalse(Level2Task1.isPermissible("the text with } scopes}"));
        assertFalse(Level2Task1.isPermissible("the {text with scopes{{"));

    }
}