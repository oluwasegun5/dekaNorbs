package array.ticTac;

import java.security.SecureRandom;
import java.util.Scanner;

public class Console {
    private int counter;
    private boolean computerShouldPlay;
    SecureRandom random = new SecureRandom();
    private final Scanner scanner = new Scanner(System.in);
    TicTacToe tacToe = new TicTacToe();

    public void play(){

            int userResponse = usersMove();
            switch (userResponse) {
                case 1 -> {
                    tacToe.playAt(0, 0);
                    if (thereIsAWin()) break;
                    if (draw())break;
                    play();
                }
                case 2 -> {
                    tacToe.playAt(0, 1);
                    if (thereIsAWin()) break;
                    if (draw())break;
                    play();
                }
                case 3 -> {
                    tacToe.playAt(0, 2);
                    if (thereIsAWin()) break;
                    if (draw())break;
                    play();
                }
                case 4 -> {
                    tacToe.playAt(1, 0);
                    if (thereIsAWin()) break;
                    if (draw())break;
                    play();
                }
                case 5 -> {
                    tacToe.playAt(1, 1);
                    if (thereIsAWin()) break;
                    if (draw())break;
                    play();
                }
                case 6 -> {
                    tacToe.playAt(1, 2);
                    if (thereIsAWin()) break;
                    if (draw())break;
                    play();
                }
                case 7 -> {
                    tacToe.playAt(2, 0);
                    if (thereIsAWin()) break;
                    if (draw())break;
                    play();
                }
                case 8 -> {
                    tacToe.playAt(2, 1);
                    if (thereIsAWin()) break;
                    if (draw())break;
                    play();
                }
                case 9 -> {
                    tacToe.playAt(2, 2);
                    if (thereIsAWin()) break;
                    if (draw())break;
                    play();
                }
                default -> play();
            }
    }

    private boolean draw() {
        if (tacToe.isDraw()) {
            print("The game ended draw!!");
            print(tacToe.displayBoard());
            return true;
        }
        return false;
    }
    private boolean thereIsAWin() {
        if(tacToe.player1Won()){
            print("player1 (X) won");
            print(tacToe.displayBoard());
            return true;
        }
        else if(tacToe.player2Won()){
            print("player2 (O) won");
            print(tacToe.displayBoard());
            return true;
        }
        return false;
    }

    private int computerPlay(){
        return random.nextInt(1,10);
    }
//    private int mixPlay() {
//        if(computerShouldPlay){
//            if()
//            return computerPlay();
//        }
//        return usersMove();
//    }
    public void promptUser(){
        print("Y to play with computer N to play with fellow player");
        String response = scanner.nextLine();
        if(response.equalsIgnoreCase("Y")) computerShouldPlay = true;
        else if (response.equalsIgnoreCase("N")) computerShouldPlay = false;
        else promptUser();
    }

    private int usersMove(){
        print("enter any digit between 1-9 to play");
        print(tacToe.displayBoard());
        return input(tacToe.currentPlayer()+"'s turn");
    }

    private int input(String text){
        print(text);
        return scanner.nextInt();
    }
    private void print(String text){
        System.out.println(text);
    }
}
