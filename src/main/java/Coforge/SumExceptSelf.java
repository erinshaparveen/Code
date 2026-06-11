package Coforge;

import java.util.Scanner;

public class SumExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i =0 ;i<length ;i++)
        {
            array[i] = sc.nextInt();
        }
        int j = 0 ;
        int[] sumArray = new int[length];
        for(int i = 0 ; i < length; i++)
        {
            int sum = 0;
            for(int val = 0 ; val <length ; val++)
            {
                if(val == j)
                {
                    continue;
                }
                else
                {
                    sum = sum+array[val];
                }
            }
            sumArray[i] = sum;
            j++;
        }

        for(int i = 0 ; i < length; i++)
        {
            System.out.println(sumArray[i]);
        }
    }
}
