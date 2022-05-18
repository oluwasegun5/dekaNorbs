package chapter7.airlineReservation;

import java.util.Scanner;

public class AirLine {

    public static void main(String[] args) {
        enterAirport();

    }
    static Scanner input = new Scanner(System.in);
    private static int firstClass = 1;
    private static int secondClass = 6;
    private static boolean[] seats = new boolean[10];


    private static void firstClass(){
        if(firstClass <=5){
            System.out.printf("Your seat number is %02d in first-class\n",firstClass);
            seats[firstClass-1] = true;
            firstClass++;
        }
    }
    private static void secondClass(){
        if(secondClass <=10){
            System.out.printf("Your seat number is %02d in second class\n",secondClass);
            seats[secondClass-1] = true;
            secondClass++;
        }
    }
    public static void enterAirport(){
        System.out.println("Please type 1 for First Class and 2 for Economy 3 to quit");
        int response = input.nextInt();
        book(response);

    }
    public static void book(int response) {
        switch(response){
            case 1:
                firstClass();
                if(firstClass >5){
                    System.out.println("first-class is occupied,press 3 to quit or 2 for second class ");
                }
                book(input.nextInt());
                break;
            case 2:
                secondClass();
                if(firstClass >10){
                    System.out.println("Second-class is occupied,press 3 to quit or 1 for first class ");
                }
                book(input.nextInt());
                break;
            case 3:
                System.out.println("Bye");
                break;
            default:
                enterAirport();
        }

    }

}
