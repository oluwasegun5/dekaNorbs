package chapter6;

public class LeapYearChecker {
    public static void main(String[] args) {
        System.out.println(isLeapYear(366));
    }
    public static boolean isLeapYear(int year){
        return year == 366;
    }
}
