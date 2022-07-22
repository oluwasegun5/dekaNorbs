package ListPackageTest;

import dataStructure.listPackage.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ImplementArrayListTest {
    ArrayList<Number> list;
    @BeforeEach
    void setUp() {
        list = new ArrayList<Number>();
    }
    @Test
    public void testThatClassIsNotEmpty(){
        assertNotNull(list);
    }

    @Test
    public void testListStartFromSizeZero(){
        assertEquals(0, list.size());
    }

    @Test
    public void testThatWhenIAddSizeWillIncrease(){
        list.add("12");

        assertEquals(1, list.size());
    }

    @Test
    public void testThatICanAddToAnyIndex(){
        list.add("12");
        list.add(0,"90");

        assertEquals(2 , list.size());
        assertEquals("90" , list.get(0));
    }

    @Test
    public void testThatICanGetWhatIAdded(){
        list.add("12");
        assertEquals("12", list.get(0));
    }

    @Test
    public void testThatICanAddMultipleItem(){
        list.add("23456");
        list.add("2");
        list.add("67");

        assertEquals(3, list.size());
    }

    @Test
    public void testThatWhenIRemoveListLengthWillReduce(){
        list.add("23456");
        list.add("2");
        list.add("67");
        assertEquals(3, list.size());


        list.remove(0);
        assertEquals(2, list.size());
    }

    @Test
    public void testThatWhenIRemoveItemWillNoBeThere(){
        list.add("23456");
        list.add("2");
        list.add("67");
        assertEquals(3, list.size());
        assertEquals("23456", list.get(0));

        list.remove(0);
        assertEquals(2, list.size());
        assertEquals("2", list.get(0));
    }

    @Test
    public void testThatICanRemoveByItem(){
        list.add("23456");
        list.add("2");
        list.add("67");
        assertEquals(3, list.size());
        assertEquals("2", list.get(1));


    }

    @Test
    public void testThatWhenICanRemoveFromAnyIndex(){
        list.add("23456");
        list.add("2");
        list.add("67");
        assertEquals(3, list.size());
        assertEquals("2", list.get(1));

        list.remove(1);
        assertEquals(2, list.size());
        assertEquals("67", list.get(1));
    }

    @Test
    public void TestThatListCanExpand(){

        list.add("2");
        list.add("54");
        list.add("765");
        list.add("278");
        list.add("254");
        list.add("223");
        list.add("222");
        list.add("298");
        list.add("2098");
        list.add("20");

        assertEquals(10, list.size());
    }

}
