package chapter4;

import java.util.Scanner;

public class CreatingAComparator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter first number: ");
        int number1 = input();
        System.out.println("Enter second number: ");
        int number2 = input();

        if(number1 == number2) {System.out.println(0);}
        if(number1 > number1){ System.out.println(1);}
        else if (number1 < number2)System.out.println(-1);
    }

    private static int input(){
        return scanner.nextInt();
    }
}
