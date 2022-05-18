package chapter4;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.printf("%s %10s %10s %10s %n","N","N2","N3","N4");
        for (int i = 1; i <6; i++){
            System.out.printf("%d %10d %10d %10d\n", (int)Math.pow(i,1),(int)Math.pow(i,2),(int)Math.pow(i,3),(int)Math.pow(i,4));
        }
    }

}
