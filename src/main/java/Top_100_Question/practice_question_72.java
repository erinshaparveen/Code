package Top_100_Question;

import java.util.Scanner;

public class practice_question_72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i<length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(largest_twice_of_other(arr, length));
    }
    public static int largest_twice_of_other(int[] arr, int length)
    {
        int larg_element_index =  largest_twice_of_other_index(arr,length);
        boolean flag = true;
        for(int i = 0 ; i < length ; i++)
        {
            if(i == larg_element_index)
            {
                continue;
            }
            else {
                if(2*arr[i]>arr[larg_element_index])
                {
                    flag =false;
                    return -1;
                }
            }
        }
        return larg_element_index;
    }
    public static int largest_twice_of_other_index(int[] arr, int length)
    {
        int index = 0;
        int max_element = arr[0];
        for(int i =0 ; i < length ; i++)
        {
            if(arr[i] > max_element)
            {
                max_element = arr[i];
                index = i;
            }
        }
        return  index;
    }
}
