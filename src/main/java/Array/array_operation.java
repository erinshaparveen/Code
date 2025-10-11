package Array;

import java.util.Scanner;

//Array Operations
//Given an array arr of size n, Write a program to find the below 3 values.
//
//Sum of all the elements in the array.
//
//Average of all the elements in the array (Give the floor value).
//
//Maximum element in the array.
//
//Input Format:
//First line contains n representing the number of elements.
//
//Next line contains n space-separated integers, representing elements of the array arr.
//
//Output Format:
//In a single line print 3 space-separated integers representing Sum, Average and Maximum among all the array elements.
//
//        Example 1
//Input
//
//        6
//        1 2 3 4 5 6
//Output
//
//        21 3 6
//Explanation:
//
//The sum of all the elements of the array 1+2+3+4+5+6 is 21, the average (1+2+3+4+5+6)/6 is 3, and the maximum among all of them is 6.
public class array_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0 ; i< n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum_of_all_element(arr));
        System.out.println(sum_of_all_element(arr)/arr.length);
        System.out.println(maximum_element(arr));
    }
    public static int sum_of_all_element(int[] num)
    {
        int sum = 0;
        for(int i=0;i<num.length;i++)
        {
            sum = sum + num[i];
        }
        return sum;
    }

    public static int maximum_element(int[] num)
    {
        int max_element = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>max_element)
                max_element = num[i];
        }
        return max_element;
    }
}
