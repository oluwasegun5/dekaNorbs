package chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price = 0;

        System.out.println("Number item: ");
        int item = input.nextInt();

        double[] prices = new double[item];

        for (int i = 0; i <item; i++){
            System.out.println("Item "+ (i+1));
            prices[i] = input.nextDouble();
        }
        for (int i = 0; i < item; i++){
            price += prices[i];
        }

        double commission = (double) (price * 9)/100;

        System.out.println("Your commission is $"+(commission +200));
    }



}
