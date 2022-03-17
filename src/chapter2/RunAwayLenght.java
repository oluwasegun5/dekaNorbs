package chapter2;

import java.util.Scanner;

public class RunAwayLenght{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter Speed :");
double speed = input.nextDouble();

System.out.println("Enter acceleration :");
double acceleration = input.nextDouble();

double lenght = (speed * speed)/(acceleration * 2);

System.out.printf("The mininum runaway lenght for this airplane is %.3f%n",lenght);

}

}
