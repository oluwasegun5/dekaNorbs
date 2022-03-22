package exercises;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        int a = 0,b = 0,c = 0,d = 0;

        System.out.println();
        System.out.println("Please use upper case letters only");

        for (int i = 1; i < 6; i++) {
            System.out.printf("Enter student%d grade: ",i);
            String grade = input.nextLine();

            switch (grade) {
                case "A" -> a++;
                case "B" -> b++;
                case "C" -> c++;
                case "D" -> d++;
            }
        }
        System.out.printf("A = %d, B = %d, C = %d, D = %d ",a,b,c,d);
    }
}