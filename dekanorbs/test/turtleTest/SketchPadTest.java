package turtleTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import theCreativeTurtle.SketchPad;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SketchPadTest {
    SketchPad sketchPad;
    @BeforeEach
    void setUp(){
        sketchPad = new SketchPad();
    }
    @Test
    public void classIsNotEmpty(){
        assertNotNull(sketchPad);
    }
    @Test
    public void getSketchPadRowLength(){
        int[][] board = new int[12][12];
    }
}
