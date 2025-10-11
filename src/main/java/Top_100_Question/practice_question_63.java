package Top_100_Question;

import java.util.Scanner;

public class practice_question_63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0 ; i<length ;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(swapping_count(arr, length));
    }

    public static int swapping_count(int[] arr, int length)
    {
        int swap = 0;
        for(int i=0 ;i<length-1;i++)
        {
            for(int j =i ;j<length ;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp =arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }
        }
        return swap;
    }
}
