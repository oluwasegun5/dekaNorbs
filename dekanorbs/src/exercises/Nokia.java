package exercises;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("press ok to go to Menu");
        String response = input.next();


            int menu = NokiaClass.menu();
        switch (menu) {
            case 1 -> NokiaClass.phoneBook();
            case 2 -> NokiaClass.messages();
            case 3 -> System.out.println("Chat");
            case 4 -> NokiaClass.callRegister();
            case 5 -> NokiaClass.tones();
            case 6 -> NokiaClass.setting();
            case 7 -> print("CALL DIVERT");
            case 8 -> print("GAMES");
            case 9 -> print("CALCULATOR");
            case 10 -> print("REMINDER");
            case 11 -> NokiaClass.clock();
            case 12 -> print("PROFILES");
            case 13 -> print("SIM SERVICES");
        }

        //phone.phoneBook(phone.menu());
    }
    public static void print(String text){
        System.out.println(text);
    }
}
