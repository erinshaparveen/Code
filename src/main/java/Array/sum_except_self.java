package Array;

import java.util.Scanner;

//Sum of Array Except Self
//Given an array of n integers where n > 1, return an array output such that output[i] is equal to the sum of all the elements of nums except nums[i]. All integers in array are greater than 0.
//
//Input Format
//First line consists of an integer n which is the number of elements in array
//
//Next n lines correspond to n elements of array
//
//Output Format
//Return the resultant array as asked in question.
//
//Example 1
//Input
//
//        4
//        4 3 2 10
//Output
//
//       15 16 17 9
//Explanation
public class sum_except_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int index = 0 ; index < length ;index++)
        {
            array[index] = sc.nextInt();
        }
        sum_except_self(array,length);
    }

    public static void sum_except_self(int[] array, int array_length)
    {
        int[] sum_array = new int[array_length];
        for(int val = 0 ; val < array_length ;val ++)
        {
            int sum = 0;
            for(int index = 0 ; index < array_length ;index++)
            {
                if(index == val)
                {
                    continue;
                }
                else
                {
                    sum = sum + array[index];
                }
            }
            sum_array[val] = sum;
        }
        for(int  i = 0 ; i < array_length ; i ++ )
        {
            System.out.print(sum_array[i]+" ");
        }
    }
}
