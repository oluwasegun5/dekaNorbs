package chapter2;

import java.util.Scanner;
public class AreaOfCylinder{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Radius of the cylinder");
    double radius = input.nextDouble();

    System.out.println("Lenght of the cylinder");
    double lenght = input.nextDouble();

    double area = (radius * radius) * 3.14;
    double volume = area * lenght;

    System.out.printf("The area is %f ", area);
    System.out.printf("The volume is %f ",volume);

}
}
