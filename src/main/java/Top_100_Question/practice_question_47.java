package Top_100_Question;

import java.util.Scanner;

public class practice_question_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int  i = 0 ; i< length ;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(sum_digit_count(arr, length, target));
    }

    public static int sum_digit_count(int[] arr, int length, int traget)
    {
        int count = 0 ;
        for(int i = 0 ;i <length-1 ;i++)
        {
            for(int j = i+1; j<length ;j++)
            {
                if((arr[i]+arr[j])%traget == 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
