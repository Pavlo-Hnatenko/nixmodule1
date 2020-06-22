package ua.com.alevel.nix.pavlohnatenko.module1;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Task2Test {

    @Test
    void maxDepth() {

        Level2Task2 binaryTree = new Level2Task2();
        binaryTree.add(15);
        binaryTree.add(10);
        binaryTree.add(18);
        binaryTree.add(12);
        binaryTree.add(100000);
        binaryTree.add(33);
        binaryTree.add(21);
        binaryTree.add(1);

        assertEquals(5, Level2Task2.maxDepth(binaryTree.root));

        Level2Task2 binaryTree1 = new Level2Task2();
        binaryTree1.add(1);

        assertEquals(1, Level2Task2.maxDepth(binaryTree1.root));

        Level2Task2 binaryTree2 = new Level2Task2();
        binaryTree2.add(10);
        binaryTree2.add(5);
        binaryTree2.add(3);
        binaryTree2.add(12);
        binaryTree2.add(15);

        assertEquals(3, Level2Task2.maxDepth(binaryTree2.root));
        
    }
}