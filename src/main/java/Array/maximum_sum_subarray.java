package Array;

import java.util.Scanner;

//Maximum Sum Subarray
//Given an array arr of size N. The task is to find the sum of the contiguous subarray within a arr with the largest sum.
//
//Input Format
//First line consists of an integer n
//
//Second line consists of n spaced integers
//
//Output Format
//Print the maximum subarray sum present in the array
//
//Example 1
//Input
//
//5
//        2 3 1 -1 0
//Output
//6
//Explanation
//
//Maximum subarray sum = 2 + 3 + 1
//
//Example 2
//Input
//
//8
//        -2 -3 4 -1 -2 1 5 -3
//Output
//
//7
public class maximum_sum_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_length = sc.nextInt();
        int[] arr = new int[arr_length];
        for(int i =0 ; i<arr_length ;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max_sum = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int num : arr) {
            max_ending_here += num;

            if (max_sum < max_ending_here)
                max_sum = max_ending_here;

            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        System.out.println(max_sum);
    }
}
