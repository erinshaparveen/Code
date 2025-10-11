package Array;

import java.util.Scanner;

//Largest Number At Least Twice of Others
//You are given an integer array nums of size n where the largest integer is unique. Your task is to determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, print the index of the largest element, or print -1 otherwise.
//
//        Input Format
//The first line of the input contains the number n(length of the array),
//
//The next line contains n space separated integers denoting the elements of the array.
//
//Output Format
//Print the index of the element if it satisfies the condition else print -1
//
//Example 1
//Input
//
//4
//        3 6 1 0
//Output
//1
public class largest_number_twice_other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0; i<length;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(largest_twice_other(array , length));
    }

    public static int largest_twice_other(int[] arr, int length)
    {
        int largest_element_index = largest_element(arr , length);
        int index = -1;
        boolean flag = true;
        for(int i = 0 ; i < length ; i ++)
        {
            if( i == largest_element_index)
            {
                continue;
            }
            else {
                if(arr[i]*2 <= arr[largest_element_index])
                {

                }
                else {
                    flag = false;
                }
            }
        }
        if(flag)
        {
            index = largest_element_index;
        }

        return index;

    }
    public static int largest_element(int[] arr, int length)
    {
        int largest = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0 ;i < length;i++)
        {
            if(largest<arr[i])
            {
                largest = arr[i];
                index = i;
            }
        }
        return index;
    }
}
