package Sorting;

import java.util.Scanner;

public class index_after_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ;i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        int value = sc.nextInt();
        print_index(array, length, value);
    }
    public static void print_index(int[] array , int arr_length, int value) {
        for(int i =1 ;i <arr_length ; i++)
        {
            for(int j=0 ; j<arr_length-1 ;j++)
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
            if(array[i] == value)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
