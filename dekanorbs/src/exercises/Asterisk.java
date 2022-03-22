package exercises;

public class Asterisk {
    public static void main(String... args) {
        //triangle(10,"*")

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("a");

            System.out.println();
        }
        System.out.println();

        for (int i = 10; i > 1; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print("b");
            }
            System.out.println("");
        }

    }

















    private static void triangle(int number,String character) {

        for(int row = number; row < number+1; row++) {

        }
    }
}
