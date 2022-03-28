package myersBriggs;

public class MyersBriggs {
    public static void main(String[] args) {



        for (int questionNumber = 1; questionNumber <21 ; questionNumber++) {

            switch (questionNumber) {
                case 1 -> Myers.questionOne();
                case 2 -> Myers.questionTwo();
                case 3 -> Myers.questionThree();
                case 4 -> Myers.questionFour();
                case 5 -> Myers.questionFive();
                case 6 -> Myers.questionSix();
                case 7 -> Myers.questionSeven();
                case 8 -> Myers.questionEight();
                case 9 -> Myers.questionNine();
                case 10 -> Myers.questionTen();
                case 11 -> Myers.questionEleven();
                case 12 -> Myers.questionTwelve();
                case 13 -> Myers.questionThirteen();
                case 14 -> Myers.questionFourteen();
                case 15 -> Myers.questionFifteen();
                case 16 -> Myers.questionSixteen();
                case 17 -> Myers.questionSeventeen();
                case 18 -> Myers.questionEighteen();
                case 19 -> Myers.questionNineteen();
                case 20 -> Myers.questionTwenty();
            }

        }
        System.out.println("\n".repeat(4));

        System.out.printf("%s \t %s \t %s \t %s",Myers.getPartOne(),Myers.getPartTwo(),Myers.getPartThree(),Myers.getPartFour());
    }
}
