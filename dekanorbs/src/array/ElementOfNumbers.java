package array;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.Arrays;

public class ElementOfNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        SecureRandom sRandom = new SecureRandom();

        int maximum = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = sRandom.nextInt(1,50);//load array
            if (numbers[i] > maximum) maximum = numbers[i];//set maximum
            sum += numbers[i];//add up
        }

        System.out.println(Arrays.toString(numbers));
        System.out.printf(" Maximum number is: %d\n Sum of the numbers is: %d\n Average of the numbers is: %d",maximum,sum,sum/10);
    }
}

