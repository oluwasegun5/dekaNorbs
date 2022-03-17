package chapter2;

import java.util.Scanner;
public class Arithmetic{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first number:");
int num1 = input.nextInt();

System.out.print("Enter second number:");
int num2 = input.nextInt();

int sqr1 = num1 * num1;
int sqr2 = num2 * num2;

int addsqr = sqr1 + sqr2;
int subsqr = sqr1 - sqr2;

System.out.printf("the square of %d and %d are %d and %d respectively %n The sum of their square is %d%n Their difference is %d",num1,num2,sqr1,sqr2,addsqr,subsqr);

}
}
