package Top_100_Question;

import java.util.Scanner;

public class practice_question_1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int length = scr.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i<length ; i++)
        {
            arr[i] = scr.nextInt();
        }

        int length2 = scr.nextInt();
        int[] arr2 = new int[length2];
        for(int i = 0 ; i<length2 ; i++)
        {
            arr2[i] = scr.nextInt();
        }
        int length3 = Math.max(length,length2);
        int[] array_sum = new int[length3+1];
        array_sum[0] = 0;
        length--;
        length2--;
        length3--;
        int carry = 0;
        while(length>=0 && length2>=0)
        {
            array_sum[length3] = (arr[length]+arr2[length2]+carry)%10;
            carry = (arr[length]+arr2[length2]+carry)/10;
            length--;
            length2--;
            length3--;
        }
        while(length>=0)
        {
            array_sum[length3] = (arr[length]+carry)%10;
            carry = (arr[length]+carry)/10;
            length--;
            length3--;
        }
        while(length2>=0)
        {
            array_sum[length3] = (arr2[length2]+carry)%10;
            carry = (arr2[length2]+carry)/10;
            length2--;
            length3--;
        }
        if(carry!=0)
        {
            array_sum[0] = carry;
        }
        for(int i = 0; i < array_sum.length; i++)
        {
            System.out.print(array_sum[i]+" ");
        }
    }
}
