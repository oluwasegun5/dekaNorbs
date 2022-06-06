package ListPackageTest;

import array.listPackage.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashMapTest {
    HashMap hashMap;
    @BeforeEach
    public void setUp() {
        hashMap = new HashMap();
    }
    @Test
    public void testThatClassIsNotEmpty() {
        assertNotNull(hashMap);
    }

    @Test
    public void testThatICanHaveAKeyAndValue(){
        hashMap.put("name","oluwasegun");
        assertEquals(1, hashMap.size());
    }

    @Test
    public void testThatHashMapCanNotHaveDuplicateKey(){
        hashMap.put("name","oluwasegun");
        hashMap.put("name","segun");
        hashMap.put("na","segun");
        assertEquals(2, hashMap.size());
        assertEquals("segun", hashMap.get("name"));
    }
    @Test
    public void testToConfirmThatHashMapIsEmpty(){
        assertTrue(hashMap.isEmpty());
    }

    @Test
    public void testThatICanGetAValueFromAKey(){
        hashMap.put("name","oluwasegun");

        assertEquals("oluwasegun", hashMap.get("name"));
    }

    @Test
    public void testForContains(){
        hashMap.put("name","oluwasegun");
        hashMap.put("ne","ree");
        hashMap.put("n","segun");

        assertTrue(hashMap.contains("ne"));
    }
}
