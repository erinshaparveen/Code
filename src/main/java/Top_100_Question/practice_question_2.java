package Top_100_Question;

import java.util.Scanner;

public class practice_question_2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int length = scr.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i<length ; i++)
        {
            arr[i] = scr.nextInt();
        }
        System.out.println(sum_array(arr, length));
        System.out.println(sum_array(arr, length)/length);
        System.out.println(max_value_array(arr, length));
    }
    public static int sum_array(int[] arr, int length)
    {
        int sum = 0;
        for(int i = 0 ; i < length; i++)
        {
            sum = sum+arr[i];
        }
        return sum;
    }

    public static int max_value_array(int[] arr, int length)
    {
        int val = arr[0];
        for(int i = 1 ; i < length; i++)
        {
            if(val<arr[i])
            {
                val = arr[i];
            }
        }
        return val;
    }
}
