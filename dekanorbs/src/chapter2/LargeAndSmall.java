package chapter2;

import java.util.Scanner;
public class LargeAndSmall{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int smallest;
int largest;

int num1;
int num2;
int num3;
int num4;
int num5;

System.out.println("Enter first number: ");
num1 = input.nextInt();

System.out.println("Enter second number: ");
num2 = input.nextInt();

System.out.println("Enter third number: ");
num3 = input.nextInt();

System.out.println("Enter four number: ");
num4 = input.nextInt();

System.out.println("Enter five number: ");
num5 = input.nextInt();

largest = num1;
smallest = num1;

//finding the largest number
if(num2 > largest){largest = num2;}
if(num3 > largest){largest = num3;}
if(num4 > largest){largest = num4;}
if(num5 > largest){largest = num5;}

//finding the smallest number
if(num2 < smallest){smallest = num2;}
if(num3 < smallest){smallest = num3;}
if(num4 < smallest){smallest = num4;}
if(num5 < smallest){smallest = num5;}


System.out.printf("the smallest number is => %d%n",smallest);
System.out.printf("The largest number is => %d%n", largest);

}
}
