package array.ticTac;

public class Board {
    private final State[][] board = new State[3][3];

    public Board(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = State.E;
            }
        }
    }

    public void setBoard(int row, int column,State at){
        board[row][column] = at;
    }
    public State getBoard(int row, int column){
        return board[row][column];
    }

    @Override
    public String toString() {
        return board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"+
                "--+---+---"+"\n"+
        board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"+
                "--+---+---"+"\n"+
        board[2][0]+" | "+board[2][1]+" | "+board[2][2];
    }
}
