package Array;

import java.util.Scanner;

//Array Problem 1
//Ruma has given an array arr to Sima such that it consists of n elements.
//
//Ruma asks Sima to write a program to find out the index of the largest element in present in the array and print the index.
//
//Your task is to help Sima by writing a program.
//
//NOTE: Output should be in zero based indexing. If there are multiple occurences of the largest number, return the smallest index.
//
//Input Format:
//Line 1: Contains an integer 'n' indicating number of elements in array.
//
//Line 2: Contains 'n' space-seprated integer indicating elements in the array.
//
//Output Format:
//Return an integer such that it is the index of largest element in array.
//
//Example 1
//Input
//
//5
//        1 2 3 4 5
//Output
//
//4
public class largest_element_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_length = sc.nextInt();
        int[] array = new int[array_length];
        for(int index = 0 ; index < array_length ; index++)
        {
            array[index] = sc.nextInt();
        }
        System.out.println(index_largest_element(array,array_length));
    }

    public static int index_largest_element(int[] arr, int length)
    {
        int index = 0;
        int largest_element = Integer.MIN_VALUE;
        for(int i =0 ; i<length ; i++)
        {
            if(largest_element<arr[i])
            {
                largest_element = arr[i];
                index = i;
            }
        }
        return index;
    }
}
