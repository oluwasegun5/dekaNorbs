package array;

import java.util.Scanner;

public class ArrayGrading {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int students = input("How many student are in class: \n");
        int courses = input("How many courses do they offer: \n");

        int[][] classes = new int[students][courses];

        loadArray(classes);
        printColumns(classes);
        printArray(classes);

    }









    private static int total(int[] array) {
            int rowSum = 0;
        for (int i : array) {
            rowSum += i;
        }
            return rowSum;
    }

private static void loadArray(int[][] array){

    for (int row = 0; row < array.length; row++) {
        print("Student"+(row+1)+"\n");
        for (int column = 0; column < array[0].length; column++) {
            array[row][column] = input("score"+(column+1)+": \n");

        }
    }

}

private static void printArray(int[][] array){

        for(int row=0; row < array.length; row++){

            System.out.printf("Student%d=>",row+1);
            for(int column=0; column < array[0].length;column++){
                System.out.printf("%10d ",array[row][column]);
            }
            System.out.printf("%10d",total(array[row]));
            System.out.printf("%10d",total(array[row])/(array[row].length));
            print("\n");
        }
}

private static void printColumns(int[][] array){
    System.out.printf("%13s"," ");
        for (int i = 0; i < array[0].length; i++) {
                System.out.printf("%10s%d"," subject",i+1);
        }
    System.out.printf("%10s%10s","total","average");
    print("\n");
}

private static int input(String text){
        print(text);
        return scanner.nextInt();
}

private static void print(String text){
        System.out.println(text);
}
}
