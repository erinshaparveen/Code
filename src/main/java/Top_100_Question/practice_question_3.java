package Top_100_Question;

import java.util.Scanner;

public class practice_question_3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int length = scr.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scr.nextInt();
        }

        int length2 = scr.nextInt();
        int[] arr2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            arr2[i] = scr.nextInt();
        }

        int max_length = Math.max(length, length2);
        int[] sub_array = new int[max_length];
        arr = padding(arr,max_length);
        arr2 = padding(arr2, max_length);
        int borrow = 0;
        int val = 0 ;
        for(int i = max_length-1 ; i >= 0 ; i--)
        {
            val = arr[i]-arr2[i]-borrow;
            if(val < 0)
            {
                val =val+10;
                borrow = 1;
            }
            else
            {
                borrow = 0;
            }
            sub_array[i] =val;

        }
        for(int i = 0 ; i < max_length ; i++)
        {
            System.out.print(sub_array[i]+" ");
        }
    }
    public static int[] padding(int[] arr, int max_length)
    {
        int[] padd = new int[max_length];
        System.arraycopy(arr, 0 , padd,max_length-arr.length,arr.length);
        return padd;
    }
}
