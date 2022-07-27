package chapter17;

import java.security.SecureRandom;

public class IntStreamFilteringAndSorting {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        random.ints(50,1,1000)
                .filter(x -> x%2==1)
                .sorted()
                .forEach(System.out::println);
    }
}
