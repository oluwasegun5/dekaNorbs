package exercises;

import java.util.Scanner;

public class NokiaClass {

    Scanner input = new Scanner(System.in);

    public int menu() {
        int output = 0;
        System.out.println("""
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
        output = input.nextInt();

        return output;
    }


    public void phoneBook(){

        System.out.println("""
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
        int phoneBook = input.nextInt();
        switch (phoneBook) {
            case 1 -> System.out.println("SEARCH");
            case 2 -> System.out.println("SERVICE NOs.");
            case 3 -> System.out.println("ADD NAME");
            case 4 -> System.out.println("ERASE");
            case 5 -> System.out.println("EDIT");
            case 6 -> System.out.println("ASSIGN TONE");
            case 7 -> System.out.println("SEND b' CARD");
            case 8 -> {
                System.out.println("""
                        1 => Type of view
                        2 => Memory status
                        """);
                int options = input.nextInt();
                switch (options) {
                    case 1 -> System.out.println("TYPES OF VIEW");
                    case 2 -> System.out.println("MEMORY STATUS");
                }
            }
            case 9 -> System.out.println("SPEED DIALS");
            case 10 -> System.out.println("VOICE TAGS");
        }
    }

    public void messages() {
        System.out.println("""
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
        int messages = input.nextInt();

        switch (messages) {
            case 1 -> System.out.println("WRITE MESSAGES");
            case 2 -> System.out.println("INBOX");
            case 3 -> System.out.println("OUTBOX");
            case 4 -> System.out.println("PICTURES MESSAGES");
            case 5 -> System.out.println("TEMPLATES");
            case 6 -> System.out.println("SMILEYS");
            case 7 -> {
                System.out.println("""
                        1 => Set
                        2 => Common
                        """);
                int messageSettings = input.nextInt();
                switch (messageSettings) {
                    case 1 -> {
                        System.out.println("""
                                1 => Message centre number
                                2 => Message sent as
                                3 => Message validity
                                """);
                        int set = input.nextInt();
                        switch (set) {
                            case 1 -> System.out.println("MESSAGE CENTRE NUMBER");
                            case 2 -> System.out.println("MESSAGE SENT AS");
                            case 3 -> System.out.println("MESSAGE VALIDITY");
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                1 => Delivery reports
                                2 => Reply via same centre
                                3 => Character support
                                """);
                        int common = input.nextInt();
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


}
