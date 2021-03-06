package tddClass;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {

    private Kata kata;
    @Test
    @BeforeEach
    public void set(){
        kata = new Kata();
    }

    @Test
    public void addTest(){

        int actual = kata.add(7,8);

        assertEquals(15,actual);
    }

    @Test
    public void subtractTest(){

        Kata calculator = new Kata();

        int actual = calculator.subtract(8,7);

        assertEquals(1,actual);
    }

    @Test
    public void areaOfCircleTest(){

        Kata calculator = new Kata();

        double area = calculator.area(7.0);

        assertEquals(147,area);
    }

    @Test
    public  void palindromeTest(){
        //given
        Kata palindrome = new Kata();
        //when

        //assert
        assertTrue(palindrome.isPalindrome(12321));
    }
    
    @Test
    public void quotientOfNumbersTest (){
        //given
        Kata kata = new Kata();
        //when
        //kata.quotient(25,5);
        //assert
        assertEquals(2,kata.quotient(2,4));
    }
    @Test
    public void test(){
        int number = 2;
        while (number <= 98){
            System.out.print(number+ ", ");
            number = number + 2;
        }
        System.out.println(100+".....");
    }
    @Test
    public void testDrillerTest(){
        //given
        kata.testDrillerApp(4);
        //when
        int price = kata.testDrillerApp(4);
        //assert
        assertEquals(8000,price);
    }
    @Test
    public void  oddEven(){
        Kata evenOdd = new Kata();

        evenOdd.isEven(5);

        boolean result = evenOdd.isEven(877);

        assertFalse(result);

    }
    @Test
    public void biggestOfFiveNumbers(){

        Kata kata = new Kata();

        int result = kata.biggestOfFiveNumbers(1987654,26586765,3686886,7576767,47474746);
        assertEquals(47474746,result);
    }
    @Test
    public  void factorsOfANumberTest(){

        int result = kata.factors(14);

        assertEquals(4,result);
    }

    @Test
    public void primeNumbersTest(){

        assertTrue(kata.isPrimeNumber(31));
    }
    @Test
    public void maximumNumberInArrayTest(){
        int[] score = {34,23,14,45,23};

        assertEquals(45,kata.findMaximumFrom(score));
    }
    @Test
    public void minimumNumberInArrayTest(){
        int[] score = {34,23,14,45,23};

        assertEquals(14,kata.findMinimumFrom(score));
    }
    @Test
    public void averageNumberInArrayTest(){
        int[] score = {34,23,14,45,23};
        assertEquals(27,kata.findAverageFrom(score));
    }

    @Test
    public void collectInput(){
        String name = "segun";

        assertEquals("segun",kata.putName(name));
    }

}
