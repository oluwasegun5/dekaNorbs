package personnal;


import java.security.SecureRandom;

public class Pratice {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] number =new int[6];

        for (int i = 0; i < 60_000_000; i++) {
            int num = random.nextInt(0,6);
            number[num] = i;
        }
        System.out.printf("Face %5s \n","Frequency");
        for (int i = 0; i < number.length; i++) {
            System.out.printf("%3d %10d\n",(i+1),number[i]);
        }
    }

}
