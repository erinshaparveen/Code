package Sorting;

import java.util.Scanner;

public class maximum_occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ;i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        maximum_occurrence(array, length);
    }
    public static void maximum_occurrence(int[] array , int arr_length) {
        for (int i = 1; i < arr_length; i++) {
            for (int j = 0; j < arr_length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        int result = array[0];
        int max_occurrence = 1;
        int current_count = 1;
        for(int i = 1 ; i < arr_length ; i++)
        {
            if(array[i] == array[i-1])
            {
                current_count++;
            }
            else
            {
                if(current_count>max_occurrence)
                {
                    max_occurrence = current_count;
                    result = array[i-1];
                }
                current_count = 1;
            }
        }
        System.out.println(result);
    }
}
