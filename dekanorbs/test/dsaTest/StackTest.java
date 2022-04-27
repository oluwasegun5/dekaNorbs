package dsaTest;

import dsa.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;
    @BeforeEach
    public void set(){
        stack = new Stack();
    }
    @Test
    public void bankCanBeCreatedTest(){
        assertNotNull(stack);
    }
    @Test
    public void stackIsEmptyTest(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pusOneElement_StackIsNotEmptyTest(){
        stack.push(13);
        assertFalse(stack.isEmpty());
    }
    @Test
    public void pushX_PopX_StackShouldBeEmptyTest(){
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushXandY_popY_stackShouldNotBeEmptyTest(){
        stack.push(13);
        stack.push(5);
        stack.pop();
        assertFalse(stack.isEmpty());
    }
    @Test
    public void pushX_popX_elementShouldBeXTest(){
        stack.push(34);
        int element = stack.pop();
        assertEquals(34,element);
    }
    @Test
    public void pushXandY_popYandX_elementIsYandXTest(){
        stack.push(34);
        stack.push(5);
        int element = stack.pop();

        assertEquals(5,element);
        element = stack.pop();
        assertEquals(34,element);
    }
    @Test
    public void pushXandY_pickReturnsYTest(){
        stack.push(34);
        stack.push(5);
        int element = stack.peek();
        assertEquals(5, element);
        element = stack.pop();
        assertEquals(5,element);
        assertEquals(34,stack.peek());
    }
}
