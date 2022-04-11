package personnal;

import java.util.Scanner;

public class SecondPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int userNumber = scanner.nextInt();
        int[] number = new int[userNumber];

        System.out.printf("index%10s element\n"," ");
        for (int i = 0; i < number.length; i++) {
            System.out.printf("%03d %20d\n",i,number[i]);
        }

    }
}
