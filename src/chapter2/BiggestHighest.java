package chapter2;

import java.util.Scanner;

public class BiggestHighest{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        int num1;
        int num2;
        int num3;

        int biggest;
        int smallest;

        System.out.println("Enter first number: ");
        num1 = input.nextInt();

        System.out.println("Enter second number: ");
        num2 = input.nextInt();

        System.out.println("Enter third number: ");
        num3 = input.nextInt();

        biggest = num1;
        smallest = num1;

        if(num2 > biggest){biggest = num2;}
        if(num3 > biggest){biggest = num3;}

        if(num2 < smallest){smallest = num2;}
        if(num3 < smallest){smallest = num3;}

        System.out.printf("The biggest number is %d%n",biggest);
        System.out.printf("The smallest number is %d%n",smallest);

    }
}
