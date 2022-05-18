package chapter4;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Number%d%n",(i+1));
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > largest) largest = numbers[i];
        }
        System.out.println("largest number is: "+ largest);
    }

}
