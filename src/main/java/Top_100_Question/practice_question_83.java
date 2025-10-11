package Top_100_Question;

import java.util.Scanner;

public class practice_question_83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ;i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        int[] result = shorted_array(array, length);

        for(int i =0 ;i <length ;i++)
        {
            int max_element = -10000;
            int current = array[i];
            for(int j = 0 ;j<length ;j++){
                if(current < array[j])
                {
                    max_element = array[j];
                    break;
                }
            }
            result[i] = max_element;
        }
        for(int i =0 ;i <length ;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] shorted_array(int[] arr, int length)
    {
        int[] result = new int[length];
        for(int i = 0 ;i<length ;i++)
        {
            for(int j = 0 ; j < length-1 ;j ++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        return arr;
    }
}
