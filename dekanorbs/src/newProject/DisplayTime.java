package newProject;

import static newProject.OurTime.display;
import static newProject.OurTime.inputNumber;

public class DisplayTime {
    public static void main(String[] args) {

        inputNumber(3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                display();
            }
            for (int j = 0; j < 3; j++) {
                display();
            }
        }
//        display();
    }
}
