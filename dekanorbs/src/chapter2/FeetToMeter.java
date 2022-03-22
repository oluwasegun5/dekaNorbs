package chapter2;

import java.util.Scanner;

public class FeetToMeter{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Number of feet: ");
double feet = input.nextDouble();

double meter = feet/3.28;

System.out.printf("%.3f is %.3f meters%n",feet,meter);
}

}
