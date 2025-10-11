package Array;

import java.util.Arrays;
import java.util.Scanner;

//Array Subtracting
//You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent digits of two numbers.
//
//You are required to subtract the numbers represented by two arrays and print the arrays. n1 and n2 can be of different sizes
//
//Input Format
//First line consists of an integer n1
//
//Second line consists of n1 spaced integers, representing elements of arr1
//
//Third line consists of an integer n2
//
//Fourth line consists of n2 spaced integers, representing elements of arr2
//
//Output Format
//Subtract the two numbers and print the array
//
//Example 1
//Input
//
//        3
//        3 2 1
//        3
//        1 2 3
//Output
//
//        1
//        9
//        8
public class array_substraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1_length = sc.nextInt();
        int[] arr1 = new int[arr1_length];
        for(int i =0 ; i <arr1_length ;i++)
        {
            arr1[i] = sc.nextInt();
        }
        int arr2_length = sc.nextInt();
        int[] arr2 = new int[arr2_length];
        for(int i =0 ; i <arr2_length ;i++)
        {
            arr2[i] = sc.nextInt();
        }

        int max_length = Math.max(arr1_length, arr2_length);

        arr1 = padding(arr1,max_length);
        arr2 = padding(arr2 , max_length);

        int borrow = 0;
        int[] final_result = new int[max_length];

        for(int i=max_length-1 ;  i>=0 ; i--)
        {
            int val = arr1[i] - arr2[i] - borrow;
            if(val<0)
            {
                val = val+10;
                borrow = 1;
            }
            else
            {
                borrow = 0;
            }
            final_result[i] = val;
        }
        for(int i = 0 ; i < final_result.length ; i++)
        {
            System.out.println(final_result[i]);
        }

    }

    public static int[] padding(int[] arr, int length)
    {
        int[] padd = new int[length];
        System.arraycopy(arr , 0, padd, length-arr.length, arr.length);
        return padd;
    }
}
