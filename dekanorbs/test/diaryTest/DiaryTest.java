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
        diary = new Diary();
    }
    @Test
    public void diaryIsNotEmpty(){
        Diary diary = new Diary();
        assertNotNull(diary);
    }

    @Test
    public void signUpToDiary(){
        diary.signUp("segun","1234","1234");

    }

    @Test
    public void login(){
        diary.signUp("segun","1234","1234");
        diary.login("segun","1234");
    }

    @Test
    public void writeTitle(){
        diary.signUp("segun","1234","1234");
        diary.login("segun","1234");

        diary.writeNewEntry("my Title","my body");
    }

    @Test
    public void findbyTitleTest(){
        diary.signUp("segun","1234","1234");
        diary.login("segun","1234");

        diary.writeNewEntry("my Title","my body");
        diary.writeNewEntry("Title","body");
        diary.writeNewEntry("adeayo","oluwasegun");

        assertEquals("oluwasegun",diary.findByTitle("adeayo"));
    }

    @Test
    public void deleteByTitleTest(){
        diary.signUp("segun","1234","1234");
        diary.login("segun","1234");

        diary.writeNewEntry("my Title","my body");
        diary.writeNewEntry("Title","body");
        diary.writeNewEntry("adeayo","oluwasegun");
        diary.deleteEntry("adeayo");

        assertEquals("adeayo can not be found!",diary.findByTitle("adeayo"));
    }

}
