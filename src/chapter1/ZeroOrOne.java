package chapter1;

import java.util.Scanner;

public class ZeroOrOne {
    public static void main(String... args){

        Scanner input =  new Scanner(System.in);

        System.out.println("Enter a number(1 or 0)");
        short digit = input.nextShort();

        if (digit == 1){
            System.out.println("0");
        }
        if(digit == 0){
            System.out.println("1");
        }
    }
}
