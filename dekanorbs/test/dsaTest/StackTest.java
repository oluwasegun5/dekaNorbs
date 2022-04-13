package dsaTest;

import dsa.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StackTest {
    @Test
    public void bankCanBeCreatedTest(){
        Stack stack = new Stack();
        assertNotNull(stack);
    }
}
