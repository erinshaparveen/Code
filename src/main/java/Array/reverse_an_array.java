package Array;

import java.util.Scanner;

//Reverse an array
//You are given an array arr of length n. You have to come up with an in-place solution.
//
//Input Format
//The first line of input contains an integer n, size of the array.
//
//The next line contains n space-separated integers denoting the elements of the array.
//
//Output Format
//Printing is handled by the main function you just have to come up with an inplace solution.
//
//        Example 1:
//Input
//
//4
//        1 3 5 7
public class reverse_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_length = sc.nextInt();
        int[] arr = new int[arr_length];
        for(int i =0 ; i< arr_length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int initial = 0;
        int final_point = arr_length-1;
        while(initial<=final_point)
        {
            int temp = arr[initial];
           arr[initial] = arr[final_point];
           arr[final_point] = temp;
            initial++;
            final_point--;
        }
        for(int i =0 ; i<arr_length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

}
