package Coforge;

import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ; i < length ; i++)
        {
            array[i] = sc.nextInt();
        }
        int sum = 0 ;
        int max_element = array[0];
        for(int i = 0 ; i<length ;i++)
        {
            sum = sum+array[i];
            if(array[i]> max_element)
            {
                max_element = array[i];
            }
        }
        System.out.println(sum+" "+max_element+" "+sum/length);
    }
}
