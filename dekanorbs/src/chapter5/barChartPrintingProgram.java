package chapter5;

import java.util.Scanner;

public class barChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[5];

        System.out.println("input 5 values, each between 1 and 30");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("value"+(i+1)+": ");
            values[i]= input.nextInt();
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <values[i];j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("");
    }
}
