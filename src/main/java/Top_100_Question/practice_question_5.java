package Top_100_Question;

import java.util.Scanner;

public class practice_question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i < length ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int length2 = sc.nextInt();
        int[] arr2 = new int[length2];
        for(int i = 0 ; i < length2 ; i++)
        {
            arr2[i] = sc.nextInt();
        }
        int sum1 = sum_of_array(arr, length);
        int sum2 = sum_of_array(arr2, length2);
        if(sum1>sum2)
        {
            System.out.println("Array 1 is greater");
        }
        else if(sum1<sum2)
        {
            System.out.println(" Array 2 is greater");
        }
        else
        {
            System.out.println("Both are equal");
        }
    }

    public static int sum_of_array(int[] array, int length)
    {
        int sum = 0 ;
        for(int i = 0 ; i  <length ; i ++)
        {
            sum = sum + array[i];
        }
        return sum;
    }
}
