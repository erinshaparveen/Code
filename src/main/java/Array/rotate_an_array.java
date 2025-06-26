package Array;

import java.util.Scanner;

//Rotate array
//Given an array with N elements, the task is to rotate the array to the right by K steps.
//
//Note : if K is negative , rotate the array to the left.
//
//Input Format
//The first line contains an integer N representing the size of the array.
//
//The second line contains N space-separated integers representing the elements of the array.
//
//The last line contains an integer K representing the number of times the array has to be rotated in the right direction if k is positive , otherwise to the left if k is negative.
//
//        Output Format
//The only line of the output prints N space-separated integers representing the Rotated array elements.
//
//        Example 1
//Input
//
//
//8
//        7 5 2 11 2 43 1 1
//        2
//
//Output
//
//1 1 7 5 2 11 2 43
public class rotate_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr =  new int[length];
        for(int i = 0; i< length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int rotation_count = sc.nextInt();
        left_rotate_array(arr, length, rotation_count);
        System.out.println();
        right_rotate_array(arr, length, rotation_count);
    }

//    left rotation
    public static void left_rotate_array(int[] arr, int arr_length, int rotation_count)
    {
        int value = 1;
        while(value<=rotation_count)
        {
            int first = arr[0];
            for(int i = 0 ; i < arr_length-1 ; i++)
            {
                arr[i] = arr[i+1];
            }
            arr[arr_length-1] = first;
            value++;
        }
        for(int i = 0 ; i < arr_length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

//    right rotation
    public static void right_rotate_array(int[] arr, int arr_length, int rotation_count)
    {
        int value = 1;
        while(value<=rotation_count)
        {
            int last = arr[arr_length-1];
            for(int i = arr_length-1 ; i > 0 ; i--)
            {
                arr[i] = arr[i-1];
            }
            arr[0] = last;
            value++;
        }
        for(int i = 0 ; i < arr_length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
