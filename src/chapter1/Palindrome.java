package chapter1;

import java.util.Scanner;

public class Palindrome{
    public static void main(String... args){
        Scanner input = new Scanner(System.in);


        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Enter third number");
        int num3 = input.nextInt();

        if(num1 == num3 && num2 == num3){

            System.out.printf("%d %d %d is a palindrome",num1,num2,num3);
        }
        if(num1 == num3 && num2 != num3){

            System.out.printf("%d %d %d is a palindrome",num1,num2,num3);
        }
        if(num1 != num3){
            System.out.printf("%d %d %d is not a palindrome",num1,num2,num3);
        }
    }
}
