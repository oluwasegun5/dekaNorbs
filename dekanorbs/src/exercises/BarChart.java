package exercises;

import java.util.Scanner;

public class BarChart {
    public static void main(String... arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();
        System.out.println("Enter fourth number: ");
        int num4 = input.nextInt();
        System.out.println("Enter fifth number: ");
        int num5 = input.nextInt();


        barChart(num1);
        barChart(num2);
        barChart(num3);
        barChart(num4);
        barChart(num5);

    }

    private static void barChart(int number){
        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}