package Coforge;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ; i< length-1 ;i++)
        {
            array[i] = sc.nextInt();
        }
        int expectedSum = length*(length+1)/2;
        int actualSum = 0;
        for(int i =0 ; i <length ; i++)
        {
            actualSum = actualSum+array[i];
        }
        System.out.println(expectedSum - actualSum);
    }
}
