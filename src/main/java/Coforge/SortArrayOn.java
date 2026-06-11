package Coforge;

import java.util.Scanner;

public class SortArrayOn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ; i< length ; i++)
        {
            array[i] = sc.nextInt();
        }
        int low = 0 ;
        int mid = 0 ;
        int high = length-1;
        while(mid<=high)
        {
            if (array[mid]==0)
            {
                swap(array, low, mid);
                mid++;
                low++;
            }
            else if(array[mid]==1)
            {
                mid++;
            }
            else {
                swap(array, mid, high);
                high--;
            }
        }
        for(int i = 0 ; i< length ; i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void swap(int[] array , int mid, int high)
    {
        int  temp = array [mid];
        array[mid] = array[high];
        array[high] = temp;
    }
}
