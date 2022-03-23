package exercises;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                System.out.println("""
                                    1 => Type of view
                                    2 => Memory status\n
                                    """);
        int options = input.nextInt();
        switch (options) {
            case 1 -> System.out.println("TYPES OF VIEW");
            case 2 -> System.out.println("MEMORY STATUS");
        }
    }
}