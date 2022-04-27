package array.sevenSegment;
import java.util.Arrays;

public class Segment {
    static String[][] segments = new String[5][4];

    private static void setA(){
            Arrays.fill(segments[0], "# ");
    }
    private static void setB(){
        for(int i=0;i<3;i++){
                segments[i][3] = "# ";
        }
    }
    private static void setC(){
        for(int i=2;i<5;i++){
            segments[i][3] = "# ";
        }
    }
    private static void setD(){
        Arrays.fill(segments[4], "# ");
    }
    private static void setE(){
        for(int i=2;i<5;i++){
            segments[i][0] = "# ";
        }
    }
    private static void setF(){
        for(int i=0;i<3;i++){
            segments[i][0] = "# ";
        }
    }
    private static void setG(){
        Arrays.fill(segments[2],"# ");
    }
    private static void setDefault(){
        for (String[] segment : segments) {
            Arrays.fill(segment, "  ");
        }
    }
    public static void display(){
        for (String[] segment : segments) {
            for (String s : segment) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

    public static void inputBinary(String input){
        setDefault();
        if(input.charAt(7) == '1'){

            if(input.charAt(0) == '1') setA();
            if(input.charAt(1) == '1') setB();
            if(input.charAt(2) == '1') setC();
            if(input.charAt(3) == '1') setD();
            if(input.charAt(4) == '1') setE();
            if(input.charAt(5) == '1') setF();
            if(input.charAt(6) == '1') setG();

        }
    }

}
