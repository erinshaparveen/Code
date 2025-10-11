package Sorting;

import java.util.Scanner;

public class smallest_greater_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ;i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        int[] array_copy =array.clone();
        int[] result = smallest_greater(array_copy, length);
        int[] final_result = new int[length];

        for(int i = 0; i < length; i++) {
            int current = array[i];
            int smallestGreater = -10000000;

            for(int j = 0; j < length; j++) {
                if(result[j] > current) {
                    smallestGreater = result[j];
                    break;
                }
            }

            final_result[i] = smallestGreater;
        }
        for(int i = 0; i < length; i++) {
            System.out.print(final_result[i]+ " ");
        }
    }

    public static int[] smallest_greater(int[] array,  int length)
    {
        for(int i = 0 ; i < length ; i++)
        {
            for(int j = 0 ; j < length-1; j++)
            {
                if(array[j] >array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
