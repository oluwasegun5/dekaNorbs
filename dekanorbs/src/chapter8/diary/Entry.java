package chapter8.diary;

public class Entry {
    private static String[] entry = new String[3];

    public Entry(String date, String title, String body){
        entry[0] = date;
        entry[1] = title;
        entry[2] = body;
    }

}
