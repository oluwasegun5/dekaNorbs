package array.ticTac;

import static array.ticTac.State.*;

public class TicTacToe {
    private boolean player1Win;
    private boolean player2Win;
    private int moves;
    Board board = new Board();

    public String displayBoard() {
        return board.toString();
    }


    public State position(int row, int column) {
        return board.getBoard(row,column);
    }

    public void playAt(int row, int column) {
        if(isEmpty(row,column)) {
            if (isFirstPlayer()) board.setBoard(row,column,X);
            else
                board.setBoard(row,column,O);
            moves++;
        }
    }

    private boolean isEmpty(int row, int column){
        return board.getBoard(row,column) == E;
    }

    public boolean isFirstPlayer(){
        return moves % 2 == 0;
    }

    public String currentPlayer() {
        if(isFirstPlayer()) return "player1 (X)";
        return "player2 (0)";
    }
    public boolean isDraw(){
        return moves == 9;
    }

    public boolean player1Won(){
        conditions();
        return player1Win;
    }
    public boolean player2Won(){
        conditions();
        return player2Win;
    }
    public void conditions(){
        conditionForWin1();
        conditionForWin2();
        conditionForWin3();
        conditionForWin4();
        conditionForWin5();
        conditionForWin6();
        conditionForWin7();
        conditionForWin8();
    }
    private void conditionForWin1(){
        if (board.getBoard(0,0)==X & board.getBoard(0,1)==X&board.getBoard(0,2)==X) player1Win = true;
        else if (board.getBoard(0,0)==O & board.getBoard(0,1)==O&board.getBoard(0,2)==O) player2Win = true;
    }
    private void conditionForWin2(){
        if (board.getBoard(1,0)==X & board.getBoard(1,1)==X&board.getBoard(1,2)==X) player1Win = true;
        else if (board.getBoard(1,0)==O & board.getBoard(1,1)==O&board.getBoard(1,2)==O) player2Win = true;
    }
    private void conditionForWin3(){
        if (board.getBoard(2,0)==X & board.getBoard(2,1)==X&board.getBoard(2,2)==X) player1Win = true;
        else if (board.getBoard(2,0)==O & board.getBoard(2,1)==O&board.getBoard(2,2)==O) player2Win = true;
    }
    private void conditionForWin4(){
        if (board.getBoard(0,0)==X & board.getBoard(1,0)==X&board.getBoard(2,0)==X) player1Win = true;
        else if (board.getBoard(0,0)==O & board.getBoard(1,0)==O&board.getBoard(2,0)==O) player2Win = true;
    }
    private void conditionForWin5(){
        if (board.getBoard(0,1)==X & board.getBoard(1,1)==X&board.getBoard(2,1)==X) player1Win = true;
        else if (board.getBoard(0,1)==O & board.getBoard(1,1)==O&board.getBoard(2,1)==O) player2Win = true;
    }
    private void conditionForWin6(){
        if (board.getBoard(0,2)==X & board.getBoard(1,2)==X&board.getBoard(2,2)==X) player1Win = true;
        else if (board.getBoard(0,2)==O & board.getBoard(1,2)==O&board.getBoard(2,2)==O) player2Win = true;
    }
    private void conditionForWin7(){
        if (board.getBoard(0,0)==X & board.getBoard(1,1)==X & board.getBoard(2,2)==X) player1Win = true;
        if (board.getBoard(0,0)==O & board.getBoard(1,1)==O & board.getBoard(2,2)==O) player2Win = true;
    }
    private void conditionForWin8(){
        if (board.getBoard(0,2)==X & board.getBoard(1,1)==X & board.getBoard(2,0)==X) player1Win = true;
        if (board.getBoard(0,2)==O & board.getBoard(1,1)==O & board.getBoard(2,0)==O) player2Win = true;
    }
}
