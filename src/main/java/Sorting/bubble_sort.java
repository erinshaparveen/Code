package Sorting;

import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ;i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        bubble_sort(array, length);
    }

    public static void bubble_sort(int[] array , int arr_length) {
        for(int i = 1 ; i < arr_length-1; i++)
        {
            for(int j = 0; j<arr_length-1; j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int i = 0 ; i < arr_length ; i++)
        {
            System.out.print(array[i]+" ");
        }

    }
}
