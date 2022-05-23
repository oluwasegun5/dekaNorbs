package diaryTest;

import array.diary.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    Diary diary;
    @BeforeEach
    void setUp(){
        diary = new Diary("username", 1234);
    }
    @Test
    public void diaryCanBeCreated(){
        assertNotNull(diary);
    }

    @Test
    public void usernameTest(){
        assertEquals("username", diary.getUsername());
    }
    @Test
    public void writeEntryTest(){
        Diary.login(1234);

        Diary.write("my title","ok o");
        assertEquals("ok o", Diary.findByTitle("my title"));
    }

    @Test
    public void findEntryTest(){
        Diary.login(1234);
        Diary.write("my title","ok o");
        Diary.write("my name","segun");
        Diary.write("my cat","cat");

        assertEquals("cat", Diary.findByTitle("my cat"));
    }
}
