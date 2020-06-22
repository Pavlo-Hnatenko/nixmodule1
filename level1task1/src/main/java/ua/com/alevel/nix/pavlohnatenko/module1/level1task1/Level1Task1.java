package ua.com.alevel.nix.pavlohnatenko.module1.level1task1;

import java.util.*;

public class Level1Task1 {

    public static int countInts(int... array) {

        List<Integer> integerList = new ArrayList<>();
        for (int i :
                array) {
            integerList.add(i);
        }

        int[] intArray = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            intArray[i] = integerList.get(i);
        }

        Set<Integer> integerSet = new HashSet<>();
        for (int value : intArray) {
            integerSet.add(value);
        }

        return integerSet.size();

    }
}