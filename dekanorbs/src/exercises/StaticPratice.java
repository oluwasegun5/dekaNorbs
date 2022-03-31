package exercises;

public class StaticPratice {

    public  int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        StaticPratice sta = new StaticPratice();

        System.out.println(sta.add(2,4));
    }
}
