package array.diary;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Entry {
    String[] entries = new String[3];
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public Entry(){
        entries[2] = formatter.format(date);
    }
    public Entry(String title, String body){
        entries[0] = title;
        entries[1] = body;
        entries[2] = formatter.format(date);
    }
    public void writeTitle(String title) {
        entries[0] = title;
    }

    public String getTitle() {
        return entries[0];
    }

    public void writeBody(String body) {
        entries[1] = body;
    }

    public String getBody() {
        return entries[1];
    }

    public String getDate() {
        return formatter.format(date);
    }
}
