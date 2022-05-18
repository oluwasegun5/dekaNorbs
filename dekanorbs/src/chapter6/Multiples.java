package chapter6;

import java.util.Scanner;

public class Multiples{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int num1;
int num2;


System.out.println("Enter first number :");
num1 = input.nextInt();

System.out.println("Enter second number :");
num2 = input.nextInt();

int tripled = num1 * 3;
int secdouble = num2 * 2;

if(tripled % secdouble == 0){
System.out.printf("%d tripled is a multiple of %d double %n",num1,num2);
System.out.printf("%d and %d respectively. %n",tripled,secdouble);
}

if(tripled % secdouble != 0){
System.out.printf("%d tripled is not a multiple of %d double %n",num1,num2);
System.out.printf("%d and %d respectively. %n",tripled,secdouble);
}

}
}
