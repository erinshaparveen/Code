package Top_100_Question;

import java.util.Scanner;

public class practice_question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i < length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        print_pattern(arr, length);
    }
    public static void print_pattern(int[] arr, int length)
    {
        int max_element = max_element(arr,length);
        for(int i = max_element ; i>0 ;i--)
        {
            for(int  j = 0 ; j < length ; j++)
            {
                if(arr[j]>=i)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
    public static int max_element(int[] arr, int length)
    {
        int max_value = arr[0];
        for(int i = 1; i < length ; i ++)
        {
            if(max_value< arr[i]) {
                max_value = arr[i];
            }

        }
        return max_value;
    }
}
