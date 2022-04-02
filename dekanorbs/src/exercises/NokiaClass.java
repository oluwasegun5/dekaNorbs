package exercises;

import java.util.Scanner;

public class NokiaClass {

    static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        return inputNumber("""
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
                     13 => SIM services
                    """);
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
        int result = inputNumber("""
                1 => Missed calls
                2 => Received calls
                3 => Dialled numbers
                4 => Erase recent call lists
                5 => Show call duration
                6 => Show call costs
                7 => Call cost Setting
                8 => Prepaid credit
                """);
        switch (result) {
            case 1 -> print("MISSED CALLS");
            case 2 -> print("RECEIVED CALLS");
            case 3 -> print("DIALLED NUMBERS");
            case 4 -> print("ERASE RECENT CALL LISTS");
            case 5 -> showCallDuration();
            case 6 -> showCallCosts();
            case 7 -> callCostSetting();
            case 8 -> print("PREPAID CREDIT");
        }
    }

    private static void showCallDuration(){
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
    private static void showCallCosts(){
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
    private static void callCostSetting(){
        int result = inputNumber("""
                1 => Call cost limit
                2 => Show costs in
                """);
        switch (result) {
            case 1 -> print("CALL COST LIMIT");
            case 2 -> print("SHOW COST IN");
        }
    }

    public static void tones(){
        int response = inputNumber("""
                1 => Ringing Tone
                2 => Ringing volume
                3 => Incoming call alert
                4 => Composer
                5 =. Message alert tone
                6 => Keypad tone
                7 => Warning and game tone
                8 => Vibrating alert
                9 => Screen saver
                """);
        switch (response) {
            case 1 -> print("RINGING TONE");
            case 2 -> print("RINGING VOLUME");
            case 3 -> print("INCOMING CALL ALERT");
            case 4 -> print("COMPOSER");
            case 5 -> print("MESSAGE ALERT TONE");
            case 6 -> print("KEYBOARD TONE");
            case 7 -> print("WARNING AND GAME TONE");
            case 8 -> print("VIBRATING ALERT");
            case 9 -> print("SCREEN SAVER");
        }
    }

    public static void setting() {
        int response = inputNumber("""
                1 => Call setting
                2 => Phone setting
                3 => Security setting
                4 => Restore factory setting
                """);
        switch (response) {
            case 1 -> callSetting();
            case 2 -> phoneSetting();
            case 3 -> securitySetting();
            case 4 -> print("RESTORE FACTORY SETTING");
        }
    }

    private static void securitySetting() {
        int response = inputNumber("""
                1 => PIN code request
                2 => Call barring service
                3 => Fixed dialling
                4 => Closed user group
                5 => Phone security
                6 => Change access codes
                """);
        switch (response) {
            case 1 -> print("PIN CODE REQUEST");
            case 2 -> print("CALL BARRING SERVICE");
            case 3 -> print("FIXED DIALLING");
            case 4 -> print("CLOSED USER GROUP");
            case 5 -> print("PHONE SECURITY");
            case 6 -> print("CHANGE ACCESS CODES");
        }
    }

    private static void phoneSetting() {
        int response = inputNumber("""
                1 => Language
                2 => Cell info display
                3 => Welcome note
                4 => Network selection
                5 => Light
                6 => Confirm SIM service action
                """);
        switch (response) {
            case 1 -> print("LANGUAGE");
            case 2 -> print("CELL INFO DISPLAY");
            case 3 -> print("WELCOME NOTE");
            case 4 -> print("NETWORK SELECTION");
            case 5 -> print("LIGHT");
            case 6 -> print("CONFIRM SIM SERVICE");
        }
    }

    private static void callSetting() {
        int response = inputNumber("""
                1 => Automatic redial
                2 => Speed dialling
                3 => Call waiting options
                4 => Own number sending
                5 => Phone line in use
                6 => Automatic answer
                """);
        switch (response) {
            case 1 -> print("AUTOMATIC REDIAL");
            case 2 -> print("SPEED DIALLING");
            case 3 -> print("CALL WAITING OPTIONS");
            case 4 -> print("OWN NUMBER SENDING");
            case 5 -> print("PHONE LINE IN USE");
            case 6 -> print("AUTOMATIC ANSWER");
        }
    }


    private static int inputNumber(String text){
        print(text);
        return scanner.nextInt();

    }


    private static void print(String text){
        System.out.println(text);
    }


    public static void clock() {
        int response = inputNumber("""
                1 => Alarm clock
                2 => Clock setting
                3 => Date setting
                4 => Stopwatch
                5 => Countdown timer
                6 => Auto update of date and time
                """);
        switch (response) {
            case 1 -> print("ALARM CLOCK");
            case 2 -> print("CLOCK SETTING");
            case 3 -> print("DATE SETTING");
            case 4 -> print("STOPWATCH");
            case 5 -> print("COUNTDOWN TIMER");
            case 6 -> print("AUTO GENERATE OF DATE AND TIME");
        }
    }
}