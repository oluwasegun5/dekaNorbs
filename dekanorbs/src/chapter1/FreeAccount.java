package chapter1;

import java.util.Scanner;

public class FreeAccount {
    AccountMain mn = new AccountMain();


    private int balance;

    Scanner input = new Scanner(System.in);
    public void deposit(int amount){

        balance = balance + amount;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
    public int getBalance(){
        return balance;
    }
}
