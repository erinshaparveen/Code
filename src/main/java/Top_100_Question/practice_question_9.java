package Top_100_Question;

import java.util.Scanner;

public class practice_question_9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int  i = 0 ; i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        sum_except_self(array, length);
    }
    public static void sum_except_self(int[] arr, int length)
    {
        int[] sum = new int[length];
        for(int i = 0 ; i < length ; i++)
        {
            int sum_of_value = 0;
            for(int j = 0 ; j < length ; j++)
            {
                if( i == j)
                {
                    continue;
                }
                else
                {
                    sum_of_value = sum_of_value + arr[j];
                }
            }
            sum[i] = sum_of_value;

        }
        for(int i = 0 ; i < length ; i++)
        {
            System.out.print(sum[i]+" ");
        }
    }
}
