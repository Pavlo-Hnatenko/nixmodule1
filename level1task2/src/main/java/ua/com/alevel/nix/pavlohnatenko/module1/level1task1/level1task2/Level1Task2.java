package ua.com.alevel.nix.pavlohnatenko.module1.level1task1.level1task2;

public class Level1Task2 {

    public static boolean isMoveAllowed(int startX, int startY, int afterX, int afterY){
        if(Math.abs(startX - afterX) == 1 || Math.abs(startY - afterY) == 2){
            return true;
        } else return Math.abs(startX - afterX) == 2 || Math.abs(startY - afterY) == 1;
    }
}
