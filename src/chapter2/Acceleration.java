package chapter2;

import java.util.Scanner;

public class Acceleration{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting Velocicy => ");
        double start = input.nextDouble();

        System.out.print("Enter ending velocity => ");
        double end = input.nextDouble();

        System.out.print("Enter time span in seconds => ");
        double time = input.nextInt();

        double speed = end - start;
        double acceleration = speed / time;

        System.out.printf("The average Acceleration is %.4f %n", acceleration);

    }

}
