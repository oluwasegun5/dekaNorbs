package exercises;

import java.util.Scanner;

public class NokiaClass {

    static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        int output = inputNumber("""
                     1 => Phone book
                     2 => Messages
                     3 => Chat
                     4 => Call register
                     5 => Tones
                     6 => Settings
                     7 => Call divert
                     8 => Games
                     9 => Calculator
                     10 => Reminders
                     11 => Clock
                     12 => Profile
                     13 => SIM services\n
                    """);
        return output;
    }


    public static void phoneBook(){

        int phoneBook = inputNumber("""
                         1 => Search
                         2 => Service Nos
                         3 => Add name
                         4 => Erase
                         5 => Edit
                         6 => Assign tone
                         7 => Send b' card
                         8 => Option
                         9 => Speed dials
                         10 => Voice tags
                        """);
        switch (phoneBook) {
            case 1 -> System.out.println("SEARCH");
            case 2 -> System.out.println("SERVICE NOs.");
            case 3 -> System.out.println("ADD NAME");
            case 4 -> System.out.println("ERASE");
            case 5 -> System.out.println("EDIT");
            case 6 -> System.out.println("ASSIGN TONE");
            case 7 -> System.out.println("SEND b' CARD");
            case 8 -> {
                int options = inputNumber("""
                        1 => Type of view
                        2 => Memory status
                        """);

                switch (options) {
                    case 1 -> System.out.println("TYPES OF VIEW");
                    case 2 -> System.out.println("MEMORY STATUS");
                }
            }
            case 9 -> System.out.println("SPEED DIALS");
            case 10 -> System.out.println("VOICE TAGS");
        }
    }

    public static void messages() {
        int messages = inputNumber("""
                            1 => Write messages
                            2 => Inbox
                            3 => Outbox
                            4 => Picture messages
                            5 => Templates
                            6 => Smileys
                            7 => Messages settings
                            8 => Info service
                            9 => Voice mailbox number
                            10 => Service command editor
                            """);
        switch (messages) {
            case 1 -> System.out.println("WRITE MESSAGES");
            case 2 -> System.out.println("INBOX");
            case 3 -> System.out.println("OUTBOX");
            case 4 -> System.out.println("PICTURES MESSAGES");
            case 5 -> System.out.println("TEMPLATES");
            case 6 -> System.out.println("SMILEYS");
            case 7 -> {
                int messageSettings = inputNumber("""
                        1 => Set
                        2 => Common
                        """);

                switch (messageSettings) {
                    case 1 -> {
                        int set = inputNumber("""
                                1 => Message centre number
                                2 => Message sent as
                                3 => Message validity
                                """);

                        switch (set) {
                            case 1 -> System.out.println("MESSAGE CENTRE NUMBER");
                            case 2 -> System.out.println("MESSAGE SENT AS");
                            case 3 -> System.out.println("MESSAGE VALIDITY");
                        }
                    }
                    case 2 -> {
                        int common = inputNumber("""
                                1 => Delivery reports
                                2 => Reply via same centre
                                3 => Character support
                                """);

                        switch (common) {
                            case 1 -> System.out.println("DELIVERY REPORTS");
                            case 2 -> System.out.println("REPLY VIA SAME CENTRE");
                            case 3 -> System.out.println("CHARACTER SUPPORT");
                        }
                    }
                }
            }
            case 8 -> System.out.println("INFO SERVICE");
            case 9 -> System.out.println("VOICE MAILBOX NUMBER");
            case 10 -> System.out.println("SERVICE COMMAND EDITOR");
        }

    }

    public static void callRegister(){
        print("""
                1 => Missed calls
                2 => Received calls
                3 => Dialled numbers
                4 => Erase recent call lists
                5 => Show call duration
                6 => Show call costs
                7 => Call cost Setting
                8 => Prepaid credit
                """);
    }

    public static void showCallDuration(){
        int result = inputNumber("""
                1 => Last call duration
                2 => All call's duration
                3 => Received call's duration
                4 => Dialled call's duration
                5 => Clear timers
                """);
        switch (result) {
            case 1 -> print("LAST CALL DURATION");
            case 2 -> print("ALL CALL'S DURATION");
            case 3 -> print("RECEIVED CALL'S DURATION");
            case 4 -> print("DIALLED CALL'S DURATION");
            case 5 -> print("CLEAR TIMERS");
        }
    }
    public static void showCallCosts(){
        int result = inputNumber("""
                1 => Last call cost
                2 => All call cost
                3 => Clear customer
                """);
        switch (result) {
            case 1 -> print("LAST CALL COST");
            case 2 -> print("ALL CALL COST");
            case 3 -> print("CLEAR CUSTOMER");
        }
    }
    public static void callCostSetting(){
        int result = inputNumber("""
                1 => Call cost limit
                2 => Show costs in
                """);

    }







    public static String input(String text){
        print(text);
        return scanner.nextLine();

    }
    public static int inputNumber(String text){
        print(text);
        return scanner.nextInt();

    }


    public static void print(String text){
        System.out.println(text);
    }
}