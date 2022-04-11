package array;

public class ArrayToThreeHundred {
    public static void main(String[] args) {
        int[] arrayNumber = new int[300];

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = i + 1;
        }

        for (int i = 0; i < arrayNumber.length-1; i++) {
            System.out.print(arrayNumber[i]+", ");
        }
        System.out.println(arrayNumber[299]);
    }
}
