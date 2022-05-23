package array.diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();
    String[] entries = new String[3];

    public Entry(){
        entries[0] = dtf.format(now);
    }
    public void writeTitle(String title) {
        entries[1] = title;
    }

    public void writeBody(String body) {
        entries[2] = body;
    }

    public String getTitle() {
        return entries[1];
    }

    public String getBody() {
        return entries[2];
    }
    public String getDate(){
        return entries[0];
    }
}
