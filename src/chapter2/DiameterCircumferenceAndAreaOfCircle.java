package chapter2;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfCircle {
    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.println("input the radius value");
        int radius = input.nextInt();

        float diameter = 2 * radius;
        double circumference = 2 * (Math.PI * radius);
        double area = (int) Math.PI * (Math.pow(radius,2));

        System.out.printf("The diameter of the circle is %.2f%n",diameter);
        System.out.printf("The circumference of the circle is %.2f%n",circumference);
        System.out.printf("The area of the circle is %.2f%n",area);

    }
}
