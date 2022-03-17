package tddClass;

public class Kata {



    public int add(int firstNumber, int secondNumber) {
        return  firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public double area(double radius) {
        return (int) Math.PI * Math.pow(radius,2);
    }

    public boolean isPalidrome(int number) {
        boolean palindrome = false;

        int firstNumber = number /10000;
        int
                secondNumber = (number % 10000)/1000;
        int thirdNumber = (number % 1000)/100;
        int fourthNumber = (number % 100)/10;
        int fifthNumber = number % 10;

        if (firstNumber == fifthNumber){
            if(secondNumber == fourthNumber || secondNumber == thirdNumber){
                palindrome = true;
            }
        }

        return palindrome;
    }

    public int testDrillerApp(int copies) {
        int price = 0;
        if(copies > 0 && copies < 5)price = copies * 2000;
        return price;
    }

    /*public int buyApp(int copies) {
        int price = 0;

        if(copies > 0 && copies < 5)price = 2000;
        else if(copies > 4 && copies < 10) price = 1800;
        else if(copies > 9 && copies < 30) price = 1600;
        else if(copies > 29 && copies < 50) price = 1500;
        else if(copies > 49 && copies < 100) price = 1300;
        else if(copies > 99 && copies < 200) price = 1200;
        else if(copies > 199 && copies < 500) price = 1100;
        else if(copies >499) price = 1000;

        return copies * price;
    }*/

    public int quotient(int number1, int number2) {
        int answer;

        if(number1 > number2)answer = number1/number2;
        else {
            answer = number2/number1;
        }
        return answer;
    }
}
