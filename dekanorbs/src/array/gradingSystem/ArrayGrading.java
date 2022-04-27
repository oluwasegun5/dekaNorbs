package array.gradingSystem;

import java.util.Scanner;

public class ArrayGrading {
    static Scanner scanner = new Scanner(System.in);








static void subjectSummary(int[][] array){
    print("\n");
    print("SUBJECT SUMMARY");
    for (int row = 1; row < array[0].length+1; row++){
        System.out.printf("""
                Subject %d
                Highest Scoring Student is: Student (highest pos) scoring (agg)
                Lowest Scoring student is: Student (lowest pos) scoring (agg)
                Total Score is: (total score per sub)
                Average Score is: (average score per sub)
                Number of passes is: (num of score above 50)
                Number of fail is: (num of score below 50)
                """,row);
        print("\n");
    }
}

    private static int total(int[] array) {
        int rowSum = 0;
        for (int i : array) {
            rowSum += i;
        }
        return rowSum;
    }

static void loadArray(int[][] array){

    for (int row = 0; row < array.length; row++) {
        print("Student"+(row+1)+"\n");
        for (int column = 0; column < array[0].length; column++) {
            array[row][column] = input("score"+(column+1)+": \n");

        }
    }

}

static void printArray(int[][] array){

        for(int row=0; row < array.length; row++){

            System.out.printf("Student%d=>",row+1);
            for(int column=0; column < array[0].length;column++){
                System.out.printf("%10d ",array[row][column]);
            }
            System.out.printf("%10d",total(array[row]));
            double average = (double)total(array[row])/(double)(array[row].length);
            System.out.printf("%10.2f",average);
            print("\n");
        }
        design('=',75);
        print("\n");
        design('=',75);
}

static void printColumns(int[][] array){
    design('=',100);
    System.out.printf("\n%s%6s","STUDENT"," ");

    for (int i = 0; i < array[0].length; i++) {
        System.out.printf("%10s%d"," subject",i+1);
    }

    System.out.printf("%8s%11s","total","average\n");
    design('=',100);
    print("\n");
}

private static void design(char character,int length){
    for (int i = 0; i < length; i++) {
        System.out.print(character);
    }
}

static int input(String text){
        print(text);
        return scanner.nextInt();
}

private static void print(String text){
        System.out.println(text);
}
}