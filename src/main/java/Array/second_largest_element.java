package Array;

import java.util.Scanner;

//2nd Largest from array
//Given an unsorted array of size N find the 2nd largest element from the array without sorting the array.
//
//Input Format
//The first line contains a single integer N.
//
//The second line consists of N integers of the array.
//
//Output Format
//Print the second largest number in the new line.
//
//        Example 1
//Input
//
//6
//        3 2 1 5 6 4
// Output
//
// 5
public class second_largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_length = sc.nextInt();
        int[] array = new int[array_length];
        for(int index = 0 ; index < array_length ; index++)
        {
            array[index] = sc.nextInt();
        }
        System.out.println(second_largest(array, array_length));
    }

    public static int second_largest(int[] arr, int length)
    {
        int second_largest_element = Integer.MIN_VALUE;
        int largest_element = Integer.MIN_VALUE;
        for(int i =0 ; i<length ; i++)
        {
            if(arr[i]>largest_element)
            {
                second_largest_element = largest_element;
                largest_element = arr[i];
            }
            if(arr[i]<largest_element && arr[i]>second_largest_element)
            {
                second_largest_element = arr[i];
            }
        }
        return second_largest_element;
    }
}
