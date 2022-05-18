package chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("number of citizen: ");
        int[] citizenEarnings = new int[input.nextInt()];
        String[] citizenNames = new String[citizenEarnings.length];

        for (int i = 0; i < citizenNames.length; i++) {
            System.out.println("citizen Name: ");
            citizenNames[i] = input.nextLine();
            input.nextLine();
            System.out.println("citizen earning: ");
            citizenEarnings[i] = input.nextInt();
        }
        for (int i = 0; i < citizenEarnings.length; i++) {
            if(citizenEarnings[i]  <= 300000) {
                System.out.println(citizenNames[i] + " tax is $" + (citizenEarnings[i] * 15) / 100);
            }
            else
            System.out.println(citizenNames[i] + " tax is $" + (citizenEarnings[i] * 20) / 100);

        }
    }
}
