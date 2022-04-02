package chapter4;

public class CheckerboardPatternOfAsterisks {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.print("1 ");
//            System.out.print(" ");
            for (int j = 0; j < 8; j++) {
                System.out.print("2 ");
//                System.out.print(" ");
            }
            System.out.println();
            System.out.print(" ");
        }
    }
}
