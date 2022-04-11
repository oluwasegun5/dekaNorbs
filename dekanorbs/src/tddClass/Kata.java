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

    public boolean isPalindrome(int number) {
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

    public int quotient(int number1, int number2) {
        int answer;

        if(number1 > number2)answer = number1/number2;
        else {
            answer = number2/number1;
        }
        return answer;
    }
    public boolean isEven(int num) {
        boolean result;

        result = num % 2 == 0;
        return result;
    }

    public int biggestOfFiveNumbers(int number1, int number2, int number3, int number4, int number5) {
        int number = 0;
        if(number1 > number)number = number1;
        if(number2 > number)number = number2;
        if(number3 > number)number = number3;
        if(number4 > number)number = number4;
        if(number5 > number)number = number5;
        return number;

    }


    public int factors(int number) {
        int count = 0;
        int initial = 1;

        for(int num = 1; num < number+1; num++){


            if(number % initial == 0){
                count ++;
            }
            initial ++;
        }

        return count;
    }

    public boolean isPrimeNumber(int number) {

        boolean result = false;
        int count = 1;
        int initial = 1;

        for(int num = 1; num < number; num++){

            if(number % initial == 0){
                count ++;
            }
            initial ++;
        }
        if (count <= 2) result = true;
        return  result;
    }

    public int findMaximumFrom(int[] array) {
        int maximum = 0;
        for (int j : array) {
            if (j > maximum) maximum = j;
        }
        return maximum;
    }

    public int findMinimumFrom(int[] array) {
        int minimum = array[0];
        for (int j : array) {
            if (j < minimum) minimum = j;
        }
        return minimum;
    }

    private int findSumFrom(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public int findAverageFrom(int[] array) {
        return findSumFrom(array)/array.length;

    }
}
