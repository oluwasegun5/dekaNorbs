package diaryTest;

import array.diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class entryTest {
    Entry entry;
    @BeforeEach
    private void setUp(){
        entry = new Entry();
    }
    @Test
    public void entryClassIsNotEmpty() {
        assertNotNull(entry);
    }

    @Test
    public void entryHasTitles() {
        entry.writeTitle("My note");
        assertEquals("My note", entry.getTitle());
    }

    @Test
    public void entryHasBody(){
        entry.writeBody("This is the body");
        assertEquals("This is the body", entry.getBody());
    }

    @Test
    public void entryHasDate(){
        assertEquals("2022-05-17", entry.getDate());
    }
}
