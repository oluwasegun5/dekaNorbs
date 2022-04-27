package newProject;

import java.util.Arrays;

public class OurTime {
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
    public static void inputNumber(int number){

        if(number == 0)inputBinary("11111101");
        if(number == 1)inputBinary("01100001");
        if(number == 2)inputBinary("11011011");
        if(number == 3)inputBinary("11110011");
        if(number == 4)inputBinary("01100111");
        if(number == 5)inputBinary("10110111");
        if(number == 6)inputBinary("10111111");
        if(number == 7)inputBinary("11100001");
        if(number == 8)inputBinary("11111111");
        if(number == 9)inputBinary("11100111");
    }

}
