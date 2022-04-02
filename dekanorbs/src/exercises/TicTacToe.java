package exercises;

public class TicTacToe {
    public static void main(String[] args) {
        char[][][] board = new char[3][3][3];

        for (int i = 0; i < 27; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    System.out.print('x');
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
