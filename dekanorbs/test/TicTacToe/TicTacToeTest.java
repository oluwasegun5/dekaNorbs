package TicTacToe;

import array.ticTac.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static array.ticTac.State.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TicTacToeTest {
    TicTacToe xAndO;
    @BeforeEach
    void setUp() {
        xAndO = new TicTacToe();
    }

    @Test
    public void testThatClassIsNotEmpty(){
        assertNotNull(xAndO);
    }

    @Test
    public void testThatBoardIsEmptyAtDefault() {
        assertEquals(E,xAndO.position(0,0));
    }

    @Test
    public void textThatTheFirstPlayerIsX(){
        xAndO.playAt(0,1);
        assertEquals(X,xAndO.position(0,1));
    }

    @Test
    public void textThatTheSecondPlayerIsO(){
        xAndO.playAt(0,1);
        xAndO.playAt(1,1);
        assertEquals(O,xAndO.position(1,1));
    }

    @Test
    public void textThatOCanNotOverRideX(){
        xAndO.playAt(0,1);
        xAndO.playAt(0,1);
        assertEquals(X,xAndO.position(0,1));
    }

    @Test
    public void k(){
        xAndO.playAt(0,0);
        xAndO.playAt(0,0);
        xAndO.playAt(0,1);
        xAndO.playAt(0,1);
        xAndO.playAt(0,2);
        xAndO.playAt(2,0);
        System.out.println(xAndO.displayBoard());
    }

}
