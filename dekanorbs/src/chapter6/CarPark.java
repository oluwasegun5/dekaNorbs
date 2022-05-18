package chapter6;

import java.util.Scanner;

public class CarPark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many cars: ");
        int[] cars = new int[input.nextInt()];

        for (int i = 0; i < cars.length; i++){
            System.out.println("Total hours for car"+(i+1));
            cars[i] = input.nextInt();
        }
        for (int i = 0; i < cars.length; i++){
            if(cars[i] <=3){
                System.out.println("car"+(i+1)+" price is => $"+2.00);
            }
            else
                System.out.println("car"+(i+1)+" price is => $"+2.00+((cars[i]-3)*50) );
        }

    }
}
