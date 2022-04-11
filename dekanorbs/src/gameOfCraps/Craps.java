package gameOfCraps;

import java.security.SecureRandom;

public class Craps {
/*
integer[0] is the first dice
integer[1] is the second dice
integer[2] is round counter
integer[3] for next round value
*/
    static String[] strings = {"win","lose","next round","throw dice"};
    static int[] integer = new int[10];

    static SecureRandom random = new SecureRandom();

    public static int throwDice(){
        integer[0] = random.nextInt(1,7);
        integer[1] = random.nextInt(1,7);
        integer[2]++;
        return integer[0]+integer[1];
    }

    public static void firstRoundResult() {
        if(integer[2] <1){
            if(integer[1]+integer[0] == 7 || integer[1]+integer[0] == 11){
                strings[2] = strings[0];
            }
            else if(integer[1]+integer[0] == 2||integer[1]+integer[0] == 3||integer[1]+integer[0] == 12){
                strings[2] = strings[1];
            }
            else{
                integer[3] = integer[1]+integer[0];
            }
        }
    }
    public static void secondRoundResult() {
        if(integer[2] >1){
            if(integer[1] + integer[0] == 7){
                strings[2] = strings[1];
            }
            else if (integer[1] + integer[0] == integer[3]){
                strings[2] = strings[0];
            }
        }

    }

}
