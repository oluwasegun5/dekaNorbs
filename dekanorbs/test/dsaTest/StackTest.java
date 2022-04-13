package dsaTest;

import dsa.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {
    @Test
    public void bankCanBeCreatedTest(){
        Stack stack = new Stack();
        assertNotNull(stack);
    }
    @Test
    public void stackIsEmptyTest(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }
}
