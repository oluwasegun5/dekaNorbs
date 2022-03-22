package exercises;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Press ok to go to  the main menu");
        String mainResponse = input.next();

        if (mainResponse .equals("ok")) {
            System.out.println("""
                    Enter 1 => Phone book
                    Enter 2 => Messages
                    Enter 3 => Chat
                    Enter 4 => Call register
                    Enter 5 => Tones
                    Enter 6 => Settings
                    Enter 7 => Call divert
                    Enter 8 => Games
                    Enter 9 => Calculator
                    Enter 10 => Reminders
                    Enter 11 => Clock
                    Enter 12 => Profile
                    Enter 13 => SIM services
                    """);
            String response = input.next();
            
        }
    }
}
