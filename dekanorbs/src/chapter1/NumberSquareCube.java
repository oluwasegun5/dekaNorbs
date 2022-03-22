package chapter1;

import static java.lang.Math.pow;

public class NumberSquareCube {
    public static void main(String... args){
//        System.out.println("Number /t Square /t Cube");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
        System.out.println("number \t square \t cube \n");
        int number= 0;
        for(int num =1;num<12;num++){

            int square =(int) Math.pow(number,2);
            int cube = (int) Math.pow(number,3);

            System.out.printf("%d \t\t %d \t\t %d\n",number,square,cube);
            number++;
        }
    }
}
