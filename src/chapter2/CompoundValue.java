package chapter2;

import java.util.Scanner;

public class CompoundValue{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        double amount = input.nextDouble();
        
        double interest = amount * (1 + 0.00417);
        double afterSixMonth = interest * 6;
        
        System.out.printf("After the sixth month, the account value is ₦%f%n",afterSixMonth);
    
    
    }

}
