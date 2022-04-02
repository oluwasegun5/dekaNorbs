package chapter4;

import java.util.Scanner;

public class ReadingNumbersUntilASpecifiedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int nextNumber = 0;

        System.out.println("Enter first number");
        firstNumber = scanner.nextInt();

        while (nextNumber< firstNumber){
            System.out.println("Enter next number: ");
            int userNumber = scanner.nextInt();

            nextNumber += userNumber;
        }
    }
}
