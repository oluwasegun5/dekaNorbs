package myersBriggs;

public class Myers {

    static int partOneA = 0;
    static int partOneB = 0;
    static int partTwoA = 0;
    static int partTwoB = 0;
    static int partThreeA = 0;
    static int partThreeB = 0;
    static int partFourA = 0;
    static int partFourB = 0;

    private static String partOne;
    private static String partTwo;
    private static String partThree;
    private static String partFour;


    public static void questionOne(){
        String one = MyersBriggsClass.question1();
        if (one.equals("A")) partOneA++;
        else partOneB++;
    }
    public static void questionTwo(){
        String two = MyersBriggsClass.question2();
        if (two.equals("A")) partTwoA++;
        else partTwoB++;
    }

    public static void questionThree(){
        String three = MyersBriggsClass.question3();
        if (three.equals("A")) partThreeA++;
        else partThreeB++;
    }
    public static void questionFour(){
        String four = MyersBriggsClass.question4();
        if (four.equals("A")) partFourA++;
        else partFourB++;
    }
    public static void questionFive(){
        String one = MyersBriggsClass.question5();
        if (one.equals("A")) partOneA++;
        else partOneB++;
    }
    public static void questionSix(){
        String two = MyersBriggsClass.question6();
        if (two.equals("A")) partTwoA++;
        else partTwoB++;
    }
    public static void questionSeven(){
        String three = MyersBriggsClass.question7();
        if (three.equals("A")) partThreeA++;
        else partThreeB++;
    }
    public static void questionEight(){
        String four = MyersBriggsClass.question8();
        if (four.equals("A")) partFourA++;
        else partFourB++;
    }
    public static void questionNine(){
        String one = MyersBriggsClass.question9();
        if (one.equals("A")) partOneA++;
        else partOneB++;
    }
    public static void questionTen(){
        String two = MyersBriggsClass.question10();
        if (two.equals("A")) partTwoA++;
        else partTwoB++;
    }
    public static void questionEleven(){
        String three = MyersBriggsClass.question11();
        if (three.equals("A")) partThreeA++;
        else partThreeB++;
    }
    public static void questionTwelve(){
        String four = MyersBriggsClass.question12();
        if (four.equals("A")) partFourA++;
        else partFourB++;
    }
    public static void questionThirteen(){
        String one = MyersBriggsClass.question13();
        if (one.equals("A")) partOneA++;
        else partOneB++;
    }
    public static void questionFourteen(){
        String two = MyersBriggsClass.question14();
        if (two.equals("A")) partTwoA++;
        else partTwoB++;
    }
    public static void questionFifteen(){
        String three = MyersBriggsClass.question15();
        if (three.equals("A")) partThreeA++;
        else partThreeB++;
    }
    public static void questionSixteen(){
        String four = MyersBriggsClass.question16();
        if (four.equals("A")) partFourA++;
        else partFourB++;
    }
    public static void questionSeventeen(){
        String one = MyersBriggsClass.question17();
        if (one.equals("A")) partOneA++;
        else partOneB++;
    }
    public static void questionEighteen(){
        String two = MyersBriggsClass.question18();
        if (two.equals("A")) partTwoA++;
        else partTwoB++;
    }
    public static void questionNineteen(){
        String three = MyersBriggsClass.question19();
        if (three.equals("A")) partThreeA++;
        else partThreeB++;
    }
    public static void questionTwenty(){
        String four = MyersBriggsClass.question20();
        if (four.equals("A")) partFourA++;
        else partFourB++;
    }



    public static String getPartOne(){
        if(partOneA > partOneB)partOne ="E";
        else partOne ="I";
        return partOne;
    }
    public static String getPartTwo(){
        if(partTwoA > partTwoB)partTwo ="S";
        else partTwo ="N";
        return partTwo;
    }
    public static String getPartThree(){
        if(partThreeA > partThreeB)partThree ="T";
        else partThree ="F";
        return partThree;
    }
    public static String getPartFour(){
        if(partFourA > partFourB)partFour ="J";
        else partFour ="P";
        return partFour;
    }

}
