package Array;

import java.util.Scanner;

//Buildings
//You have given a number n, representing the size of array arr.
//
//You are required to print a building representing value of arr using *.
//
//Input Format
//First line consists of an integer n
//
//Second line consists of n spaced integers, representing elements of arr
//
//Output Format
//Output the height of the building represented by the values of array arr using *
//
//Example 1
//Input
//
//7
//        9 3 7 6 2 0 4
//Output
//
//*
//        *
//        *               *
//        *               *       *
//        *               *       *
//        *               *       *                       *
//        *       *       *       *                       *
//        *       *       *       *       *               *
//        *       *       *       *       *               *
//Explanation
//
//Number of stars in each column represents the value of that index of array arr which are tab seprated
//
//Example 2
//Input
//
//5
//        1 2 3 4 5
//Output
//
//                                        *
//                                        *       *
//                                        *       *       *
//                                        *       *       *       *
//                                        *       *       *       *       *
public class buildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ;i<length;i++)
        {
            arr[i] = sc.nextInt();
        }
        buildings(arr, length);
    }

    public static void buildings(int[] arr, int n) {
        // your code here
        int largest = largest_element(arr,n);
        for(int val = largest ;val>= 1;val--)
        {
            for(int i = 0; i< n ;i++)
            {
                if(arr[i]>=val)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

    public static int largest_element(int[] arr, int n)
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(largest<arr[i])
            {
                largest = arr[i];
            }
        }
        return largest;
    }
}
