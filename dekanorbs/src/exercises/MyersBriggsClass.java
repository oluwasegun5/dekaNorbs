package exercises;

import java.util.Scanner;

public class MyersBriggsClass {
     static Scanner input = new Scanner(System.in);



    public static String question1(){
        print("""
                 1.
                 A => Expend energy, enjoy groups
                 B => Conserve energy, enjoy one-on-one
                 """);
        String reply = input.nextLine();

        return reply.toUpperCase();

    }

    public static String question2() {
        print("""
                 2.
                 A => interpret literally
                 B => look for meaning and possibilities
                 """);
        String reply = input.nextLine();

        return reply.toUpperCase();
    }

    public static String question3() {
        print("""
                3.
                A => logical, thinking, questioning
                B => empathetic, feeling, accommodating
                """);
        String reply = input.nextLine();

        return reply.toUpperCase();
    }
    public static String question4() {
        print("""
                 4.
                 A => organized, orderly
                 B => flexible, adaptable
                 """);
        String reply = input.nextLine();

        return reply.toUpperCase();
    }
    public static String question5() {
        print("""
                5.
                A => more outgoing, think out loud
                B => more reserved, think to yourself
                """);
        String reply = input.nextLine();

        return reply.toUpperCase();
    }
    public static String question6() {
        print("""
                6.
                A => practical, realistic, experiential
                B => imaginative, innovative, theoretical
                """);
        String reply = input.nextLine();

        return reply.toUpperCase();
    }
    public static String question7() {
        print("""
                 7.
                 A => candid, straight forward, frank
                 B => tactful, kind, encouraging
                 """);
        String reply = input.nextLine();

        return reply.toUpperCase();
    }
    public static String question8() {
        print("""
                8.
                A => plan, schedule
                B => unplanned, spontaneous
                """);
        String reply = input.nextLine();

        return reply.toUpperCase();
    }
    public static String question9(){
        print("""
                9.
                A => seek many tasks, public activities, interaction with others
                B => seek private, solitary activities with quiet to concentrate
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question10(){
        print("""
                10.
                A => standard, usual, conventional
                B => different, novel, unique
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question11(){
        print("""
                11.
                A => firm, tend to criticize, hold the line
                B => gentle, tend to appreciate, conciliate
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question12(){
        print("""
                12.
                A => regulated, structured
                B => easygoing, "live" and "let live"
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question13(){
        print("""
                13.
                A => external, communicative, express yourself
                B => internal, reticent, keep to yourself
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question14(){
        print("""
                14.
                A => focus on here-and-now
                B => look to the future, global perspective, "big picture'
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question15(){
        print("""
                15.
                A => tough-minded, just
                B => tender-hearted, merciful
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question16(){
        print("""
                16.
                A => preparation, plan ahead
                B => go with the flow, adapt as you go
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question17(){
        print("""
                17.
                A => active, initiate
                B => reflective, deliberate
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question18(){
        print("""
                18.
                A => fact, things, "what is"
                B => ideas, dreams, "what could be", philosophical
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question19(){
        print("""
                19.
                A => matter of fact
                B => sensitive, people-oriented, compassionate
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question20(){
        print("""
                20.
                A => control, govern
                B => latitude, freedom
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }




    public static void print(String text){
        System.out.println(text);
    }

    public static void input(String text){
         input.nextLine();
    }
    public static void input(int number){
        input.nextInt();
    }
    public static void input(double number){
        input.nextDouble();
    }
}
