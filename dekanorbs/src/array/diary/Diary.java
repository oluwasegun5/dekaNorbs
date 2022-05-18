package array.diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private boolean loggedIn = false;
    Entry entry;
    List<Entry> diary = new ArrayList<>();
    private String password;

    public void signUp(String username, String password, String confirmPassword) {
        if(password.equals(confirmPassword))this.password = password;
        this.username = username;
    }

    public void login(String username, String password) {
        if(this.username .equals(username) & this.password.equals(password)){
            loggedIn = true;
        }
    }

    public void writeNewEntry(String title, String body){
        if(loggedIn()){
            diary.add(entry=new Entry(title, body));
        }
        else System.out.println("you are not logged in!!");
    }

    private boolean loggedIn(){
        return loggedIn;
    }

    public String findByTitle(String title) {
        for (Entry value : diary) {
            if (value.getTitle().equals(title)) {
                return value.getBody();
            }
        }
        for (Entry value : diary) {
            if (!value.getTitle().equals(title)) {
                return title +" can not be found!";
            }
        }
        return "failed";
    }

    public void deleteEntry(String title) {

    }
}
