package newProject;

import java.util.Arrays;

public class justTime {
    static String[][] segments = new String[5][4];

    private static void setA(){
        Arrays.fill(segments[0], "# ");
    }
    private static void setB(){
        for (int i =0;i<3;i++){
            segments[i][3] = "# ";
        }
    }
    private static void setC(){
        for (int i =2;i<5;i++){
            segments[i][3] = "# ";
        }
    }
    private static void setD(){
        Arrays.fill(segments[4], "# ");
    }
    private static void setE(){
        for (int i =2;i<5;i++){
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

}
