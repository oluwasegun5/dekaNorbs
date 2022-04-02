package exercises;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Object [][] board= new Object[3][3];
        board[0][0] = 'X';
        board[0][1] = 'O';
        board[0][2] = 'X';
        board[1][0] = 'X';
        board[1][1] = 'X';
        board[1][2] = 'X';
        board[2][0] = 'O';
        board[2][1] = 'X';
        board[2][2] = 'X';


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]+" ");

            }
            System.out.println();
        }

    }
}
