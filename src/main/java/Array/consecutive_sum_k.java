package Array;

import java.util.Scanner;

//Array Problem 5
//Karan has an array arr and an integer k. He wants to find out the number of consecutive pairs of array elements whose sum will be k.
//
//Write a program to count the number of consecutive pairs.
//
//Note that, if arr[5]={1,2,3,4,5} then consecutive pairs are (1,2),(2,3),(3,4),(4,5).
//
//Input Format
//The first line contains n, the size of the array, and a positive integer k.
//
//The second line contains n elements of the array.
//
//        Output Format
//Return the number of consecutive pairs whose sum will be equal to k.
//
//        Example 1
//Input
//
//4 3
//        1 2 4 3
//Output
//1
public class consecutive_sum_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_length = sc.nextInt();
        int sum_value = sc.nextInt();
        int[] array = new int[array_length];
        for(int val = 0; val<array_length; val++)
        {
            array[val] = sc.nextInt();
        }
        System.out.println(consecutive_count(array , sum_value, array_length));
    }

    public static int consecutive_count(int[] arr , int sum, int length)
    {
        int count=0;
        for(int i=0;i<length-1;i++)
        {
            if(arr[i]+arr[i+1]==sum)
            {
                count++;
            }
        }
       return count;
    }
}
