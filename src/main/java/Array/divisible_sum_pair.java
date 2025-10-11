package Array;
import java.util.Scanner;
//Divisible Sum Pairs
//Given an array of integers, arr, and a positive integer k, determine the number of (i,j) pairs in the array where i<j and arr[i] + arr[j] is divisible by k.
//
//Input Format
//Input consists of two lines.
//
//The first line contains 2 space-separated integers, n (size of array) and k.
//
//The second line contains n space-separated integers, each a value of arr[i].
//
//Output Format
//Print the number of pairs a[i] + a[j] divisble by k, where i<j.
//Example 1
//Input
//
//6 3
//        1 3 2 6 1 2
//Output
//
//5
public class divisible_sum_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int target_value = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(divisible_sum_pair_count(arr, length, target_value));
    }

    public static int divisible_sum_pair_count(int[] arr, int arr_length, int target_value)
    {
        int count = 0;
        for(int i = 0; i<arr_length; i++)
        {
            for(int j = i+1; j<arr_length;j++)
            {
                if((arr[i]+arr[j])%target_value == 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
