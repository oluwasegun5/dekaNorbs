package array.diary;

public class DiaryUser {
    public static void main(String[] args) {

        Diary diary = new Diary(Diary.inputString("Username: "), Diary.inputNumber("pin: "));
        diary.user();
    }
}
