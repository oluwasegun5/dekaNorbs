package array;

import java.util.Scanner;

public class TicTacClass {
    public static void main(String[] args) {
        printBoard();
        play();

    }

    static Scanner scanner = new Scanner(System.in);
    private static boolean isWin = false;
    private static char currentPlayer = 'X';
    private static final char[][] board = {{'1','|','2','|','3'},
                                           {'-','+','-','+','-'},
                                           {'4','|','5','|','6'},
                                           {'-','+','-','+','-'},
                                           {'7','|','8','|','9'}};

    public static void printBoard(){
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
    public static void play(){
        int count = 0;
        while (count <9 || isWin == true) {
            System.out.printf("%c's turn \n", currentPlayer);
            int num = scanner.nextInt();
            System.out.flush();
            switch (num) {
                case 1 -> {
                    set1(currentPlayer);
                    printBoard();
                }
                case 2 -> {
                    set2(currentPlayer);
                    printBoard();
                }
                case 3 -> {
                    set3(currentPlayer);
                    printBoard();
                }
                case 4 -> {
                    set4(currentPlayer);
                    printBoard();
                }
                case 5 -> {
                    set5(currentPlayer);
                    printBoard();
                }
                case 6 -> {
                    set6(currentPlayer);
                    printBoard();
                }
                case 7 -> {
                    set7(currentPlayer);
                    printBoard();
                }
                case 8 -> {
                    set8(currentPlayer);
                    printBoard();
                }
                case 9 -> {
                    set9(currentPlayer);
                    printBoard();
                }
            }
            count ++;
        }
    }


    private static void status(){
        boolean firstRowWin = (board[0][0] =='X' & board[0][2] =='X' & board[0][4] =='X') || (board[0][0] =='O' & board[0][2] =='O' & board[0][4] =='O');
        boolean secondRowWin = (board[2][0] =='X' & board[2][2] =='X' & board[2][4] =='X') || (board[2][0] =='O' & board[2][2] =='O' & board[2][4] =='O');
        boolean thirdRowWin = (board[4][0] =='X' & board[4][2] =='X' & board[4][4] =='X') || (board[4][0] =='O' & board[4][2] =='O' & board[4][4] =='O');

        boolean firstColumnWin = (board[0][0] =='X' & board[2][0] =='X' & board[4][0] =='X') || (board[0][0] =='O' & board[2][0] =='O' & board[4][0] =='O');
        boolean secondColumnWin = (board[0][2] =='X' & board[2][2] =='X' & board[4][2] =='X') || (board[0][2] =='O' & board[2][2] =='O' & board[4][2] =='O');
        boolean thirdColumnWin = (board[0][4] =='X' & board[2][4] =='X' & board[4][4] =='X') || (board[0][4] =='O' & board[2][4] =='O' & board[4][4] =='O');

        boolean side1 = (board[0][0] =='X' & board[2][2] =='X' & board[4][4] =='X') || (board[0][0] =='O' & board[2][2] =='O' & board[4][4] =='O');
        boolean side2 = (board[0][4] =='X' & board[2][2] =='X' & board[0][0] =='X') || (board[0][4] =='O' & board[2][2] =='O' & board[0][0] =='O');

        boolean itHasWin = firstRowWin || secondRowWin || thirdRowWin || firstColumnWin || secondColumnWin || thirdColumnWin || side1 || side2;
        if(itHasWin) isWin = true;
    }

    private static void setCurrentPlayer(){
        if(currentPlayer== 'X') currentPlayer = 'O';
        else currentPlayer = 'X';
    }
    private static void set1(char play){
        status();
        board[0][0] = play;
        setCurrentPlayer();

    }
    private static void set2(char play){
        status();
        board[0][2] = play;
        setCurrentPlayer();

    }
    private static void set3(char play){
        status();
        board[0][4] = play;
        setCurrentPlayer();
    }
    private static void set4(char play){
        status();
        board[2][0] = play;
        setCurrentPlayer();
    }
    private static void set5(char play){
        status();
        board[2][2] = play;
        setCurrentPlayer();
    }
    private static void set6(char play){
        status();
        board[2][4] = play;
        setCurrentPlayer();
    }
    private static void set7(char play){
        status();
        board[4][0] = play;
        setCurrentPlayer();
    }
    private static void set8(char play){
        status();
        board[4][2] = play;
        setCurrentPlayer();
    }
    private static void set9(char play){
        status();
        board[4][4] = play;
        setCurrentPlayer();
    }
}
