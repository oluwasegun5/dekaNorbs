package exercises;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("press ok to go to Menu");
        String response = input.next();


            int menu = NokiaClass.menu();
            switch(menu){
                case 1:
                    NokiaClass.phoneBook();
                    break;
                case 2:
                    NokiaClass.messages();
                    break;
                case 3:
                    System.out.println("Chat");
                    break;

            }

        //phone.phoneBook(phone.menu());
    }
}
