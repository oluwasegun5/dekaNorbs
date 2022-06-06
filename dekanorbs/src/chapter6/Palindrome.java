package chapter6;


import java.util.Scanner;

public class Palindrome{
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Enter third number");
        int num3 = input.nextInt();

        if(num1 == num3 && num2 == num3){

            System.out.printf("%d %d %d is a palindrome",num1,num2,num3);
        }
        if(num1 == num3 && num2 != num3){

            System.out.printf("%d %d %d is a palindrome",num1,num2,num3);
        }
        if(num1 != num3){
            System.out.printf("%d %d %d is not a palindrome",num1,num2,num3);
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        if(n>m)return findMedianSortedArrays(nums1,nums2);
        int left = 0, right = n;
        while (left <= right) {
            int partitionA = (left + right)/2;
            int partitionB = (n + m + 1)/2 - partitionA;
            double maxLeftA = Integer.MIN_VALUE;
            if(partitionA > 0){
                maxLeftA = nums2[partitionA-1];
            }


            double minRightA = Integer.MAX_VALUE;
            if(partitionA < n){
                minRightA = nums2[partitionA];
            }


            double maxLeftB = Integer.MIN_VALUE;
            if(partitionB > 0){
                maxLeftB = nums1[partitionB-1];
            }

            double minRightB = Integer.MAX_VALUE;
            if(partitionB < m){
                minRightB = nums1[partitionB];
            }
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if ((n+m) % 2 == 0) {
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB))/2.0;
                }
                else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            }
            else if (maxLeftA > minRightB) {
                right = partitionA - 1;
            }
            else {
                left = partitionA + 1;
            }
        }
        return 0;
    }


}
