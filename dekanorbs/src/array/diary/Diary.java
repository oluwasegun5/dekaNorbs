package array.diary;

import java.util.ArrayList;
import java.util.Scanner;


public class Diary {
    private static Scanner scanner = new Scanner(System.in);
    private static String username;
    private static int pin;
    private static boolean loggedIn;
    private static final ArrayList<Entry> diary = new ArrayList<>();

    public Diary(String username, int pin) {
        Diary.username = username;
        Diary.pin = pin;
    }

    public static void login(int pin) {
        if (pin == Diary.pin) loggedIn = true;
        else{
            print("wrong pin");
            userLogin();
        }
    }


    public static void write(String title, String body) {
        Entry entry = new Entry();
        if(loggedIn){
            entry.writeTitle(title);
            entry.writeBody(body);
            diary.add(entry);
        }
    }

    public static String findByTitle(String myTitle) {
        for (int entry = 0; entry < diary.size(); entry++) {
            if (diary.get(entry).getTitle().equals(myTitle)){
                return diary.get(entry).getDate()+"\n"+ diary.get(entry).getTitle()+"\n\t" + diary.get(entry).getBody();
            }
        }
        return "No such title";
    }
    public String getUsername(){
        return username;
    }
    private static void print(String text){
        System.out.println(text);
    }

    private static int mainScreen(){
        print("""
                Welcome, what would you like to do?
                1 -> login
                2 -> write entry
                3 -> find entry
                4 -> delete entry
                5 -> exit
                """);
        return scanner.nextInt();
    }

    public static void user(){
        int response = mainScreen();
        switch(response){
            case 1:
                userLogin();
                break;
            case 2:
                userWrite();
                break;
            case 3:
                userFindEntry();
                break;
            case 4:
                deleteByTitle();
                break;
            case 5:
                break;
            default:
                user();
                break;

        }

    }


    private static void userWrite(){
        if(loggedIn()){
            write(inputString(inputString("title: ")), inputString("body: "));
            print("saved");
        }
        else print("You are not logged in");
        user();
    }

    private static void userFindEntry(){
        print(findByTitle(inputString(inputString("Title"))));
        user();
    }
    private static void userLogin(){
        if(!loggedIn()) login(inputNumber("\ninput pin"));
        else print("You are logged in");
        user();
    }

    private static boolean loggedIn() {
        return loggedIn;
    }

    public static String inputString(String text){
        print(text);
        return scanner.nextLine();
    }

    public static String deleteByTitle() {
        for (int entry = 0; entry < diary.size(); entry++) {
            if (diary.get(entry).getTitle().equals(inputString("title: "))){
                diary.remove(entry);
                return "deleted";
            }
        }
        return "No such title";
    }

    public static int inputNumber(String text){
        print(text);
        return scanner.nextInt();
    }
}
