package chapter1;

import java.util.Scanner;

public class SeperateThreeIntegers {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five digit number: ");
        int number =  input.nextInt();

        int num1 = number/10000;
        int num2 = (number%10000)/1000;
        int num3 = (number%1000)/100;
        int num4 = (number%100)/10;
        int num5 = number%10;

        System.out.printf("%d   %d   %d   %d   %d",num1,num2,num3,num4,num5);
    }
}
