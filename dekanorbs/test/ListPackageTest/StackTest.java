package ListPackageTest;

import dataStructure.listPackage.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

//todo push, peek, pop, isEmpty, search
public class StackTest {
    Stack stack;
    @BeforeEach
    public void setUp() {
        stack = new Stack(10);
    }
    @Test
    public void testThatClassisNotEmpty(){
        assertNotNull(stack);
    }

    @Test
    public void testThatICanPushAnItem(){
        stack.push("one");
        assertEquals("one",stack.pop());
    }

    @Test
    public void testThatICanPushMultipleItem(){
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        assertEquals("four",stack.pop());
        assertEquals("three",stack.pop());
    }

    @Test
    public void testThatICanPeekAtAnItem(){
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        assertEquals("four",stack.peek());
    }
    @Test
    public void testThatStackIsEmpty(){
        assertTrue(stack.empty());
    }

}
