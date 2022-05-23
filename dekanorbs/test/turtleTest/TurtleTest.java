package turtleTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import theCreativeTurtle.Turtle;

import static org.junit.jupiter.api.Assertions.*;
import static theCreativeTurtle.Direction.*;


public class TurtleTest {
    Turtle ijapa;
    @BeforeEach
    void setUp(){
        ijapa = new Turtle();
    }

    @Test
    public void classIsNotEmpty(){
        assertNotNull(ijapa);
    }
    @Test
    public void penIsUpByDefault(){
        boolean isPenDown = ijapa.isPenDown();
        assertFalse(isPenDown);
    }
    @Test
    public void penIsDownTest(){
        ijapa.penDown();

        boolean isPenDown = ijapa.isPenDown();
        assertTrue(isPenDown);
    }
    @Test
    public void penIsUpTest(){
        ijapa.penDown();
        ijapa.penUp();

        boolean isPenDown = ijapa.isPenDown();
        assertFalse(isPenDown);
    }
    @Test
    public void testThatInitialDirectionIsEast(){
        assertEquals(EAST, ijapa.currentDirection());
    }
    @Test
    public void turnRightToSouthFromEast(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.currentDirection());
    }

    @Test
    public void turnRightToWestFromSouth(){
        ijapa.turnRight();

        ijapa.turnRight();
        assertEquals(WEST, ijapa.currentDirection());
    }

    @Test
    public void turnRightToNorthFromWest(){
        ijapa.turnRight();
        ijapa.turnRight();

        ijapa.turnRight();
        assertEquals(NORTH, ijapa.currentDirection());
    }
    @Test
    public void turnRightToEastFromNorth(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();

        ijapa.turnRight();
        assertEquals(EAST, ijapa.currentDirection());
    }
    @Test
    public void turnLeftToNorthFromEast(){
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.currentDirection());
    }

    @Test
    public void turnLeftToWestFromNorth(){
        ijapa.turnLeft();

        ijapa.turnLeft();
        assertEquals(WEST, ijapa.currentDirection());
    }

    @Test
    public void turnLeftToSouthFromWest(){
        ijapa.turnLeft();
        ijapa.turnLeft();

        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.currentDirection());
    }

    @Test
    public void turnLeftToEastFromSouth(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();

        ijapa.turnLeft();
        assertEquals(EAST, ijapa.currentDirection());
    }


    

}
