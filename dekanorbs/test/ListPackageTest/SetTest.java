package ListPackageTest;

import array.listPackage.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set set;
    @BeforeEach
    void setup(){
        set = new Set();
    }

    @Test
    public void testThatSetClassIsNotEmpty(){
        assertNotNull(set);
    }

    @Test
    public void testThatSetLengthIsZeroByDefault(){
        assertEquals(0, set.size());
    }

    @Test
    public void testThatWhenIAddSizeWillIncrease(){
        set.add("12");
        assertEquals(1, set.size());
    }

    @Test
    public void testThatICanAddMultipleItem(){
        set.add("12");
        set.add("hahaha");
        assertTrue(set.contains("hahaha"));
    }

    @Test
    public void testThatISetCanNotHaveDuplicate(){
        set.add("12");
        set.add("hahaha");
        set.add("hahaha");

        assertEquals(2, set.size());
    }

    @Test
    public void testThatICanRemove(){
        set.add("12");
        set.add("hahaha");
        set.add("hah");
        set.add("haha");
        assertTrue(set.contains("hahaha"));
        assertEquals(4, set.size());

        set.remove("hahaha");
        assertFalse(set.contains("hahaha"));
        assertEquals(3, set.size());
    }
}
