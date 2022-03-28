package exercises;

public class MyersBriggs {
    public static void main(String[] args) {

        int partOneA = 0;
        int partOneB = 0;
        int partTwoA = 0;
        int partTwoB = 0;
        int partThreeA = 0;
        int partThreeB = 0;
        int partFourA = 0;
        int partFourB = 0;

        for (int questionNumber = 1; questionNumber <21 ; questionNumber++) {

            switch (questionNumber){
                case 1:
                    String partOne = MyersBriggsClass.question1();
                    if (partOne .equals("A")) partOneA++;
                    else partOneB++;
                    break;
                case 2:
                    String partTwo = MyersBriggsClass.question2();
                    if (partTwo .equals("A")) partTwoA++;
                    else partTwoB++;
                    break;
                case 3:
                    String partThree = MyersBriggsClass.question3();
                    if (partThree .equals("A")) partThreeA++;
                    else partThreeB++;
                    break;
                case 4:
                    String partFour = MyersBriggsClass.question4();
                    if (partFour .equals("A")) partFourA++;
                    else partFourB++;
                    break;
                case 5:
                    partOne = MyersBriggsClass.question5();
                    if (partOne .equals("A")) partOneA++;
                    else partOneB++;
                    break;
                case 6:
                    partTwo = MyersBriggsClass.question6();
                    if (partTwo .equals("A")) partTwoA++;
                    else partTwoB++;
                    break;
                case 7:
                    partThree = MyersBriggsClass.question7();
                    if (partThree .equals("A")) partThreeA++;
                    else partThreeB++;
                case 8:
                    partFour = MyersBriggsClass.question8();
                    if (partFour .equals("A")) partFourA++;
                    else partFourB++;
                    break;
                case 9:
                    partOne = MyersBriggsClass.question9();
                    if (partOne .equals("A")) partOneA++;
                    else partOneB++;
                    break;
                case 10:
                    partTwo = MyersBriggsClass.question10();
                    if (partTwo .equals("A")) partTwoA++;
                    else partTwoB++;
                    break;
                case 11:
                    partThree = MyersBriggsClass.question11();
                    if (partThree .equals("A")) partThreeA++;
                    else partThreeB++;
                case 12:
                    partFour = MyersBriggsClass.question12();
                    if (partFour .equals("A")) partFourA++;
                    else partFourB++;
                    break;
                case 13:
                    partOne = MyersBriggsClass.question13();
                    if (partOne .equals("A")) partOneA++;
                    else partOneB++;
                    break;
                case 14:
                    partTwo = MyersBriggsClass.question14();
                    if (partTwo .equals("A")) partTwoA++;
                    else partTwoB++;
                    break;
                case 15:
                    partThree = MyersBriggsClass.question15();
                    if (partThree .equals("A")) partThreeA++;
                    else partThreeB++;
                case 16:
                    partFour = MyersBriggsClass.question16();
                    if (partFour .equals("A")) partFourA++;
                    else partFourB++;
                    break;
                case 17:
                    partOne = MyersBriggsClass.question17();
                    if (partOne .equals("A")) partOneA++;
                    else partOneB++;
                    break;
                case 18:
                    partTwo = MyersBriggsClass.question18();
                    if (partTwo .equals("A")) partTwoA++;
                    else partTwoB++;
                    break;
                case 19:
                    partThree = MyersBriggsClass.question19();
                    if (partThree .equals("A")) partThreeA++;
                    else partThreeB++;
                case 20:
                    partFour = MyersBriggsClass.question20();
                    if (partFour .equals("A")) partFourA++;
                    else partFourB++;
                    break;
            }

        }
    }


    public static void print(String text){
        System.out.println(text);
    }
}
