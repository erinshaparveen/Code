package Top_100_Question;

import java.util.Scanner;

public class practice_question_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i<length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum =sc.nextInt();
        System.out.println(sum_count(arr, length, sum));
    }
    public static int sum_count(int[] arr, int length, int sum)
    {
        int count = 0;
        for(int i =0 ; i<length-1 ; i++)
        {
            if(arr[i]+arr[i+1] == sum)
            {
                count++;
            }
        }
        return count;
    }
}
