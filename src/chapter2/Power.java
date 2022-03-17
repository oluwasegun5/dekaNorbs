package chapter2;

public class Power{
public static void main(String[] args){

int a1 = 1;
int a2 = 2;
int a3 = 3;
int a4 = 4;
int a5 = 5;

int b1 = 2;
int b2 = 3;
int b3 = 4;
int b4 = 5;
int b5 = 6;

int pow1 = (int) Math.pow(a1,b1);
int pow2 = (int) Math.pow(a2,b2);
int pow3 = (int) Math.pow(a3,b3);
int pow4 = (int) Math.pow(a4,b4);
int pow5 = (int) Math.pow(a5,b5);


System.out.println("a \t b \t pow(a, b)");
System.out.printf("%d \t %d \t %d%n",a1,b1,pow1);
System.out.printf("%d \t %d \t %d%n",a2,b2,pow2);
System.out.printf("%d \t %d \t %d%n",a3,b3,pow3);
System.out.printf("%d \t %d \t %d%n",a4,b4,pow4);
System.out.printf("%d \t %d \t %d%n",a5,b5,pow5);

}

}
