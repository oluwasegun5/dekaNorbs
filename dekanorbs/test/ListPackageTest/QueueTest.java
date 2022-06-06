package ListPackageTest;

import array.listPackage.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class QueueTest {
    Queue queue;
    @BeforeEach
    void setUp() {
        queue = new Queue(10);
    }
    @Test
    public void testThatClassIsNotEmpty(){
        assertNotNull(queue);
    }

    @Test
    public void testThatICanAddAnItem(){
        assertTrue(queue.add("one"));
    }

    @Test
    public void testThatICanPeekAtAnItem(){
        assertTrue(queue.add("one"));

        assertEquals("one",queue.peek());
    }

    @Test
    public void testThatICanPop(){
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("three");

        assertEquals("one",queue.remove());
    }
}
