package OneEight;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ; i< length; i++)
        {
            array[i] = sc.nextInt();
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0 ;i <length;i++)
        {
            if(array[i]>first)
            {
                second = first;
                first = array[i];
            } else if (array[i]>second && array[i]!=first) {
                second = array[i];
            }
        }
        System.out.println(second);
    }
}
