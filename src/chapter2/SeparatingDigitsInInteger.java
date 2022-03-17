package chapter2;

import java.util.Scanner;

public class SeparatingDigitsInInteger {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number containing five digits: ");
        int digits = input.nextInt();

        int firstNumber = digits /10000;
        int secondNumber = (digits % 10000)/1000;
        int thirdNumber = (digits % 1000)/100;
        int fourthNumber = (digits % 100)/10;
        int fifthNumber = digits % 10;


        System.out.printf("%d  %d  %d  %d  %d",firstNumber,secondNumber,thirdNumber,fourthNumber,fifthNumber);
    }
}
