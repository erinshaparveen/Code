package Top_100_Question;

import java.util.Scanner;

public class practice_question_79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i =0; i<length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int rotation = sc.nextInt();
        left_rotate(arr, length, rotation);
        System.out.println();
        right_rotate(arr, length, rotation);
    }

    public static void left_rotate(int[] array ,int length, int rotation)
    {
        int value = 1;
        while(value<= rotation)

        {
            int first_element = array[0];
            for(int i = 0 ; i < length-1;i++)
            {
                array[i] =array[i+1];
            }
            array[length-1]= first_element;
            value++;
        }
        for(int i = 0 ; i <length ;i++)
        {
            System.out.print(array[i]+" ");
        }
    }

    public static void right_rotate(int[] array ,int length, int rotation)
    {
        int value = 1;
        while(value<= rotation)
        {
            int last_element = array[length-1];
            for(int i = length-1 ; i >0 ;i--)
            {
                array[i] =array[i-1];
            }
            array[0]= last_element;
            value++;
        }
        for(int i = 0 ; i <length ;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
