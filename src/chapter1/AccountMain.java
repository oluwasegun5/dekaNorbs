package chapter1;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        FreeAccount ademolaAccount = new FreeAccount();

        System.out.println("input a number");
        int num = input.nextInt();

        ademolaAccount.deposit(num);

        int balance = ademolaAccount.getBalance();

        System.out.printf("Your new balance is %d%n", balance);

    }
}
