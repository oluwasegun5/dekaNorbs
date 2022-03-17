package chapter2;

import java.util.Scanner;
public class ArithmeticSize{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first number: ");
int num1 = input.nextInt();


System.out.println("Enter second number: ");
int num2 = input.nextInt();

System.out.println("Enter third number: ");
int num3 = input.nextInt();

System.out.printf("The sum of the numbers is => %d%n",num1 + num2+ num3);

System.out.printf("The average of the numbers is => %d%n",(num1 + num2+ num3)/3);

System.out.printf("The product of the numbers is => %d%n",num1 * num2 * num3);

int smallest;
int largest;

largest = num1;
smallest = num1;

if(num2 > num1){
largest = num2;
}

if(num3 > largest){
largest = num3;
}

System.out.printf("The largest number is => %d%n",largest);

if(num2 < num1){
smallest= num2;
}

if(num3 < smallest){
smallest = num3;
}

System.out.printf("The smallest number is => %d%n",smallest);

}
}
