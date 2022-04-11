package gameOfCraps;

import static gameOfCraps.Craps.*;

public class GameOfCraps {
    public static void main(String[] args) {
        while(strings[2] == "next round") {
            System.out.println(throwDice());
            firstRoundResult();
            System.out.println(throwDice());
            secondRoundResult();

        }
    }
}
