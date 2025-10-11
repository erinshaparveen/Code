package Top_100_Question;

import java.util.Scanner;

public class Leading_zero_Problem_2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int length = scr.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i<length ; i++)
        {
            arr[i] = scr.nextInt();
        }
        int count = 0;
        for(int i = 0 ; i<length ; i++)
        {
            if(arr[i]!=0)
            {
                arr[count++] = arr[i];
            }
        }
        while(count<length)
        {
            arr[count++] = 0 ;
        }
        for(int i = 0 ; i<length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
