package Array;

import java.util.Scanner;

//Array Problem 6
//Write a program to find out the shortest distance between two even positive integers in an array arr and print the distance. If there is one or zero even positive integer in the array then return -1.
//
//Note that if the index of one even positive integer is i and the index of another even positive integer is j then their distance will be |i-j|.
//
//Input Format
//First line contains n which is the size of the array.
//Second line contains n elements of the array.
//
//Output Format
//Return the shortest distance if more than one even positive integer is present or return -1 if only one or no even positive integer is present.
//
//        Example 1
//Input
//
//2
//        1 2
//Output
//
//-1
//Explanation
//
//There is only 1 even positive integer in the array. So the output will be -1.
//Example 2
//Input
//
//5
//        2 4 1 6 7
//Output
//
//1
public class shortest_distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(shorted_distance(array, length));
    }

    public static int shorted_distance(int[] arr, int arr_length) {
        int previous_index = -1;
        int shortest_distance = Integer.MAX_VALUE;
        for(int i =0 ; i < arr_length ; i++)
        {
            if(arr[i]%2==0)
            {
                if(previous_index != -1)
                {
                    int distance = i - previous_index;
                    shortest_distance = Math.min(distance, shortest_distance);
                }
                else
                {
                    previous_index = i;
                }
            }
        }
        if(shortest_distance == Integer.MAX_VALUE)
        {
            return -1;
        }
        else {
            return shortest_distance;
        }
    }
}
