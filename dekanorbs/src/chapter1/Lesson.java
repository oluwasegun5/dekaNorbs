package chapter1;

//import java.util.*;
//
//public class Bowling {
//    HashMap<String, Integer> players;
//    Bowling() {
//        players = new HashMap<String, Integer>();
//    }
//    public void addPlayer(String name, int p) {
//        players.put(name, p);
//    }
//    //your code goes here
//    public String getWinner(){
//        int highest =0;
//        String name = "";
//        for(Map.Entry<String, Integer> entry: players.entrySet()) {
//            if(entry.getValue() > highest)name = entry.getKey();
//        }
//        return name;
//    }
//
//}
//
//public class Lesson {
//    public static void main(String[ ] args) {
//        Bowling game = new Bowling();
//        Scanner sc = new Scanner(System.in);
//
//        for(int i=0;i<3;i++) {
//            String input = sc.nextLine();
//            String[] values = input.split(" ");
//            String name = values[0];
//            int points = Integer.parseInt(values[1]);
//            game.addPlayer(name, points);
//        }
//        game.getWinner();
//    }
//}
class SampleDemo implements Runnable {

    private Thread t;
    private String threadName;

    SampleDemo (String threadName){
        this.threadName = threadName;
    }

    public void run()
    {
        while (true)
            System.out.print(threadName);
    }

    public void start ()
    {
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

class TestThread {

    public static void main(String args[]) {

        SampleDemo A = new SampleDemo( "A");
        SampleDemo B = new SampleDemo( "B");

        B.start();
        A.start();
    }
}