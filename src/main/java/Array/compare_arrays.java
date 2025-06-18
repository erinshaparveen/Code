package Array;

import java.util.Scanner;

//Array Problem 4
//Write a program to find out the difference between sum of all the elements in two arrays arr1 and arr2.
//If sum of all elements in arr1 is larger then, the output should be First array is larger,
//        if sum of all elements in arr2 is larger then, the output should be Second array is larger,
//otherwise the output should be Both are equal.
//
//Input Format
//First line contains n, size of the first array.
//
//Second line contains n elements of the first array.
//
//Third line contains m, size of the second array.
//
//Fourth line contains m elements of the second array.
//
//n and m will always be equal.
//
//        Output Format
//Print the output as per difference.
//
//Example 1
//Input
//
//2
//        1 2
//        2
//        3 4
//Output
//
//Second array is larger
//Explanation
//
//Overall sum of first array is 1+2 = 3
//Overall sum of second array is 3+4 = 7
//Thus, second array is larger
//
//Example 2
//Input
//
//3
//        1 2 10
//        3
//        3 4 1
//Output
//
//First array is larger
public class compare_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st Array
        int array1_length = sc.nextInt();
        int[] array1 = new int[array1_length];
        for(int arr1 = 0 ; arr1 < array1_length ;arr1++)
        {
            array1[arr1] = sc.nextInt();
        }

        // 2nd Array
        int array2_length = sc.nextInt();
        int[] array2 = new int[array2_length];
        for(int arr2 = 0 ; arr2 < array2_length ;arr2++)
        {
            array2[arr2] = sc.nextInt();
        }

        int sum1 = sum_of_array(array1, array1_length);
        int sum2 = sum_of_array(array2, array2_length);

        if (sum1 > sum2) {
            System.out.println("First array is larger");
        } else if (sum1 < sum2) {
            System.out.println("Second array is larger");
        } else {
            System.out.println("Both are equal");
        }
    }

    public static int sum_of_array(int[] array,  int length)
    {
        int sum = 0;
        for(int i = 0 ; i < length ; i++)
        {
            sum = sum + array[i];
        }
       return sum;
    }
}
