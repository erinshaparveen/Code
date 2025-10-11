package Sorting;

import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ;i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        selection_sort(array, length);
    }
    public static void selection_sort(int[] array , int arr_length) {
        for(int i = 0 ; i < arr_length-1; i++)
        {
            int min_index = i;
            for(int j = i+1; j<arr_length; j++)
            {
                if(array[min_index] > array[j])
                {
                    min_index = j;
                }
            }
            if(min_index!=i)
            {
                int temp = array[min_index];
                array[min_index] = array[i];
                array[i] = temp;
            }
        }
        for(int i = 0 ; i < arr_length ; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
