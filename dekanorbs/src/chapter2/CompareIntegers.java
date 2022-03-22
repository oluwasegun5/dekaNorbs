package chapter2;

import java.util.Scanner;

public class CompareIntegers{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter one integer: ");
int num = input.nextInt();

if(num > 100){
System.out.printf("%d is greater than 100",num);
}

if(num < 100){
System.out.printf("%d is less than 100",num);
}

if(num == 100){
System.out.printf("%d is equal to 100",num);
}



}
}
