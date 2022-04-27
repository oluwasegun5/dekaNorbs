package array;


import java.security.SecureRandom;

public class ArrayTest {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
       int[][] number = new int[3][3];
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = random.nextInt(1,10);
                sum += number[i][j];
            }

        }

        for (int[] ints : number) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


        System.out.println("sum ="+sum);
    }
}
