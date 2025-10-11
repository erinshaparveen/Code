package Array;

import java.util.Scanner;

//Array Adding
//You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent the digits of two numbers.
//
//You are required to add the numbers represented by two arrays and return the resultant arrays. n1 and n2 are of diferent size
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
//Add the two numbers and return the resultant array
//
//Example 1
//Input
//
//        3
//        1 2 3
//        3
//        3 2 1
//Output
//
//        4
//        4
//        4
public class adding_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array One
        int arr_1_length = sc.nextInt();
        int[] arr_1 = new int[arr_1_length];
        for(int i =0 ; i< arr_1_length ; i++)
        {
            arr_1[i] = sc.nextInt();
        }

        // Array Two
        int arr_2_length = sc.nextInt();
        int[] arr_2 = new int[arr_2_length];
        for(int i =0 ; i< arr_2_length ; i++)
        {
            arr_2[i] = sc.nextInt();
        }

        // length of the array that contain the sum
        int k = Math.max(arr_1_length , arr_2_length);
        int length = k ;
        int[] array_sum = new int[k];
        arr_1_length--;
        arr_2_length --;
        k--;
        int carry = 0;
        while(arr_1_length>=0 && arr_2_length>=0)
        {
            int val = arr_1[arr_1_length] + arr_2[arr_2_length] + carry;
            array_sum[k] = val%10;
            carry = val/10;
            arr_1_length--;
            arr_2_length--;
            k--;
        }
        while(arr_1_length>=0)
        {
            int val = arr_1[arr_1_length] + carry;
            array_sum[k] = val%10;
            carry = val/10;
            arr_1_length--;
            k--;
        }
        while(arr_2_length>=0)
        {
            int val = arr_2[arr_2_length] + carry;
            array_sum[k] = val%10;
            carry = val/10;
            arr_2_length--;
            k--;
        }
        if(carry != 0)
        {
            int final_array_length = length+1;
            int[] final_array = new int[final_array_length];
            final_array[0] = carry;
            for(int i = 1 ; i < final_array_length ; i ++ ){
                final_array[i] = array_sum[i-1];
            }
            for(int i = 0 ; i < final_array_length ; i ++ ){
                System.out.println(final_array[i]);
            }
        }
        else
        {
            for(int i =0 ; i < length ; i++)
            {
                System.out.println(array_sum[i]);
            }
        }
    }
}
