package chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        int smallest = 0;

        System.out.println("Number of values : ");
        int[] values = new int[scanner.nextInt()];
        for (int i = 0; i < values.length; i++){
            System.out.println("value"+(i+1));
            values[i] = scanner.nextInt();
        }

        for (int value : values) if (value > largest) largest = value;
        smallest = largest;
        for (int value : values) if (value < smallest) smallest = value;

        System.out.println("the sum of two extremes is: "+(largest + smallest));
    }
}
