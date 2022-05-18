package chapter6;

import java.util.Scanner;
public class CelsiusConverter{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Input degree in Celsius: ");

double celsius = input.nextDouble();
double fahrenheit = (9.0/5)* celsius + 32;
System.out.printf("%f celsius is %f fahrenheit", celsius, fahrenheit);

}

}
