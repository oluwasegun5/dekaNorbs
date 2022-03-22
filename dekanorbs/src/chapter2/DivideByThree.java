package chapter2;

import java.util.Scanner;
public class DivideByThree{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the number: ");
int num = input.nextInt();

if(num%3 == 0){
System.out.printf("%d is divisible by 3   ",num);
}

if(num%3 != 0){
System.out.printf("%d is not divisible by 3  ",num);
}


}

}
