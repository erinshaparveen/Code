package Top_100_Question;

import java.util.ArrayList;
import java.util.Scanner;

public class practice_question_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i <length ;i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> array_lst = new ArrayList<>();
        array_lst = list_only_cotain_prime(arr, length);
        for(int num: array_lst)
            System.out.print(num+" ");
    }
    public static ArrayList<Integer> list_only_cotain_prime(int[] arr, int length)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i <length ; i++)
        {
            boolean flag = true;
            int val = 2;
            while(val<=(arr[i]/2))
            {
                if(arr[i]%val == 0)
                {
                    flag = false;
                }
                val++;
            }
            if(flag)
            {
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
    }
}
