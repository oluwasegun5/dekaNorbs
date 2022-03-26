package exercises;

import java.util.Random;
import java.util.Scanner;

public class RandomOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        int correct = 0;
        int  wrong = 0;
        double ans;



        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(1,6);//for switch

            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);

            switch (number){
                case 1://addition
                    ans = num1 + num2;
                    System.out.printf("%d + %d = ",num1,num2);
                    int userAns = input.nextInt();
                    if (userAns == ans){
                        System.out.println("Correct!!");
                        correct++;
                    }
                    else {
                        System.out.println("Wrong");
                        wrong++;
                    }
                    break;
                case 2://subtraction

                    if (num1 > num2){
                        ans = num1 - num2;
                        System.out.printf("%d - %d = ",num1,num2);
                        userAns = input.nextInt();
                        if (userAns == ans){
                            System.out.println("Correct!!");
                            correct++;
                        }
                        else {
                            System.out.println("Wrong");
                            wrong++;
                        }
                    }
                    else {
                        ans = num2 - num1;
                        System.out.printf("%d - %d = ",num2,num1);
                        userAns = input.nextInt();
                        if (userAns == ans){
                            System.out.println("Correct!!");
                            correct++;
                        }
                        else {
                            System.out.println("Wrong");
                            wrong++;
                        }
                    }
                    break;
                case 3://multiplication
                    ans = num1 * num2;

                    System.out.printf("%d * %d = ",num1,num2);

                    userAns = input.nextInt();
                    if (userAns == ans){
                        System.out.println("Correct!!");
                        correct++;
                    }
                    else {
                        System.out.println("Wrong");
                        wrong++;
                    }
                    break;
                case 4://modulus
                    if(num1 > num2){
                        ans = num1 % num2;
                        System.out.print(num1+ " % "+num2+" = ");
                        userAns = input.nextInt();
                        if (userAns == ans){
                            System.out.println("Correct!!");
                            correct++;
                        }
                        else {
                            System.out.println("Wrong");
                            wrong++;
                        }
                    }
                    else{
                        ans = num2 % num1;
                        System.out.print(num2+" % "+num1+" = ");
                        userAns = input.nextInt();

                        if (userAns == ans){
                            System.out.println("Correct!!");
                            correct++;
                        }
                        else {
                            System.out.println("Wrong");
                            wrong++;
                        }
                    }
                    break;
                case 5://division
                    if(num1 > num2){
                        ans =(double) num1/num2;
                        System.out.printf("%d / %d =",num1,num2);
                        userAns = input.nextInt();

                        if (userAns == ans){
                            System.out.println("Correct!!");
                            correct++;
                        }
                        else {
                            System.out.println("Wrong");
                            wrong++;
                        }
                    }
                    else {
                        ans = (double)num2/num1;

                        System.out.printf("%d / %d",num2,num1);
                        userAns = input.nextInt();
                        if (userAns == ans){
                            System.out.println("Correct!!");
                            correct++;
                        }
                        else {
                            System.out.println("Wrong");
                            wrong++;
                        }
                    }
                    break;
            }

        }
        System.out.println("".repeat(4));
        System.out.printf("Correct = %d \t Wrong = %d",correct,wrong);


    }
}
