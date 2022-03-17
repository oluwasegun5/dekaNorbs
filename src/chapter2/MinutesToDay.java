package chapter2;

import java.util.Scanner;

public class MinutesToDay{
public static void main(String[] agrs){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter minutes in number: ");
    int minute = input.nextInt();

    int days = minute/1440;

    if(days >= 365){

        int year = days/365;
        int day = days % 365;

        System.out.printf("%d minutes is approximately %d years and %d days %n",minute,year,day);
        }


    }
}
