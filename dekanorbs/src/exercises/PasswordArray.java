package exercises;

import java.util.Random;

public class PasswordArray {
    public static void main(String[] args) {

        Random random = new Random();
        String letters ="abcdefghijklmnopqrstuvwxyz";
        String upperLetters = letters.toUpperCase();
        
        String[] password = new String[9];
        String[] lowerAlphabet = new String[letters.length()];
        String[] upperAlphabet = new String[letters.length()];

        for (int i = 0; i < letters.length(); i++) {
            lowerAlphabet[i] = String.valueOf(letters.charAt(i));
        }
        for (int i = 0; i < letters.length(); i++) {
            upperAlphabet[i] = String.valueOf(upperLetters.charAt(i));
        }

        for (int i = 0; i < 9; i++) {
            String lowerLetter = lowerAlphabet[random.nextInt(1,26)];
            String upperLetter = upperAlphabet[random.nextInt(1,26)];
            int number = random.nextInt(9);

            switch (number) {
                case 0 -> password[i] = lowerLetter;
                case 1 -> password[i] = upperLetter;
                case 2 -> password[i] = String.valueOf(number);
                case 3 -> password[i] = String.valueOf(number);
                case 4 -> password[i] = upperLetter;
                case 5 -> password[i] = lowerLetter;
                case 6 -> password[i] = String.valueOf(number);
                case 7 -> password[i] = upperLetter;
                case 8 -> password[i] = lowerLetter;
            }
        }
        for (String s : password) {
            System.out.print(s);
        }
//        System.out.println(Arrays.toString(password));
    }
}
