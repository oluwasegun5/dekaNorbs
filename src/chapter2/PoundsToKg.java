package chapter2;

import java.util.Scanner;

public class PoundsToKg{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Numer of Pounds: ");
double pounds = input.nextDouble();

double kg = pounds/2.2046;

System.out.printf("=> %.2f kg%n",kg);
}

}
