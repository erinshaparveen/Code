package Top_100_Question;

import java.util.Scanner;

public class practice_question_43 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i < length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int wanted_value_index = sc.nextInt();
        System.out.println(sorted_and_return_index(arr, wanted_value_index));
    }

    public static int sorted_and_return_index(int[] arr, int wanted_index_of_value)
    {
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            for(int j = i ; j< arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0 ; i <arr.length ;i++)
        {
            if(wanted_index_of_value == arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}
