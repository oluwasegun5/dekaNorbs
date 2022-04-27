package array.gradingSystem;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Grading {
    private static int[][] result = new int[3][3];
    private static int row = input("Number of students in class: ");
    private static int column = input("Number of courses taken: ");
    private static int[][] students = new int[row][column];

    static void printColumns(){
        design('=',100);
        System.out.printf("\n%s%s","STUDENT","  ");

        for (int i = 0; i < column; i++) {
            System.out.printf("%10s%d"," sub",i+1);
        }

        System.out.printf("%8s%11s","total","average\n");
        design('=',100);
        print("\n");
    }
    public static void printArray(){

        for (int student = 0; student < row; student++) {
            System.out.printf("%s%d","Student",student + 1);
            for (int sub = 0; sub < column; sub++) {

                System.out.printf("%11d",students[student][sub]);
            }
            total();
            print("");
        }
    }
    private static void total() {
        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total = 0;
            for (int j = 0; j < students[i].length; j++) {
                total += students[i][j];
            }
            System.out.print(total);
        }
    }
    public static void loadArray(){
        for (int student = 0; student < row; student++) {
            print("student"+(student +1));
            for (int sub = 0; sub < column; sub++) {
                students[student][sub] = input("score"+(sub+1)+": \n");
            }
        }
    }

    private static void design(char character,int length){
        for (int i = 0; i < length; i++) {
            System.out.print(character);
        }
    }
    public static int input(String text) {
        Scanner scanner = new Scanner(System.in);
        print(text);
        return scanner.nextInt();
    }
    public static void print(String text){
        System.out.println(text);
    }
}
