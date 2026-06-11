package OneEight;

import java.util.Scanner;

public class moveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ; i<length ;i++)
        {
            array[i] = sc.nextInt();
        }
        int index = 0 ;
        for(int i = 0 ; i < length ; i ++)
        {
            if(array[i]!=0)
            {
                array[index] = array[i];
                index++;
            }
        }
        while(index<length)
        {
            array[index] =0;
            index++;
        }
        for(int i = 0 ; i < length ; i++)
        {
            System.out.print(array[i]+ " ");
        }
    }
}
