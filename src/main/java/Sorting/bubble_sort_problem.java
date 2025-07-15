package Sorting;

import java.util.Scanner;

//Bubble Sort Problem
//Consider the following version of Bubble Sort:
//
//        for (int i = 0; i < n; i++) {
//        for (int j = 0; j < n - 1; j++) {
//        // Swap adjacent elements if they are in decreasing order
//        if (a[j] > a[j + 1]) {
//swap(a[j], a[j + 1]);
//        }
//                }
//                }
//Print three values in separate lines:
//
//Number of swaps it took to sort the array using the above algorithm.
//
//First element in the array after sorting the array.
//
//Last element in the array after sorting the array.
//
//        Input Format
//The first line contains an integer, n, the size of the array a.
//
//The second line contains n space-separated integers representing array a .
//
//        Output Format
//Print the required three values.
//
//        Example 1
//Input
//
//3
//        6 4 1
//Output
//
//3
//        1
//        6
//Explanation
//
//[6,4,1]
//
//swap    a
//0       [6,4,1]
//        1       [4,6,1]
//        2       [4,1,6]
//        3       [1,4,6]
//
//The steps of the bubble sort are shown above. It took 3 swaps to sort the array.
//
//        Example 2
//Input
//
//3
//        1 2 3
//Output
//
//0
//        1
//        3
public class bubble_sort_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ;i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        swapping(array, length);
    }

    public static void swapping(int[] array, int length)
    {
        int swap_count = 0;
        for(int i = 0 ; i < length ; i++)
        {
            for(int j = 0 ; j < length-1 ; j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap_count++;
                }
            }
        }
        System.out.println(swap_count);
        System.out.println(array[0]);
        System.out.println(array[length - 1]);
    }
}
